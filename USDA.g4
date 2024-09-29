grammar USDA;

// Parser Rules
usdFile : layer;

layer : LAYER? layerBody;

layerBody : '{' statement* '}';

statement
    : prim
    | propertySpec
    | variantSet
    | reference
    | subLayer
    | customLayerData
    | comment
    ;

prim : 'def' primType primName? ('(' inherits ')')? primBody?;

primType : IDENTIFIER;

primName : STRING | IDENTIFIER;

inherits : IDENTIFIER (',' IDENTIFIER)*;

primBody : '{' primStatement* '}';

primStatement
    : propertySpec
    | prim
    | variantSet
    | reference
    | customData
    | comment
    ;

propertySpec : IDENTIFIER ('=' | '=(' metadataList ')')? value;

value
    : NUMBER
    | STRING
    | IDENTIFIER
    | arrayValue
    | dictionaryValue
    | timeSample
    ;

arrayValue : '[' (value (',' value)*)? ']';

dictionaryValue : '{' (keyValuePair (',' keyValuePair)*)? '}';

keyValuePair : (STRING | IDENTIFIER) ':' value;

timeSample : '{' timeSampleItem+ '}';

timeSampleItem : NUMBER ':' value;

variantSet : 'variantSet' IDENTIFIER '=' '{' variant+ '}';

variant : 'variant' STRING '=' '{' statement* '}';

reference : 'rel' IDENTIFIER '=' (IDENTIFIER | STRING);

subLayer : 'subLayers' '=' '[' STRING (',' STRING)* ']';

customLayerData : 'customLayerData' dictionaryValue;

customData : 'customData' dictionaryValue;

metadataList : metadata (',' metadata)*;

metadata : IDENTIFIER ('=' value)?;

comment : COMMENT;

// Lexer Rules
LAYER : 'layer';
IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_:]*;
STRING : '"' (~["\r\n] | '\\"')* '"';
NUMBER : [-+]?[0-9]*[.]?[0-9]+([eE][-+]?[0-9]+)?;
COMMENT : ('#' ~[\r\n]* | '//' ~[\r\n]*) -> skip;
WS : [ \t\r\n]+ -> skip;
