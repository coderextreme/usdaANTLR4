// Generated from USDA.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class USDAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, ARRAY=40, LAYER=41, IDENTIFIER=42, RESOURCE=43, STRING=44, NUMBER=45, 
		COMMENT=46, WS=47, NEWLINE=48;
	public static final int
		RULE_usdFile = 0, RULE_header = 1, RULE_version = 2, RULE_layer = 3, RULE_layerBody = 4, 
		RULE_statement = 5, RULE_prim = 6, RULE_primType = 7, RULE_primName = 8, 
		RULE_inherits = 9, RULE_primBody = 10, RULE_primStatement = 11, RULE_propertySpec = 12, 
		RULE_value = 13, RULE_operation = 14, RULE_resources = 15, RULE_resource = 16, 
		RULE_references = 17, RULE_payload = 18, RULE_closeTag = 19, RULE_arrayValue = 20, 
		RULE_dictionaryValue = 21, RULE_keyValuePair = 22, RULE_timeSample = 23, 
		RULE_timeSampleItem = 24, RULE_variants = 25, RULE_variant = 26, RULE_dictionary = 27, 
		RULE_reference = 28, RULE_subLayer = 29, RULE_customLayerData = 30, RULE_customData = 31, 
		RULE_metadataList = 32, RULE_metadata = 33, RULE_comment = 34, RULE_type = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"usdFile", "header", "version", "layer", "layerBody", "statement", "prim", 
			"primType", "primName", "inherits", "primBody", "primStatement", "propertySpec", 
			"value", "operation", "resources", "resource", "references", "payload", 
			"closeTag", "arrayValue", "dictionaryValue", "keyValuePair", "timeSample", 
			"timeSampleItem", "variants", "variant", "dictionary", "reference", "subLayer", 
			"customLayerData", "customData", "metadataList", "metadata", "comment", 
			"type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#usda'", "'1.0'", "'1.1'", "'1.2'", "'def'", "'('", "')'", "','", 
			"'{'", "'}'", "'payload'", "'='", "'=('", "'prepend'", "'['", "']'", 
			"'@'", "'references'", "'</'", "'>'", "':'", "'variants'", "'variant'", 
			"'dictionary'", "'rel'", "'subLayers'", "'customLayerData'", "'customData'", 
			"'Vec3f'", "'PointIndex'", "'string'", "'int'", "'token'", "'float'", 
			"'asset'", "'double'", "'float3'", "'color3f'", "'uniform'", "'[]'", 
			"'layer'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ARRAY", "LAYER", "IDENTIFIER", "RESOURCE", "STRING", 
			"NUMBER", "COMMENT", "WS", "NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "USDA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public USDAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UsdFileContext extends ParserRuleContext {
		public LayerContext layer() {
			return getRuleContext(LayerContext.class,0);
		}
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public UsdFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usdFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterUsdFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitUsdFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitUsdFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsdFileContext usdFile() throws RecognitionException {
		UsdFileContext _localctx = new UsdFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_usdFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(72);
				header();
				}
			}

			setState(75);
			layer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HeaderContext extends ParserRuleContext {
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(USDAParser.NEWLINE, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__0);
			setState(78);
			version();
			setState(79);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VersionContext extends ParserRuleContext {
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_version);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LayerContext extends ParserRuleContext {
		public LayerBodyContext layerBody() {
			return getRuleContext(LayerBodyContext.class,0);
		}
		public TerminalNode LAYER() { return getToken(USDAParser.LAYER, 0); }
		public LayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterLayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitLayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitLayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayerContext layer() throws RecognitionException {
		LayerContext _localctx = new LayerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_layer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LAYER) {
				{
				setState(83);
				match(LAYER);
				}
			}

			setState(86);
			layerBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LayerBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LayerBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layerBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterLayerBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitLayerBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitLayerBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayerBodyContext layerBody() throws RecognitionException {
		LayerBodyContext _localctx = new LayerBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_layerBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 93458207787040L) != 0)) {
				{
				{
				setState(88);
				statement();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public CustomLayerDataContext customLayerData() {
			return getRuleContext(CustomLayerDataContext.class,0);
		}
		public PayloadContext payload() {
			return getRuleContext(PayloadContext.class,0);
		}
		public PrimContext prim() {
			return getRuleContext(PrimContext.class,0);
		}
		public List<PropertySpecContext> propertySpec() {
			return getRuleContexts(PropertySpecContext.class);
		}
		public PropertySpecContext propertySpec(int i) {
			return getRuleContext(PropertySpecContext.class,i);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public ReferencesContext references() {
			return getRuleContext(ReferencesContext.class,0);
		}
		public ResourceContext resource() {
			return getRuleContext(ResourceContext.class,0);
		}
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public SubLayerContext subLayer() {
			return getRuleContext(SubLayerContext.class,0);
		}
		public VariantsContext variants() {
			return getRuleContext(VariantsContext.class,0);
		}
		public DictionaryContext dictionary() {
			return getRuleContext(DictionaryContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			int _alt;
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				comment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				customLayerData();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				payload();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				prim();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(99); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(98);
						propertySpec();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(101); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
				reference();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(104);
				references();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(105);
				resource();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(106);
				resources();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(107);
				subLayer();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(108);
				variants();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(109);
				dictionary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimContext extends ParserRuleContext {
		public PrimNameContext primName() {
			return getRuleContext(PrimNameContext.class,0);
		}
		public PrimTypeContext primType() {
			return getRuleContext(PrimTypeContext.class,0);
		}
		public InheritsContext inherits() {
			return getRuleContext(InheritsContext.class,0);
		}
		public PrimBodyContext primBody() {
			return getRuleContext(PrimBodyContext.class,0);
		}
		public PrimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterPrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitPrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitPrim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimContext prim() throws RecognitionException {
		PrimContext _localctx = new PrimContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_prim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__4);
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(113);
				primType();
				}
				break;
			}
			setState(116);
			primName();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(117);
				match(T__5);
				setState(118);
				inherits();
				setState(119);
				match(T__6);
				}
			}

			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(123);
				primBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(USDAParser.IDENTIFIER, 0); }
		public PrimTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterPrimType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitPrimType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitPrimType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimTypeContext primType() throws RecognitionException {
		PrimTypeContext _localctx = new PrimTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(USDAParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(USDAParser.IDENTIFIER, 0); }
		public PrimNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterPrimName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitPrimName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitPrimName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimNameContext primName() throws RecognitionException {
		PrimNameContext _localctx = new PrimNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InheritsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(USDAParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(USDAParser.IDENTIFIER, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ResourceContext resource() {
			return getRuleContext(ResourceContext.class,0);
		}
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public CloseTagContext closeTag() {
			return getRuleContext(CloseTagContext.class,0);
		}
		public InheritsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterInherits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitInherits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitInherits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritsContext inherits() throws RecognitionException {
		InheritsContext _localctx = new InheritsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inherits);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(IDENTIFIER);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(131);
					match(T__7);
					setState(132);
					match(IDENTIFIER);
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 93458207787040L) != 0)) {
					{
					{
					setState(138);
					statement();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(T__8);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 93458207787040L) != 0)) {
					{
					{
					setState(145);
					statement();
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(T__10);
				setState(153);
				match(T__11);
				setState(157);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
					{
					setState(154);
					resource();
					}
					break;
				case T__14:
					{
					setState(155);
					resources();
					}
					break;
				case T__18:
					{
					setState(156);
					closeTag();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimBodyContext extends ParserRuleContext {
		public List<PrimStatementContext> primStatement() {
			return getRuleContexts(PrimStatementContext.class);
		}
		public PrimStatementContext primStatement(int i) {
			return getRuleContext(PrimStatementContext.class,i);
		}
		public PrimBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterPrimBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitPrimBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitPrimBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimBodyContext primBody() throws RecognitionException {
		PrimBodyContext _localctx = new PrimBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_primBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__8);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 93458274895904L) != 0)) {
				{
				{
				setState(162);
				primStatement();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimStatementContext extends ParserRuleContext {
		public PrimContext prim() {
			return getRuleContext(PrimContext.class,0);
		}
		public VariantsContext variants() {
			return getRuleContext(VariantsContext.class,0);
		}
		public DictionaryContext dictionary() {
			return getRuleContext(DictionaryContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public CustomDataContext customData() {
			return getRuleContext(CustomDataContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public List<PropertySpecContext> propertySpec() {
			return getRuleContexts(PropertySpecContext.class);
		}
		public PropertySpecContext propertySpec(int i) {
			return getRuleContext(PropertySpecContext.class,i);
		}
		public ReferencesContext references() {
			return getRuleContext(ReferencesContext.class,0);
		}
		public PayloadContext payload() {
			return getRuleContext(PayloadContext.class,0);
		}
		public ResourceContext resource() {
			return getRuleContext(ResourceContext.class,0);
		}
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public PrimStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterPrimStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitPrimStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitPrimStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimStatementContext primStatement() throws RecognitionException {
		PrimStatementContext _localctx = new PrimStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_primStatement);
		try {
			int _alt;
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				prim();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				variants();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				dictionary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				reference();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				customData();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
				comment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(177); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(176);
						propertySpec();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(179); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(181);
				references();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(182);
				payload();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(183);
				resource();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(184);
				resources();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertySpecContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(USDAParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(USDAParser.STRING, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public MetadataListContext metadataList() {
			return getRuleContext(MetadataListContext.class,0);
		}
		public PropertySpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterPropertySpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitPropertySpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitPropertySpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertySpecContext propertySpec() throws RecognitionException {
		PropertySpecContext _localctx = new PropertySpecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_propertySpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(187);
				operation();
				}
			}

			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1098991534080L) != 0)) {
				{
				setState(190);
				type();
				}
			}

			setState(193);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__12) {
				{
				setState(199);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(194);
					match(T__11);
					}
					break;
				case T__12:
					{
					setState(195);
					match(T__12);
					setState(196);
					metadataList();
					setState(197);
					match(T__6);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(201);
				value();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(USDAParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(USDAParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(USDAParser.IDENTIFIER, 0); }
		public ArrayValueContext arrayValue() {
			return getRuleContext(ArrayValueContext.class,0);
		}
		public DictionaryValueContext dictionaryValue() {
			return getRuleContext(DictionaryValueContext.class,0);
		}
		public TimeSampleContext timeSample() {
			return getRuleContext(TimeSampleContext.class,0);
		}
		public ResourceContext resource() {
			return getRuleContext(ResourceContext.class,0);
		}
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public CloseTagContext closeTag() {
			return getRuleContext(CloseTagContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		int _la;
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				arrayValue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
				dictionaryValue();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(209);
				timeSample();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(210);
				resource();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(211);
				resources();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(212);
				closeTag();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(213);
					match(STRING);
					}
				}

				setState(216);
				match(T__5);
				setState(217);
				value();
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(218);
					match(T__7);
					setState(219);
					value();
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(225);
				match(T__6);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitResources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitResources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_resources);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__14);
			setState(232);
			resource();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(233);
				match(T__7);
				setState(234);
				resource();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResourceContext extends ParserRuleContext {
		public TerminalNode RESOURCE() { return getToken(USDAParser.RESOURCE, 0); }
		public CloseTagContext closeTag() {
			return getRuleContext(CloseTagContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__16);
			setState(243);
			match(RESOURCE);
			setState(244);
			match(T__16);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(245);
				closeTag();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReferencesContext extends ParserRuleContext {
		public ResourceContext resource() {
			return getRuleContext(ResourceContext.class,0);
		}
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public CloseTagContext closeTag() {
			return getRuleContext(CloseTagContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public ReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_references; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterReferences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitReferences(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitReferences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferencesContext references() throws RecognitionException {
		ReferencesContext _localctx = new ReferencesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_references);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(248);
				operation();
				}
			}

			setState(251);
			match(T__17);
			setState(252);
			match(T__11);
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				{
				setState(253);
				resource();
				}
				break;
			case T__14:
				{
				setState(254);
				resources();
				}
				break;
			case T__18:
				{
				setState(255);
				closeTag();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PayloadContext extends ParserRuleContext {
		public ResourceContext resource() {
			return getRuleContext(ResourceContext.class,0);
		}
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public CloseTagContext closeTag() {
			return getRuleContext(CloseTagContext.class,0);
		}
		public PayloadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_payload; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterPayload(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitPayload(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitPayload(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PayloadContext payload() throws RecognitionException {
		PayloadContext _localctx = new PayloadContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_payload);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(T__10);
			setState(259);
			match(T__11);
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				{
				setState(260);
				resource();
				}
				break;
			case T__14:
				{
				setState(261);
				resources();
				}
				break;
			case T__18:
				{
				setState(262);
				closeTag();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CloseTagContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(USDAParser.IDENTIFIER, 0); }
		public CloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitCloseTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitCloseTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseTagContext closeTag() throws RecognitionException {
		CloseTagContext _localctx = new CloseTagContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__18);
			setState(266);
			match(IDENTIFIER);
			setState(267);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayValueContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterArrayValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitArrayValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitArrayValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayValueContext arrayValue() throws RecognitionException {
		ArrayValueContext _localctx = new ArrayValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arrayValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(T__14);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 57174605333056L) != 0)) {
				{
				setState(270);
				value();
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(271);
					match(T__7);
					setState(272);
					value();
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(280);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DictionaryValueContext extends ParserRuleContext {
		public List<KeyValuePairContext> keyValuePair() {
			return getRuleContexts(KeyValuePairContext.class);
		}
		public KeyValuePairContext keyValuePair(int i) {
			return getRuleContext(KeyValuePairContext.class,i);
		}
		public DictionaryValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterDictionaryValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitDictionaryValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitDictionaryValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryValueContext dictionaryValue() throws RecognitionException {
		DictionaryValueContext _localctx = new DictionaryValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dictionaryValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__8);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==STRING) {
				{
				setState(283);
				keyValuePair();
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(284);
					match(T__7);
					setState(285);
					keyValuePair();
					}
					}
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(293);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyValuePairContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(USDAParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(USDAParser.IDENTIFIER, 0); }
		public KeyValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterKeyValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitKeyValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitKeyValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValuePairContext keyValuePair() throws RecognitionException {
		KeyValuePairContext _localctx = new KeyValuePairContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_keyValuePair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(296);
			match(T__20);
			setState(297);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimeSampleContext extends ParserRuleContext {
		public List<TimeSampleItemContext> timeSampleItem() {
			return getRuleContexts(TimeSampleItemContext.class);
		}
		public TimeSampleItemContext timeSampleItem(int i) {
			return getRuleContext(TimeSampleItemContext.class,i);
		}
		public TimeSampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeSample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterTimeSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitTimeSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitTimeSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeSampleContext timeSample() throws RecognitionException {
		TimeSampleContext _localctx = new TimeSampleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_timeSample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(T__8);
			setState(301); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(300);
				timeSampleItem();
				}
				}
				setState(303); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(305);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimeSampleItemContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(USDAParser.NUMBER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TimeSampleItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeSampleItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterTimeSampleItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitTimeSampleItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitTimeSampleItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeSampleItemContext timeSampleItem() throws RecognitionException {
		TimeSampleItemContext _localctx = new TimeSampleItemContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_timeSampleItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(NUMBER);
			setState(308);
			match(T__20);
			setState(309);
			value();
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(310);
				match(T__7);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariantsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(USDAParser.IDENTIFIER, 0); }
		public List<VariantContext> variant() {
			return getRuleContexts(VariantContext.class);
		}
		public VariantContext variant(int i) {
			return getRuleContext(VariantContext.class,i);
		}
		public VariantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterVariants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitVariants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitVariants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariantsContext variants() throws RecognitionException {
		VariantsContext _localctx = new VariantsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(T__21);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(314);
				match(IDENTIFIER);
				}
			}

			setState(317);
			match(T__11);
			setState(318);
			match(T__8);
			setState(320); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(319);
				variant();
				}
				}
				setState(322); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__22 );
			setState(324);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariantContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(USDAParser.STRING, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public VariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterVariant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitVariant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitVariant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariantContext variant() throws RecognitionException {
		VariantContext _localctx = new VariantContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(T__22);
			setState(327);
			match(STRING);
			setState(328);
			match(T__11);
			setState(329);
			match(T__8);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 93458207787040L) != 0)) {
				{
				{
				setState(330);
				statement();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DictionaryContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(USDAParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(USDAParser.STRING, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DictionaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterDictionary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitDictionary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitDictionary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryContext dictionary() throws RecognitionException {
		DictionaryContext _localctx = new DictionaryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dictionary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(T__23);
			setState(339);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(340);
			match(T__11);
			setState(341);
			match(T__8);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 93458207787040L) != 0)) {
				{
				{
				setState(342);
				statement();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReferenceContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(USDAParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(USDAParser.IDENTIFIER, i);
		}
		public TerminalNode STRING() { return getToken(USDAParser.STRING, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(T__24);
			setState(351);
			match(IDENTIFIER);
			setState(352);
			match(T__11);
			setState(353);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubLayerContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(USDAParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(USDAParser.STRING, i);
		}
		public SubLayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subLayer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterSubLayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitSubLayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitSubLayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubLayerContext subLayer() throws RecognitionException {
		SubLayerContext _localctx = new SubLayerContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_subLayer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(T__25);
			setState(356);
			match(T__11);
			setState(357);
			match(T__14);
			setState(358);
			match(STRING);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(359);
				match(T__7);
				setState(360);
				match(STRING);
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(366);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CustomLayerDataContext extends ParserRuleContext {
		public DictionaryValueContext dictionaryValue() {
			return getRuleContext(DictionaryValueContext.class,0);
		}
		public CustomLayerDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customLayerData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterCustomLayerData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitCustomLayerData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitCustomLayerData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomLayerDataContext customLayerData() throws RecognitionException {
		CustomLayerDataContext _localctx = new CustomLayerDataContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_customLayerData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(T__26);
			setState(369);
			dictionaryValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CustomDataContext extends ParserRuleContext {
		public DictionaryValueContext dictionaryValue() {
			return getRuleContext(DictionaryValueContext.class,0);
		}
		public CustomDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterCustomData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitCustomData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitCustomData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomDataContext customData() throws RecognitionException {
		CustomDataContext _localctx = new CustomDataContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_customData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(T__27);
			setState(372);
			dictionaryValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MetadataListContext extends ParserRuleContext {
		public List<MetadataContext> metadata() {
			return getRuleContexts(MetadataContext.class);
		}
		public MetadataContext metadata(int i) {
			return getRuleContext(MetadataContext.class,i);
		}
		public MetadataListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadataList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterMetadataList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitMetadataList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitMetadataList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetadataListContext metadataList() throws RecognitionException {
		MetadataListContext _localctx = new MetadataListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_metadataList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			metadata();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(375);
				match(T__7);
				setState(376);
				metadata();
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MetadataContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(USDAParser.IDENTIFIER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public MetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitMetadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitMetadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetadataContext metadata() throws RecognitionException {
		MetadataContext _localctx = new MetadataContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_metadata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(IDENTIFIER);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(383);
				match(T__11);
				setState(384);
				value();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(USDAParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(USDAParser.ARRAY, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(390); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(389);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1098991534080L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(392); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1098991534080L) != 0) );
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY) {
				{
				setState(394);
				match(ARRAY);
				}
			}

			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00010\u018e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0003\u0000J\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0003\u0003U\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0005"+
		"\u0004Z\b\u0004\n\u0004\f\u0004]\t\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0004\u0005d\b\u0005\u000b\u0005\f\u0005"+
		"e\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005o\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006"+
		"s\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006z\b\u0006\u0001\u0006\u0003\u0006}\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u0086\b\t\n\t\f"+
		"\t\u0089\t\t\u0001\t\u0005\t\u008c\b\t\n\t\f\t\u008f\t\t\u0001\t\u0001"+
		"\t\u0005\t\u0093\b\t\n\t\f\t\u0096\t\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0003\t\u009e\b\t\u0003\t\u00a0\b\t\u0001\n\u0001\n\u0005"+
		"\n\u00a4\b\n\n\n\f\n\u00a7\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b"+
		"\u00b2\b\u000b\u000b\u000b\f\u000b\u00b3\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00ba\b\u000b\u0001\f\u0003\f\u00bd\b\f"+
		"\u0001\f\u0003\f\u00c0\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00c8\b\f\u0001\f\u0003\f\u00cb\b\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00d7"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00dd\b\r\n\r\f\r\u00e0\t"+
		"\r\u0001\r\u0001\r\u0003\r\u00e4\b\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00ec\b\u000f\n\u000f"+
		"\f\u000f\u00ef\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00f7\b\u0010\u0001\u0011\u0003\u0011"+
		"\u00fa\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0101\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0108\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u0112\b\u0014\n\u0014\f\u0014\u0115\t\u0014\u0003\u0014\u0117\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u011f\b\u0015\n\u0015\f\u0015\u0122\t\u0015\u0003\u0015\u0124"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0004\u0017\u012e\b\u0017\u000b\u0017\f"+
		"\u0017\u012f\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0138\b\u0018\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u013c\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0004\u0019\u0141\b"+
		"\u0019\u000b\u0019\f\u0019\u0142\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u014c\b\u001a\n"+
		"\u001a\f\u001a\u014f\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0158\b\u001b\n"+
		"\u001b\f\u001b\u015b\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u016a\b\u001d\n"+
		"\u001d\f\u001d\u016d\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0005 \u017a\b \n \f \u017d\t \u0001!\u0001!\u0001!\u0003!\u0182\b!"+
		"\u0001\"\u0001\"\u0001#\u0004#\u0187\b#\u000b#\f#\u0188\u0001#\u0003#"+
		"\u018c\b#\u0001#\u0000\u0000$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF\u0000"+
		"\u0003\u0001\u0000\u0002\u0004\u0002\u0000**,,\u0002\u0000\u0018\u0018"+
		"\u001d\'\u01b4\u0000I\u0001\u0000\u0000\u0000\u0002M\u0001\u0000\u0000"+
		"\u0000\u0004Q\u0001\u0000\u0000\u0000\u0006T\u0001\u0000\u0000\u0000\b"+
		"[\u0001\u0000\u0000\u0000\nn\u0001\u0000\u0000\u0000\fp\u0001\u0000\u0000"+
		"\u0000\u000e~\u0001\u0000\u0000\u0000\u0010\u0080\u0001\u0000\u0000\u0000"+
		"\u0012\u009f\u0001\u0000\u0000\u0000\u0014\u00a1\u0001\u0000\u0000\u0000"+
		"\u0016\u00b9\u0001\u0000\u0000\u0000\u0018\u00bc\u0001\u0000\u0000\u0000"+
		"\u001a\u00e3\u0001\u0000\u0000\u0000\u001c\u00e5\u0001\u0000\u0000\u0000"+
		"\u001e\u00e7\u0001\u0000\u0000\u0000 \u00f2\u0001\u0000\u0000\u0000\""+
		"\u00f9\u0001\u0000\u0000\u0000$\u0102\u0001\u0000\u0000\u0000&\u0109\u0001"+
		"\u0000\u0000\u0000(\u010d\u0001\u0000\u0000\u0000*\u011a\u0001\u0000\u0000"+
		"\u0000,\u0127\u0001\u0000\u0000\u0000.\u012b\u0001\u0000\u0000\u00000"+
		"\u0133\u0001\u0000\u0000\u00002\u0139\u0001\u0000\u0000\u00004\u0146\u0001"+
		"\u0000\u0000\u00006\u0152\u0001\u0000\u0000\u00008\u015e\u0001\u0000\u0000"+
		"\u0000:\u0163\u0001\u0000\u0000\u0000<\u0170\u0001\u0000\u0000\u0000>"+
		"\u0173\u0001\u0000\u0000\u0000@\u0176\u0001\u0000\u0000\u0000B\u017e\u0001"+
		"\u0000\u0000\u0000D\u0183\u0001\u0000\u0000\u0000F\u0186\u0001\u0000\u0000"+
		"\u0000HJ\u0003\u0002\u0001\u0000IH\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0003\u0006\u0003\u0000L\u0001"+
		"\u0001\u0000\u0000\u0000MN\u0005\u0001\u0000\u0000NO\u0003\u0004\u0002"+
		"\u0000OP\u00050\u0000\u0000P\u0003\u0001\u0000\u0000\u0000QR\u0007\u0000"+
		"\u0000\u0000R\u0005\u0001\u0000\u0000\u0000SU\u0005)\u0000\u0000TS\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"VW\u0003\b\u0004\u0000W\u0007\u0001\u0000\u0000\u0000XZ\u0003\n\u0005"+
		"\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\t\u0001\u0000\u0000\u0000]["+
		"\u0001\u0000\u0000\u0000^o\u0003D\"\u0000_o\u0003<\u001e\u0000`o\u0003"+
		"$\u0012\u0000ao\u0003\f\u0006\u0000bd\u0003\u0018\f\u0000cb\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fo\u0001\u0000\u0000\u0000go\u00038\u001c\u0000ho\u0003"+
		"\"\u0011\u0000io\u0003 \u0010\u0000jo\u0003\u001e\u000f\u0000ko\u0003"+
		":\u001d\u0000lo\u00032\u0019\u0000mo\u00036\u001b\u0000n^\u0001\u0000"+
		"\u0000\u0000n_\u0001\u0000\u0000\u0000n`\u0001\u0000\u0000\u0000na\u0001"+
		"\u0000\u0000\u0000nc\u0001\u0000\u0000\u0000ng\u0001\u0000\u0000\u0000"+
		"nh\u0001\u0000\u0000\u0000ni\u0001\u0000\u0000\u0000nj\u0001\u0000\u0000"+
		"\u0000nk\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000"+
		"\u0000\u0000o\u000b\u0001\u0000\u0000\u0000pr\u0005\u0005\u0000\u0000"+
		"qs\u0003\u000e\u0007\u0000rq\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000ty\u0003\u0010\b\u0000uv\u0005\u0006\u0000"+
		"\u0000vw\u0003\u0012\t\u0000wx\u0005\u0007\u0000\u0000xz\u0001\u0000\u0000"+
		"\u0000yu\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000"+
		"\u0000\u0000{}\u0003\u0014\n\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}\r\u0001\u0000\u0000\u0000~\u007f\u0005*\u0000\u0000\u007f"+
		"\u000f\u0001\u0000\u0000\u0000\u0080\u0081\u0007\u0001\u0000\u0000\u0081"+
		"\u0011\u0001\u0000\u0000\u0000\u0082\u0087\u0005*\u0000\u0000\u0083\u0084"+
		"\u0005\b\u0000\u0000\u0084\u0086\u0005*\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u00a0\u0001"+
		"\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008c\u0003"+
		"\n\u0005\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u00a0\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u0090\u0094\u0005\t\u0000\u0000\u0091\u0093\u0003\n\u0005"+
		"\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000"+
		"\u0000\u0097\u00a0\u0005\n\u0000\u0000\u0098\u0099\u0005\u000b\u0000\u0000"+
		"\u0099\u009d\u0005\f\u0000\u0000\u009a\u009e\u0003 \u0010\u0000\u009b"+
		"\u009e\u0003\u001e\u000f\u0000\u009c\u009e\u0003&\u0013\u0000\u009d\u009a"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009c"+
		"\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u0082"+
		"\u0001\u0000\u0000\u0000\u009f\u008d\u0001\u0000\u0000\u0000\u009f\u0090"+
		"\u0001\u0000\u0000\u0000\u009f\u0098\u0001\u0000\u0000\u0000\u00a0\u0013"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a5\u0005\t\u0000\u0000\u00a2\u00a4\u0003"+
		"\u0016\u000b\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0005\n\u0000\u0000\u00a9\u0015\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ba\u0003\f\u0006\u0000\u00ab\u00ba\u00032\u0019"+
		"\u0000\u00ac\u00ba\u00036\u001b\u0000\u00ad\u00ba\u00038\u001c\u0000\u00ae"+
		"\u00ba\u0003>\u001f\u0000\u00af\u00ba\u0003D\"\u0000\u00b0\u00b2\u0003"+
		"\u0018\f\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b4\u00ba\u0001\u0000\u0000\u0000\u00b5\u00ba\u0003\"\u0011"+
		"\u0000\u00b6\u00ba\u0003$\u0012\u0000\u00b7\u00ba\u0003 \u0010\u0000\u00b8"+
		"\u00ba\u0003\u001e\u000f\u0000\u00b9\u00aa\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ab\u0001\u0000\u0000\u0000\u00b9\u00ac\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b9\u00ae\u0001\u0000\u0000\u0000\u00b9"+
		"\u00af\u0001\u0000\u0000\u0000\u00b9\u00b1\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b9\u00b6\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba"+
		"\u0017\u0001\u0000\u0000\u0000\u00bb\u00bd\u0003\u001c\u000e\u0000\u00bc"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		"\u00bf\u0001\u0000\u0000\u0000\u00be\u00c0\u0003F#\u0000\u00bf\u00be\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c1\u00ca\u0007\u0001\u0000\u0000\u00c2\u00c8\u0005"+
		"\f\u0000\u0000\u00c3\u00c4\u0005\r\u0000\u0000\u00c4\u00c5\u0003@ \u0000"+
		"\u00c5\u00c6\u0005\u0007\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c2\u0001\u0000\u0000\u0000\u00c7\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cb\u0003\u001a\r\u0000\u00ca"+
		"\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb"+
		"\u0019\u0001\u0000\u0000\u0000\u00cc\u00e4\u0005-\u0000\u0000\u00cd\u00e4"+
		"\u0005,\u0000\u0000\u00ce\u00e4\u0005*\u0000\u0000\u00cf\u00e4\u0003("+
		"\u0014\u0000\u00d0\u00e4\u0003*\u0015\u0000\u00d1\u00e4\u0003.\u0017\u0000"+
		"\u00d2\u00e4\u0003 \u0010\u0000\u00d3\u00e4\u0003\u001e\u000f\u0000\u00d4"+
		"\u00e4\u0003&\u0013\u0000\u00d5\u00d7\u0005,\u0000\u0000\u00d6\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0005\u0006\u0000\u0000\u00d9\u00de\u0003"+
		"\u001a\r\u0000\u00da\u00db\u0005\b\u0000\u0000\u00db\u00dd\u0003\u001a"+
		"\r\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000"+
		"\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000"+
		"\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0005\u0007\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e3\u00cc\u0001\u0000\u0000\u0000\u00e3\u00cd\u0001\u0000\u0000"+
		"\u0000\u00e3\u00ce\u0001\u0000\u0000\u0000\u00e3\u00cf\u0001\u0000\u0000"+
		"\u0000\u00e3\u00d0\u0001\u0000\u0000\u0000\u00e3\u00d1\u0001\u0000\u0000"+
		"\u0000\u00e3\u00d2\u0001\u0000\u0000\u0000\u00e3\u00d3\u0001\u0000\u0000"+
		"\u0000\u00e3\u00d4\u0001\u0000\u0000\u0000\u00e3\u00d6\u0001\u0000\u0000"+
		"\u0000\u00e4\u001b\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u000e\u0000"+
		"\u0000\u00e6\u001d\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u000f\u0000"+
		"\u0000\u00e8\u00ed\u0003 \u0010\u0000\u00e9\u00ea\u0005\b\u0000\u0000"+
		"\u00ea\u00ec\u0003 \u0010\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef"+
		"\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u0010\u0000\u0000\u00f1"+
		"\u001f\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\u0011\u0000\u0000\u00f3"+
		"\u00f4\u0005+\u0000\u0000\u00f4\u00f6\u0005\u0011\u0000\u0000\u00f5\u00f7"+
		"\u0003&\u0013\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f7!\u0001\u0000\u0000\u0000\u00f8\u00fa\u0003\u001c"+
		"\u000e\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\u0012"+
		"\u0000\u0000\u00fc\u0100\u0005\f\u0000\u0000\u00fd\u0101\u0003 \u0010"+
		"\u0000\u00fe\u0101\u0003\u001e\u000f\u0000\u00ff\u0101\u0003&\u0013\u0000"+
		"\u0100\u00fd\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0100\u00ff\u0001\u0000\u0000\u0000\u0101#\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0005\u000b\u0000\u0000\u0103\u0107\u0005\f\u0000\u0000\u0104\u0108"+
		"\u0003 \u0010\u0000\u0105\u0108\u0003\u001e\u000f\u0000\u0106\u0108\u0003"+
		"&\u0013\u0000\u0107\u0104\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000"+
		"\u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108%\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0005\u0013\u0000\u0000\u010a\u010b\u0005*\u0000\u0000"+
		"\u010b\u010c\u0005\u0014\u0000\u0000\u010c\'\u0001\u0000\u0000\u0000\u010d"+
		"\u0116\u0005\u000f\u0000\u0000\u010e\u0113\u0003\u001a\r\u0000\u010f\u0110"+
		"\u0005\b\u0000\u0000\u0110\u0112\u0003\u001a\r\u0000\u0111\u010f\u0001"+
		"\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001"+
		"\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0117\u0001"+
		"\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u010e\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0118\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0005\u0010\u0000\u0000\u0119)\u0001\u0000"+
		"\u0000\u0000\u011a\u0123\u0005\t\u0000\u0000\u011b\u0120\u0003,\u0016"+
		"\u0000\u011c\u011d\u0005\b\u0000\u0000\u011d\u011f\u0003,\u0016\u0000"+
		"\u011e\u011c\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000"+
		"\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000"+
		"\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000"+
		"\u0123\u011b\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0005\n\u0000\u0000\u0126"+
		"+\u0001\u0000\u0000\u0000\u0127\u0128\u0007\u0001\u0000\u0000\u0128\u0129"+
		"\u0005\u0015\u0000\u0000\u0129\u012a\u0003\u001a\r\u0000\u012a-\u0001"+
		"\u0000\u0000\u0000\u012b\u012d\u0005\t\u0000\u0000\u012c\u012e\u00030"+
		"\u0018\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000"+
		"\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000"+
		"\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u0005\n\u0000"+
		"\u0000\u0132/\u0001\u0000\u0000\u0000\u0133\u0134\u0005-\u0000\u0000\u0134"+
		"\u0135\u0005\u0015\u0000\u0000\u0135\u0137\u0003\u001a\r\u0000\u0136\u0138"+
		"\u0005\b\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0137\u0138\u0001"+
		"\u0000\u0000\u0000\u01381\u0001\u0000\u0000\u0000\u0139\u013b\u0005\u0016"+
		"\u0000\u0000\u013a\u013c\u0005*\u0000\u0000\u013b\u013a\u0001\u0000\u0000"+
		"\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u0005\f\u0000\u0000\u013e\u0140\u0005\t\u0000\u0000"+
		"\u013f\u0141\u00034\u001a\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0141"+
		"\u0142\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142"+
		"\u0143\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144"+
		"\u0145\u0005\n\u0000\u0000\u01453\u0001\u0000\u0000\u0000\u0146\u0147"+
		"\u0005\u0017\u0000\u0000\u0147\u0148\u0005,\u0000\u0000\u0148\u0149\u0005"+
		"\f\u0000\u0000\u0149\u014d\u0005\t\u0000\u0000\u014a\u014c\u0003\n\u0005"+
		"\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014c\u014f\u0001\u0000\u0000"+
		"\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000"+
		"\u0000\u014e\u0150\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0005\n\u0000\u0000\u01515\u0001\u0000\u0000\u0000"+
		"\u0152\u0153\u0005\u0018\u0000\u0000\u0153\u0154\u0007\u0001\u0000\u0000"+
		"\u0154\u0155\u0005\f\u0000\u0000\u0155\u0159\u0005\t\u0000\u0000\u0156"+
		"\u0158\u0003\n\u0005\u0000\u0157\u0156\u0001\u0000\u0000\u0000\u0158\u015b"+
		"\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u0001\u0000\u0000\u0000\u015a\u015c\u0001\u0000\u0000\u0000\u015b\u0159"+
		"\u0001\u0000\u0000\u0000\u015c\u015d\u0005\n\u0000\u0000\u015d7\u0001"+
		"\u0000\u0000\u0000\u015e\u015f\u0005\u0019\u0000\u0000\u015f\u0160\u0005"+
		"*\u0000\u0000\u0160\u0161\u0005\f\u0000\u0000\u0161\u0162\u0007\u0001"+
		"\u0000\u0000\u01629\u0001\u0000\u0000\u0000\u0163\u0164\u0005\u001a\u0000"+
		"\u0000\u0164\u0165\u0005\f\u0000\u0000\u0165\u0166\u0005\u000f\u0000\u0000"+
		"\u0166\u016b\u0005,\u0000\u0000\u0167\u0168\u0005\b\u0000\u0000\u0168"+
		"\u016a\u0005,\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a\u016d"+
		"\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016c"+
		"\u0001\u0000\u0000\u0000\u016c\u016e\u0001\u0000\u0000\u0000\u016d\u016b"+
		"\u0001\u0000\u0000\u0000\u016e\u016f\u0005\u0010\u0000\u0000\u016f;\u0001"+
		"\u0000\u0000\u0000\u0170\u0171\u0005\u001b\u0000\u0000\u0171\u0172\u0003"+
		"*\u0015\u0000\u0172=\u0001\u0000\u0000\u0000\u0173\u0174\u0005\u001c\u0000"+
		"\u0000\u0174\u0175\u0003*\u0015\u0000\u0175?\u0001\u0000\u0000\u0000\u0176"+
		"\u017b\u0003B!\u0000\u0177\u0178\u0005\b\u0000\u0000\u0178\u017a\u0003"+
		"B!\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u017a\u017d\u0001\u0000\u0000"+
		"\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000"+
		"\u0000\u017cA\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000"+
		"\u017e\u0181\u0005*\u0000\u0000\u017f\u0180\u0005\f\u0000\u0000\u0180"+
		"\u0182\u0003\u001a\r\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0182"+
		"\u0001\u0000\u0000\u0000\u0182C\u0001\u0000\u0000\u0000\u0183\u0184\u0005"+
		".\u0000\u0000\u0184E\u0001\u0000\u0000\u0000\u0185\u0187\u0007\u0002\u0000"+
		"\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000"+
		"\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000"+
		"\u0000\u0189\u018b\u0001\u0000\u0000\u0000\u018a\u018c\u0005(\u0000\u0000"+
		"\u018b\u018a\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000"+
		"\u018cG\u0001\u0000\u0000\u0000+IT[enry|\u0087\u008d\u0094\u009d\u009f"+
		"\u00a5\u00b3\u00b9\u00bc\u00bf\u00c7\u00ca\u00d6\u00de\u00e3\u00ed\u00f6"+
		"\u00f9\u0100\u0107\u0113\u0116\u0120\u0123\u012f\u0137\u013b\u0142\u014d"+
		"\u0159\u016b\u017b\u0181\u0188\u018b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}