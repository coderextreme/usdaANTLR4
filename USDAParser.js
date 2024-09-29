// Generated from USDA.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import USDAListener from './USDAListener.js';
import USDAVisitor from './USDAVisitor.js';

const serializedATN = [4,1,23,243,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,
4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,
2,13,7,13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,
20,7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,1,0,1,0,1,1,3,
1,56,8,1,1,1,1,1,1,2,1,2,5,2,62,8,2,10,2,12,2,65,9,2,1,2,1,2,1,3,1,3,1,3,
1,3,1,3,1,3,1,3,3,3,76,8,3,1,4,1,4,1,4,3,4,81,8,4,1,4,1,4,1,4,1,4,3,4,87,
8,4,1,4,3,4,90,8,4,1,5,1,5,1,6,1,6,1,7,1,7,1,7,5,7,99,8,7,10,7,12,7,102,
9,7,1,8,1,8,5,8,106,8,8,10,8,12,8,109,9,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,1,
9,3,9,119,8,9,1,10,1,10,1,10,1,10,1,10,1,10,3,10,127,8,10,1,10,1,10,1,11,
1,11,1,11,1,11,1,11,1,11,3,11,137,8,11,1,12,1,12,1,12,1,12,5,12,143,8,12,
10,12,12,12,146,9,12,3,12,148,8,12,1,12,1,12,1,13,1,13,1,13,1,13,5,13,156,
8,13,10,13,12,13,159,9,13,3,13,161,8,13,1,13,1,13,1,14,1,14,1,14,1,14,1,
15,1,15,4,15,171,8,15,11,15,12,15,172,1,15,1,15,1,16,1,16,1,16,1,16,1,17,
1,17,1,17,1,17,1,17,4,17,186,8,17,11,17,12,17,187,1,17,1,17,1,18,1,18,1,
18,1,18,1,18,5,18,197,8,18,10,18,12,18,200,9,18,1,18,1,18,1,19,1,19,1,19,
1,19,1,19,1,20,1,20,1,20,1,20,1,20,1,20,5,20,215,8,20,10,20,12,20,218,9,
20,1,20,1,20,1,21,1,21,1,21,1,22,1,22,1,22,1,23,1,23,1,23,5,23,231,8,23,
10,23,12,23,234,9,23,1,24,1,24,1,24,3,24,239,8,24,1,25,1,25,1,25,0,0,26,
0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,
0,1,1,0,19,20,251,0,52,1,0,0,0,2,55,1,0,0,0,4,59,1,0,0,0,6,75,1,0,0,0,8,
77,1,0,0,0,10,91,1,0,0,0,12,93,1,0,0,0,14,95,1,0,0,0,16,103,1,0,0,0,18,118,
1,0,0,0,20,120,1,0,0,0,22,136,1,0,0,0,24,138,1,0,0,0,26,151,1,0,0,0,28,164,
1,0,0,0,30,168,1,0,0,0,32,176,1,0,0,0,34,180,1,0,0,0,36,191,1,0,0,0,38,203,
1,0,0,0,40,208,1,0,0,0,42,221,1,0,0,0,44,224,1,0,0,0,46,227,1,0,0,0,48,235,
1,0,0,0,50,240,1,0,0,0,52,53,3,2,1,0,53,1,1,0,0,0,54,56,5,18,0,0,55,54,1,
0,0,0,55,56,1,0,0,0,56,57,1,0,0,0,57,58,3,4,2,0,58,3,1,0,0,0,59,63,5,1,0,
0,60,62,3,6,3,0,61,60,1,0,0,0,62,65,1,0,0,0,63,61,1,0,0,0,63,64,1,0,0,0,
64,66,1,0,0,0,65,63,1,0,0,0,66,67,5,2,0,0,67,5,1,0,0,0,68,76,3,8,4,0,69,
76,3,20,10,0,70,76,3,34,17,0,71,76,3,38,19,0,72,76,3,40,20,0,73,76,3,42,
21,0,74,76,3,50,25,0,75,68,1,0,0,0,75,69,1,0,0,0,75,70,1,0,0,0,75,71,1,0,
0,0,75,72,1,0,0,0,75,73,1,0,0,0,75,74,1,0,0,0,76,7,1,0,0,0,77,78,5,3,0,0,
78,80,3,10,5,0,79,81,3,12,6,0,80,79,1,0,0,0,80,81,1,0,0,0,81,86,1,0,0,0,
82,83,5,4,0,0,83,84,3,14,7,0,84,85,5,5,0,0,85,87,1,0,0,0,86,82,1,0,0,0,86,
87,1,0,0,0,87,89,1,0,0,0,88,90,3,16,8,0,89,88,1,0,0,0,89,90,1,0,0,0,90,9,
1,0,0,0,91,92,5,19,0,0,92,11,1,0,0,0,93,94,7,0,0,0,94,13,1,0,0,0,95,100,
5,19,0,0,96,97,5,6,0,0,97,99,5,19,0,0,98,96,1,0,0,0,99,102,1,0,0,0,100,98,
1,0,0,0,100,101,1,0,0,0,101,15,1,0,0,0,102,100,1,0,0,0,103,107,5,1,0,0,104,
106,3,18,9,0,105,104,1,0,0,0,106,109,1,0,0,0,107,105,1,0,0,0,107,108,1,0,
0,0,108,110,1,0,0,0,109,107,1,0,0,0,110,111,5,2,0,0,111,17,1,0,0,0,112,119,
3,20,10,0,113,119,3,8,4,0,114,119,3,34,17,0,115,119,3,38,19,0,116,119,3,
44,22,0,117,119,3,50,25,0,118,112,1,0,0,0,118,113,1,0,0,0,118,114,1,0,0,
0,118,115,1,0,0,0,118,116,1,0,0,0,118,117,1,0,0,0,119,19,1,0,0,0,120,126,
5,19,0,0,121,127,5,7,0,0,122,123,5,8,0,0,123,124,3,46,23,0,124,125,5,5,0,
0,125,127,1,0,0,0,126,121,1,0,0,0,126,122,1,0,0,0,126,127,1,0,0,0,127,128,
1,0,0,0,128,129,3,22,11,0,129,21,1,0,0,0,130,137,5,21,0,0,131,137,5,20,0,
0,132,137,5,19,0,0,133,137,3,24,12,0,134,137,3,26,13,0,135,137,3,30,15,0,
136,130,1,0,0,0,136,131,1,0,0,0,136,132,1,0,0,0,136,133,1,0,0,0,136,134,
1,0,0,0,136,135,1,0,0,0,137,23,1,0,0,0,138,147,5,9,0,0,139,144,3,22,11,0,
140,141,5,6,0,0,141,143,3,22,11,0,142,140,1,0,0,0,143,146,1,0,0,0,144,142,
1,0,0,0,144,145,1,0,0,0,145,148,1,0,0,0,146,144,1,0,0,0,147,139,1,0,0,0,
147,148,1,0,0,0,148,149,1,0,0,0,149,150,5,10,0,0,150,25,1,0,0,0,151,160,
5,1,0,0,152,157,3,28,14,0,153,154,5,6,0,0,154,156,3,28,14,0,155,153,1,0,
0,0,156,159,1,0,0,0,157,155,1,0,0,0,157,158,1,0,0,0,158,161,1,0,0,0,159,
157,1,0,0,0,160,152,1,0,0,0,160,161,1,0,0,0,161,162,1,0,0,0,162,163,5,2,
0,0,163,27,1,0,0,0,164,165,7,0,0,0,165,166,5,11,0,0,166,167,3,22,11,0,167,
29,1,0,0,0,168,170,5,1,0,0,169,171,3,32,16,0,170,169,1,0,0,0,171,172,1,0,
0,0,172,170,1,0,0,0,172,173,1,0,0,0,173,174,1,0,0,0,174,175,5,2,0,0,175,
31,1,0,0,0,176,177,5,21,0,0,177,178,5,11,0,0,178,179,3,22,11,0,179,33,1,
0,0,0,180,181,5,12,0,0,181,182,5,19,0,0,182,183,5,7,0,0,183,185,5,1,0,0,
184,186,3,36,18,0,185,184,1,0,0,0,186,187,1,0,0,0,187,185,1,0,0,0,187,188,
1,0,0,0,188,189,1,0,0,0,189,190,5,2,0,0,190,35,1,0,0,0,191,192,5,13,0,0,
192,193,5,20,0,0,193,194,5,7,0,0,194,198,5,1,0,0,195,197,3,6,3,0,196,195,
1,0,0,0,197,200,1,0,0,0,198,196,1,0,0,0,198,199,1,0,0,0,199,201,1,0,0,0,
200,198,1,0,0,0,201,202,5,2,0,0,202,37,1,0,0,0,203,204,5,14,0,0,204,205,
5,19,0,0,205,206,5,7,0,0,206,207,7,0,0,0,207,39,1,0,0,0,208,209,5,15,0,0,
209,210,5,7,0,0,210,211,5,9,0,0,211,216,5,20,0,0,212,213,5,6,0,0,213,215,
5,20,0,0,214,212,1,0,0,0,215,218,1,0,0,0,216,214,1,0,0,0,216,217,1,0,0,0,
217,219,1,0,0,0,218,216,1,0,0,0,219,220,5,10,0,0,220,41,1,0,0,0,221,222,
5,16,0,0,222,223,3,26,13,0,223,43,1,0,0,0,224,225,5,17,0,0,225,226,3,26,
13,0,226,45,1,0,0,0,227,232,3,48,24,0,228,229,5,6,0,0,229,231,3,48,24,0,
230,228,1,0,0,0,231,234,1,0,0,0,232,230,1,0,0,0,232,233,1,0,0,0,233,47,1,
0,0,0,234,232,1,0,0,0,235,238,5,19,0,0,236,237,5,7,0,0,237,239,3,22,11,0,
238,236,1,0,0,0,238,239,1,0,0,0,239,49,1,0,0,0,240,241,5,22,0,0,241,51,1,
0,0,0,21,55,63,75,80,86,89,100,107,118,126,136,144,147,157,160,172,187,198,
216,232,238];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class USDAParser extends antlr4.Parser {

    static grammarFileName = "USDA.g4";
    static literalNames = [ null, "'{'", "'}'", "'def'", "'('", "')'", "','", 
                            "'='", "'=('", "'['", "']'", "':'", "'variantSet'", 
                            "'variant'", "'rel'", "'subLayers'", "'customLayerData'", 
                            "'customData'", "'layer'" ];
    static symbolicNames = [ null, null, null, null, null, null, null, null, 
                             null, null, null, null, null, null, null, null, 
                             null, null, "LAYER", "IDENTIFIER", "STRING", 
                             "NUMBER", "COMMENT", "WS" ];
    static ruleNames = [ "usdFile", "layer", "layerBody", "statement", "prim", 
                         "primType", "primName", "inherits", "primBody", 
                         "primStatement", "propertySpec", "value", "arrayValue", 
                         "dictionaryValue", "keyValuePair", "timeSample", 
                         "timeSampleItem", "variantSet", "variant", "reference", 
                         "subLayer", "customLayerData", "customData", "metadataList", 
                         "metadata", "comment" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = USDAParser.ruleNames;
        this.literalNames = USDAParser.literalNames;
        this.symbolicNames = USDAParser.symbolicNames;
    }



	usdFile() {
	    let localctx = new UsdFileContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, USDAParser.RULE_usdFile);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 52;
	        this.layer();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	layer() {
	    let localctx = new LayerContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, USDAParser.RULE_layer);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 55;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===18) {
	            this.state = 54;
	            this.match(USDAParser.LAYER);
	        }

	        this.state = 57;
	        this.layerBody();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	layerBody() {
	    let localctx = new LayerBodyContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, USDAParser.RULE_layerBody);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 59;
	        this.match(USDAParser.T__0);
	        this.state = 63;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 4837384) !== 0)) {
	            this.state = 60;
	            this.statement();
	            this.state = 65;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 66;
	        this.match(USDAParser.T__1);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	statement() {
	    let localctx = new StatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, USDAParser.RULE_statement);
	    try {
	        this.state = 75;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 3:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 68;
	            this.prim();
	            break;
	        case 19:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 69;
	            this.propertySpec();
	            break;
	        case 12:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 70;
	            this.variantSet();
	            break;
	        case 14:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 71;
	            this.reference();
	            break;
	        case 15:
	            this.enterOuterAlt(localctx, 5);
	            this.state = 72;
	            this.subLayer();
	            break;
	        case 16:
	            this.enterOuterAlt(localctx, 6);
	            this.state = 73;
	            this.customLayerData();
	            break;
	        case 22:
	            this.enterOuterAlt(localctx, 7);
	            this.state = 74;
	            this.comment();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	prim() {
	    let localctx = new PrimContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, USDAParser.RULE_prim);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 77;
	        this.match(USDAParser.T__2);
	        this.state = 78;
	        this.primType();
	        this.state = 80;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,3,this._ctx);
	        if(la_===1) {
	            this.state = 79;
	            this.primName();

	        }
	        this.state = 86;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===4) {
	            this.state = 82;
	            this.match(USDAParser.T__3);
	            this.state = 83;
	            this.inherits();
	            this.state = 84;
	            this.match(USDAParser.T__4);
	        }

	        this.state = 89;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===1) {
	            this.state = 88;
	            this.primBody();
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	primType() {
	    let localctx = new PrimTypeContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, USDAParser.RULE_primType);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 91;
	        this.match(USDAParser.IDENTIFIER);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	primName() {
	    let localctx = new PrimNameContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, USDAParser.RULE_primName);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 93;
	        _la = this._input.LA(1);
	        if(!(_la===19 || _la===20)) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	inherits() {
	    let localctx = new InheritsContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, USDAParser.RULE_inherits);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 95;
	        this.match(USDAParser.IDENTIFIER);
	        this.state = 100;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===6) {
	            this.state = 96;
	            this.match(USDAParser.T__5);
	            this.state = 97;
	            this.match(USDAParser.IDENTIFIER);
	            this.state = 102;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	primBody() {
	    let localctx = new PrimBodyContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, USDAParser.RULE_primBody);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 103;
	        this.match(USDAParser.T__0);
	        this.state = 107;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 4870152) !== 0)) {
	            this.state = 104;
	            this.primStatement();
	            this.state = 109;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 110;
	        this.match(USDAParser.T__1);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	primStatement() {
	    let localctx = new PrimStatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 18, USDAParser.RULE_primStatement);
	    try {
	        this.state = 118;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 19:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 112;
	            this.propertySpec();
	            break;
	        case 3:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 113;
	            this.prim();
	            break;
	        case 12:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 114;
	            this.variantSet();
	            break;
	        case 14:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 115;
	            this.reference();
	            break;
	        case 17:
	            this.enterOuterAlt(localctx, 5);
	            this.state = 116;
	            this.customData();
	            break;
	        case 22:
	            this.enterOuterAlt(localctx, 6);
	            this.state = 117;
	            this.comment();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	propertySpec() {
	    let localctx = new PropertySpecContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 20, USDAParser.RULE_propertySpec);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 120;
	        this.match(USDAParser.IDENTIFIER);
	        this.state = 126;
	        this._errHandler.sync(this);
	        switch (this._input.LA(1)) {
	        case 7:
	        	this.state = 121;
	        	this.match(USDAParser.T__6);
	        	break;
	        case 8:
	        	this.state = 122;
	        	this.match(USDAParser.T__7);
	        	this.state = 123;
	        	this.metadataList();
	        	this.state = 124;
	        	this.match(USDAParser.T__4);
	        	break;
	        case 1:
	        case 9:
	        case 19:
	        case 20:
	        case 21:
	        	break;
	        default:
	        	break;
	        }
	        this.state = 128;
	        this.value();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	value() {
	    let localctx = new ValueContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 22, USDAParser.RULE_value);
	    try {
	        this.state = 136;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,10,this._ctx);
	        switch(la_) {
	        case 1:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 130;
	            this.match(USDAParser.NUMBER);
	            break;

	        case 2:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 131;
	            this.match(USDAParser.STRING);
	            break;

	        case 3:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 132;
	            this.match(USDAParser.IDENTIFIER);
	            break;

	        case 4:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 133;
	            this.arrayValue();
	            break;

	        case 5:
	            this.enterOuterAlt(localctx, 5);
	            this.state = 134;
	            this.dictionaryValue();
	            break;

	        case 6:
	            this.enterOuterAlt(localctx, 6);
	            this.state = 135;
	            this.timeSample();
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	arrayValue() {
	    let localctx = new ArrayValueContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 24, USDAParser.RULE_arrayValue);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 138;
	        this.match(USDAParser.T__8);
	        this.state = 147;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) === 0 && ((1 << _la) & 3670530) !== 0)) {
	            this.state = 139;
	            this.value();
	            this.state = 144;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            while(_la===6) {
	                this.state = 140;
	                this.match(USDAParser.T__5);
	                this.state = 141;
	                this.value();
	                this.state = 146;
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	            }
	        }

	        this.state = 149;
	        this.match(USDAParser.T__9);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	dictionaryValue() {
	    let localctx = new DictionaryValueContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 26, USDAParser.RULE_dictionaryValue);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 151;
	        this.match(USDAParser.T__0);
	        this.state = 160;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===19 || _la===20) {
	            this.state = 152;
	            this.keyValuePair();
	            this.state = 157;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            while(_la===6) {
	                this.state = 153;
	                this.match(USDAParser.T__5);
	                this.state = 154;
	                this.keyValuePair();
	                this.state = 159;
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	            }
	        }

	        this.state = 162;
	        this.match(USDAParser.T__1);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	keyValuePair() {
	    let localctx = new KeyValuePairContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 28, USDAParser.RULE_keyValuePair);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 164;
	        _la = this._input.LA(1);
	        if(!(_la===19 || _la===20)) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	        this.state = 165;
	        this.match(USDAParser.T__10);
	        this.state = 166;
	        this.value();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	timeSample() {
	    let localctx = new TimeSampleContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 30, USDAParser.RULE_timeSample);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 168;
	        this.match(USDAParser.T__0);
	        this.state = 170; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 169;
	            this.timeSampleItem();
	            this.state = 172; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===21);
	        this.state = 174;
	        this.match(USDAParser.T__1);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	timeSampleItem() {
	    let localctx = new TimeSampleItemContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 32, USDAParser.RULE_timeSampleItem);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 176;
	        this.match(USDAParser.NUMBER);
	        this.state = 177;
	        this.match(USDAParser.T__10);
	        this.state = 178;
	        this.value();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	variantSet() {
	    let localctx = new VariantSetContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 34, USDAParser.RULE_variantSet);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 180;
	        this.match(USDAParser.T__11);
	        this.state = 181;
	        this.match(USDAParser.IDENTIFIER);
	        this.state = 182;
	        this.match(USDAParser.T__6);
	        this.state = 183;
	        this.match(USDAParser.T__0);
	        this.state = 185; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 184;
	            this.variant();
	            this.state = 187; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===13);
	        this.state = 189;
	        this.match(USDAParser.T__1);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	variant() {
	    let localctx = new VariantContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 36, USDAParser.RULE_variant);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 191;
	        this.match(USDAParser.T__12);
	        this.state = 192;
	        this.match(USDAParser.STRING);
	        this.state = 193;
	        this.match(USDAParser.T__6);
	        this.state = 194;
	        this.match(USDAParser.T__0);
	        this.state = 198;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 4837384) !== 0)) {
	            this.state = 195;
	            this.statement();
	            this.state = 200;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 201;
	        this.match(USDAParser.T__1);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	reference() {
	    let localctx = new ReferenceContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 38, USDAParser.RULE_reference);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 203;
	        this.match(USDAParser.T__13);
	        this.state = 204;
	        this.match(USDAParser.IDENTIFIER);
	        this.state = 205;
	        this.match(USDAParser.T__6);
	        this.state = 206;
	        _la = this._input.LA(1);
	        if(!(_la===19 || _la===20)) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	subLayer() {
	    let localctx = new SubLayerContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 40, USDAParser.RULE_subLayer);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 208;
	        this.match(USDAParser.T__14);
	        this.state = 209;
	        this.match(USDAParser.T__6);
	        this.state = 210;
	        this.match(USDAParser.T__8);
	        this.state = 211;
	        this.match(USDAParser.STRING);
	        this.state = 216;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===6) {
	            this.state = 212;
	            this.match(USDAParser.T__5);
	            this.state = 213;
	            this.match(USDAParser.STRING);
	            this.state = 218;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 219;
	        this.match(USDAParser.T__9);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	customLayerData() {
	    let localctx = new CustomLayerDataContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 42, USDAParser.RULE_customLayerData);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 221;
	        this.match(USDAParser.T__15);
	        this.state = 222;
	        this.dictionaryValue();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	customData() {
	    let localctx = new CustomDataContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 44, USDAParser.RULE_customData);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 224;
	        this.match(USDAParser.T__16);
	        this.state = 225;
	        this.dictionaryValue();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	metadataList() {
	    let localctx = new MetadataListContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 46, USDAParser.RULE_metadataList);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 227;
	        this.metadata();
	        this.state = 232;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===6) {
	            this.state = 228;
	            this.match(USDAParser.T__5);
	            this.state = 229;
	            this.metadata();
	            this.state = 234;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	metadata() {
	    let localctx = new MetadataContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 48, USDAParser.RULE_metadata);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 235;
	        this.match(USDAParser.IDENTIFIER);
	        this.state = 238;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===7) {
	            this.state = 236;
	            this.match(USDAParser.T__6);
	            this.state = 237;
	            this.value();
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	comment() {
	    let localctx = new CommentContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 50, USDAParser.RULE_comment);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 240;
	        this.match(USDAParser.COMMENT);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

USDAParser.EOF = antlr4.Token.EOF;
USDAParser.T__0 = 1;
USDAParser.T__1 = 2;
USDAParser.T__2 = 3;
USDAParser.T__3 = 4;
USDAParser.T__4 = 5;
USDAParser.T__5 = 6;
USDAParser.T__6 = 7;
USDAParser.T__7 = 8;
USDAParser.T__8 = 9;
USDAParser.T__9 = 10;
USDAParser.T__10 = 11;
USDAParser.T__11 = 12;
USDAParser.T__12 = 13;
USDAParser.T__13 = 14;
USDAParser.T__14 = 15;
USDAParser.T__15 = 16;
USDAParser.T__16 = 17;
USDAParser.LAYER = 18;
USDAParser.IDENTIFIER = 19;
USDAParser.STRING = 20;
USDAParser.NUMBER = 21;
USDAParser.COMMENT = 22;
USDAParser.WS = 23;

USDAParser.RULE_usdFile = 0;
USDAParser.RULE_layer = 1;
USDAParser.RULE_layerBody = 2;
USDAParser.RULE_statement = 3;
USDAParser.RULE_prim = 4;
USDAParser.RULE_primType = 5;
USDAParser.RULE_primName = 6;
USDAParser.RULE_inherits = 7;
USDAParser.RULE_primBody = 8;
USDAParser.RULE_primStatement = 9;
USDAParser.RULE_propertySpec = 10;
USDAParser.RULE_value = 11;
USDAParser.RULE_arrayValue = 12;
USDAParser.RULE_dictionaryValue = 13;
USDAParser.RULE_keyValuePair = 14;
USDAParser.RULE_timeSample = 15;
USDAParser.RULE_timeSampleItem = 16;
USDAParser.RULE_variantSet = 17;
USDAParser.RULE_variant = 18;
USDAParser.RULE_reference = 19;
USDAParser.RULE_subLayer = 20;
USDAParser.RULE_customLayerData = 21;
USDAParser.RULE_customData = 22;
USDAParser.RULE_metadataList = 23;
USDAParser.RULE_metadata = 24;
USDAParser.RULE_comment = 25;

class UsdFileContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_usdFile;
    }

	layer() {
	    return this.getTypedRuleContext(LayerContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterUsdFile(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitUsdFile(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitUsdFile(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class LayerContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_layer;
    }

	layerBody() {
	    return this.getTypedRuleContext(LayerBodyContext,0);
	};

	LAYER() {
	    return this.getToken(USDAParser.LAYER, 0);
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterLayer(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitLayer(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitLayer(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class LayerBodyContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_layerBody;
    }

	statement = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(StatementContext);
	    } else {
	        return this.getTypedRuleContext(StatementContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterLayerBody(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitLayerBody(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitLayerBody(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class StatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_statement;
    }

	prim() {
	    return this.getTypedRuleContext(PrimContext,0);
	};

	propertySpec() {
	    return this.getTypedRuleContext(PropertySpecContext,0);
	};

	variantSet() {
	    return this.getTypedRuleContext(VariantSetContext,0);
	};

	reference() {
	    return this.getTypedRuleContext(ReferenceContext,0);
	};

	subLayer() {
	    return this.getTypedRuleContext(SubLayerContext,0);
	};

	customLayerData() {
	    return this.getTypedRuleContext(CustomLayerDataContext,0);
	};

	comment() {
	    return this.getTypedRuleContext(CommentContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterStatement(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitStatement(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitStatement(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class PrimContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_prim;
    }

	primType() {
	    return this.getTypedRuleContext(PrimTypeContext,0);
	};

	primName() {
	    return this.getTypedRuleContext(PrimNameContext,0);
	};

	inherits() {
	    return this.getTypedRuleContext(InheritsContext,0);
	};

	primBody() {
	    return this.getTypedRuleContext(PrimBodyContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterPrim(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitPrim(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitPrim(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class PrimTypeContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_primType;
    }

	IDENTIFIER() {
	    return this.getToken(USDAParser.IDENTIFIER, 0);
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterPrimType(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitPrimType(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitPrimType(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class PrimNameContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_primName;
    }

	STRING() {
	    return this.getToken(USDAParser.STRING, 0);
	};

	IDENTIFIER() {
	    return this.getToken(USDAParser.IDENTIFIER, 0);
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterPrimName(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitPrimName(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitPrimName(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class InheritsContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_inherits;
    }

	IDENTIFIER = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(USDAParser.IDENTIFIER);
	    } else {
	        return this.getToken(USDAParser.IDENTIFIER, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterInherits(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitInherits(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitInherits(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class PrimBodyContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_primBody;
    }

	primStatement = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(PrimStatementContext);
	    } else {
	        return this.getTypedRuleContext(PrimStatementContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterPrimBody(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitPrimBody(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitPrimBody(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class PrimStatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_primStatement;
    }

	propertySpec() {
	    return this.getTypedRuleContext(PropertySpecContext,0);
	};

	prim() {
	    return this.getTypedRuleContext(PrimContext,0);
	};

	variantSet() {
	    return this.getTypedRuleContext(VariantSetContext,0);
	};

	reference() {
	    return this.getTypedRuleContext(ReferenceContext,0);
	};

	customData() {
	    return this.getTypedRuleContext(CustomDataContext,0);
	};

	comment() {
	    return this.getTypedRuleContext(CommentContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterPrimStatement(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitPrimStatement(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitPrimStatement(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class PropertySpecContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_propertySpec;
    }

	IDENTIFIER() {
	    return this.getToken(USDAParser.IDENTIFIER, 0);
	};

	value() {
	    return this.getTypedRuleContext(ValueContext,0);
	};

	metadataList() {
	    return this.getTypedRuleContext(MetadataListContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterPropertySpec(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitPropertySpec(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitPropertySpec(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ValueContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_value;
    }

	NUMBER() {
	    return this.getToken(USDAParser.NUMBER, 0);
	};

	STRING() {
	    return this.getToken(USDAParser.STRING, 0);
	};

	IDENTIFIER() {
	    return this.getToken(USDAParser.IDENTIFIER, 0);
	};

	arrayValue() {
	    return this.getTypedRuleContext(ArrayValueContext,0);
	};

	dictionaryValue() {
	    return this.getTypedRuleContext(DictionaryValueContext,0);
	};

	timeSample() {
	    return this.getTypedRuleContext(TimeSampleContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterValue(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitValue(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitValue(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ArrayValueContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_arrayValue;
    }

	value = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ValueContext);
	    } else {
	        return this.getTypedRuleContext(ValueContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterArrayValue(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitArrayValue(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitArrayValue(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class DictionaryValueContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_dictionaryValue;
    }

	keyValuePair = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(KeyValuePairContext);
	    } else {
	        return this.getTypedRuleContext(KeyValuePairContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterDictionaryValue(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitDictionaryValue(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitDictionaryValue(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class KeyValuePairContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_keyValuePair;
    }

	value() {
	    return this.getTypedRuleContext(ValueContext,0);
	};

	STRING() {
	    return this.getToken(USDAParser.STRING, 0);
	};

	IDENTIFIER() {
	    return this.getToken(USDAParser.IDENTIFIER, 0);
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterKeyValuePair(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitKeyValuePair(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitKeyValuePair(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class TimeSampleContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_timeSample;
    }

	timeSampleItem = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(TimeSampleItemContext);
	    } else {
	        return this.getTypedRuleContext(TimeSampleItemContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterTimeSample(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitTimeSample(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitTimeSample(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class TimeSampleItemContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_timeSampleItem;
    }

	NUMBER() {
	    return this.getToken(USDAParser.NUMBER, 0);
	};

	value() {
	    return this.getTypedRuleContext(ValueContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterTimeSampleItem(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitTimeSampleItem(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitTimeSampleItem(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class VariantSetContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_variantSet;
    }

	IDENTIFIER() {
	    return this.getToken(USDAParser.IDENTIFIER, 0);
	};

	variant = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(VariantContext);
	    } else {
	        return this.getTypedRuleContext(VariantContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterVariantSet(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitVariantSet(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitVariantSet(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class VariantContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_variant;
    }

	STRING() {
	    return this.getToken(USDAParser.STRING, 0);
	};

	statement = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(StatementContext);
	    } else {
	        return this.getTypedRuleContext(StatementContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterVariant(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitVariant(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitVariant(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ReferenceContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_reference;
    }

	IDENTIFIER = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(USDAParser.IDENTIFIER);
	    } else {
	        return this.getToken(USDAParser.IDENTIFIER, i);
	    }
	};


	STRING() {
	    return this.getToken(USDAParser.STRING, 0);
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterReference(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitReference(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitReference(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class SubLayerContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_subLayer;
    }

	STRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(USDAParser.STRING);
	    } else {
	        return this.getToken(USDAParser.STRING, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterSubLayer(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitSubLayer(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitSubLayer(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CustomLayerDataContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_customLayerData;
    }

	dictionaryValue() {
	    return this.getTypedRuleContext(DictionaryValueContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterCustomLayerData(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitCustomLayerData(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitCustomLayerData(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CustomDataContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_customData;
    }

	dictionaryValue() {
	    return this.getTypedRuleContext(DictionaryValueContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterCustomData(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitCustomData(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitCustomData(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class MetadataListContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_metadataList;
    }

	metadata = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(MetadataContext);
	    } else {
	        return this.getTypedRuleContext(MetadataContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterMetadataList(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitMetadataList(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitMetadataList(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class MetadataContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_metadata;
    }

	IDENTIFIER() {
	    return this.getToken(USDAParser.IDENTIFIER, 0);
	};

	value() {
	    return this.getTypedRuleContext(ValueContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterMetadata(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitMetadata(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitMetadata(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CommentContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = USDAParser.RULE_comment;
    }

	COMMENT() {
	    return this.getToken(USDAParser.COMMENT, 0);
	};

	enterRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.enterComment(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof USDAListener ) {
	        listener.exitComment(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof USDAVisitor ) {
	        return visitor.visitComment(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




USDAParser.UsdFileContext = UsdFileContext; 
USDAParser.LayerContext = LayerContext; 
USDAParser.LayerBodyContext = LayerBodyContext; 
USDAParser.StatementContext = StatementContext; 
USDAParser.PrimContext = PrimContext; 
USDAParser.PrimTypeContext = PrimTypeContext; 
USDAParser.PrimNameContext = PrimNameContext; 
USDAParser.InheritsContext = InheritsContext; 
USDAParser.PrimBodyContext = PrimBodyContext; 
USDAParser.PrimStatementContext = PrimStatementContext; 
USDAParser.PropertySpecContext = PropertySpecContext; 
USDAParser.ValueContext = ValueContext; 
USDAParser.ArrayValueContext = ArrayValueContext; 
USDAParser.DictionaryValueContext = DictionaryValueContext; 
USDAParser.KeyValuePairContext = KeyValuePairContext; 
USDAParser.TimeSampleContext = TimeSampleContext; 
USDAParser.TimeSampleItemContext = TimeSampleItemContext; 
USDAParser.VariantSetContext = VariantSetContext; 
USDAParser.VariantContext = VariantContext; 
USDAParser.ReferenceContext = ReferenceContext; 
USDAParser.SubLayerContext = SubLayerContext; 
USDAParser.CustomLayerDataContext = CustomLayerDataContext; 
USDAParser.CustomDataContext = CustomDataContext; 
USDAParser.MetadataListContext = MetadataListContext; 
USDAParser.MetadataContext = MetadataContext; 
USDAParser.CommentContext = CommentContext; 
