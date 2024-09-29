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
		LAYER=18, IDENTIFIER=19, STRING=20, NUMBER=21, COMMENT=22, WS=23;
	public static final int
		RULE_usdFile = 0, RULE_layer = 1, RULE_layerBody = 2, RULE_statement = 3, 
		RULE_prim = 4, RULE_primType = 5, RULE_primName = 6, RULE_inherits = 7, 
		RULE_primBody = 8, RULE_primStatement = 9, RULE_propertySpec = 10, RULE_value = 11, 
		RULE_arrayValue = 12, RULE_dictionaryValue = 13, RULE_keyValuePair = 14, 
		RULE_timeSample = 15, RULE_timeSampleItem = 16, RULE_variantSet = 17, 
		RULE_variant = 18, RULE_reference = 19, RULE_subLayer = 20, RULE_customLayerData = 21, 
		RULE_customData = 22, RULE_metadataList = 23, RULE_metadata = 24, RULE_comment = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"usdFile", "layer", "layerBody", "statement", "prim", "primType", "primName", 
			"inherits", "primBody", "primStatement", "propertySpec", "value", "arrayValue", 
			"dictionaryValue", "keyValuePair", "timeSample", "timeSampleItem", "variantSet", 
			"variant", "reference", "subLayer", "customLayerData", "customData", 
			"metadataList", "metadata", "comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'def'", "'('", "')'", "','", "'='", "'=('", "'['", 
			"']'", "':'", "'variantSet'", "'variant'", "'rel'", "'subLayers'", "'customLayerData'", 
			"'customData'", "'layer'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "LAYER", "IDENTIFIER", "STRING", 
			"NUMBER", "COMMENT", "WS"
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
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
		enterRule(_localctx, 2, RULE_layer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LAYER) {
				{
				setState(54);
				match(LAYER);
				}
			}

			setState(57);
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
		enterRule(_localctx, 4, RULE_layerBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__0);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4837384L) != 0)) {
				{
				{
				setState(60);
				statement();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(T__1);
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
		public PrimContext prim() {
			return getRuleContext(PrimContext.class,0);
		}
		public PropertySpecContext propertySpec() {
			return getRuleContext(PropertySpecContext.class,0);
		}
		public VariantSetContext variantSet() {
			return getRuleContext(VariantSetContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public SubLayerContext subLayer() {
			return getRuleContext(SubLayerContext.class,0);
		}
		public CustomLayerDataContext customLayerData() {
			return getRuleContext(CustomLayerDataContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
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
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				prim();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				propertySpec();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				variantSet();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				reference();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				subLayer();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				customLayerData();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				comment();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public PrimTypeContext primType() {
			return getRuleContext(PrimTypeContext.class,0);
		}
		public PrimNameContext primName() {
			return getRuleContext(PrimNameContext.class,0);
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
		enterRule(_localctx, 8, RULE_prim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__2);
			setState(78);
			primType();
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(79);
				primName();
				}
				break;
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(82);
				match(T__3);
				setState(83);
				inherits();
				setState(84);
				match(T__4);
				}
			}

			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(88);
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
		enterRule(_localctx, 10, RULE_primType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
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
		enterRule(_localctx, 12, RULE_primName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
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
		enterRule(_localctx, 14, RULE_inherits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(IDENTIFIER);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(96);
				match(T__5);
				setState(97);
				match(IDENTIFIER);
				}
				}
				setState(102);
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
		enterRule(_localctx, 16, RULE_primBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__0);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4870152L) != 0)) {
				{
				{
				setState(104);
				primStatement();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(T__1);
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
		public PropertySpecContext propertySpec() {
			return getRuleContext(PropertySpecContext.class,0);
		}
		public PrimContext prim() {
			return getRuleContext(PrimContext.class,0);
		}
		public VariantSetContext variantSet() {
			return getRuleContext(VariantSetContext.class,0);
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
		enterRule(_localctx, 18, RULE_primStatement);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				propertySpec();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				prim();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				variantSet();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				reference();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				customData();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				comment();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 20, RULE_propertySpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(IDENTIFIER);
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(121);
				match(T__6);
				}
				break;
			case T__7:
				{
				setState(122);
				match(T__7);
				setState(123);
				metadataList();
				setState(124);
				match(T__4);
				}
				break;
			case T__0:
			case T__8:
			case IDENTIFIER:
			case STRING:
			case NUMBER:
				break;
			default:
				break;
			}
			setState(128);
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
		enterRule(_localctx, 22, RULE_value);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				arrayValue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				dictionaryValue();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				timeSample();
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
		enterRule(_localctx, 24, RULE_arrayValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__8);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670530L) != 0)) {
				{
				setState(139);
				value();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(140);
					match(T__5);
					setState(141);
					value();
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(149);
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
		enterRule(_localctx, 26, RULE_dictionaryValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__0);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==STRING) {
				{
				setState(152);
				keyValuePair();
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(153);
					match(T__5);
					setState(154);
					keyValuePair();
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(162);
			match(T__1);
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
		enterRule(_localctx, 28, RULE_keyValuePair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(165);
			match(T__10);
			setState(166);
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
		enterRule(_localctx, 30, RULE_timeSample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__0);
			setState(170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(169);
				timeSampleItem();
				}
				}
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(174);
			match(T__1);
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
		enterRule(_localctx, 32, RULE_timeSampleItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(NUMBER);
			setState(177);
			match(T__10);
			setState(178);
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
	public static class VariantSetContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(USDAParser.IDENTIFIER, 0); }
		public List<VariantContext> variant() {
			return getRuleContexts(VariantContext.class);
		}
		public VariantContext variant(int i) {
			return getRuleContext(VariantContext.class,i);
		}
		public VariantSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variantSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).enterVariantSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof USDAListener ) ((USDAListener)listener).exitVariantSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof USDAVisitor ) return ((USDAVisitor<? extends T>)visitor).visitVariantSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariantSetContext variantSet() throws RecognitionException {
		VariantSetContext _localctx = new VariantSetContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variantSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__11);
			setState(181);
			match(IDENTIFIER);
			setState(182);
			match(T__6);
			setState(183);
			match(T__0);
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184);
				variant();
				}
				}
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__12 );
			setState(189);
			match(T__1);
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
		enterRule(_localctx, 36, RULE_variant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__12);
			setState(192);
			match(STRING);
			setState(193);
			match(T__6);
			setState(194);
			match(T__0);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4837384L) != 0)) {
				{
				{
				setState(195);
				statement();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			match(T__1);
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
		enterRule(_localctx, 38, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__13);
			setState(204);
			match(IDENTIFIER);
			setState(205);
			match(T__6);
			setState(206);
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
		enterRule(_localctx, 40, RULE_subLayer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__14);
			setState(209);
			match(T__6);
			setState(210);
			match(T__8);
			setState(211);
			match(STRING);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(212);
				match(T__5);
				setState(213);
				match(STRING);
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
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
		enterRule(_localctx, 42, RULE_customLayerData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__15);
			setState(222);
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
		enterRule(_localctx, 44, RULE_customData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__16);
			setState(225);
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
		enterRule(_localctx, 46, RULE_metadataList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			metadata();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(228);
				match(T__5);
				setState(229);
				metadata();
				}
				}
				setState(234);
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
		enterRule(_localctx, 48, RULE_metadata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(IDENTIFIER);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(236);
				match(T__6);
				setState(237);
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
		enterRule(_localctx, 50, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0017\u00f3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0001\u0003"+
		"\u00018\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005"+
		"\u0002>\b\u0002\n\u0002\f\u0002A\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003L\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004Q\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004W\b\u0004\u0001\u0004\u0003\u0004Z\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"c\b\u0007\n\u0007\f\u0007f\t\u0007\u0001\b\u0001\b\u0005\bj\b\b\n\b\f"+
		"\bm\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\tw\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u007f\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0089\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u008f\b\f\n\f\f\f\u0092\t\f\u0003\f\u0094\b"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u009c\b\r\n"+
		"\r\f\r\u009f\t\r\u0003\r\u00a1\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0004\u000f\u00ab\b\u000f"+
		"\u000b\u000f\f\u000f\u00ac\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0004\u0011\u00ba\b\u0011\u000b\u0011\f\u0011\u00bb\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u00c5\b\u0012\n\u0012\f\u0012\u00c8\t\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u00d7\b\u0014\n\u0014\f\u0014\u00da\t\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u00e7\b\u0017\n"+
		"\u0017\f\u0017\u00ea\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u00ef\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0000\u0000\u001a"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02\u0000\u0001\u0001\u0000\u0013\u0014\u00fb\u0000"+
		"4\u0001\u0000\u0000\u0000\u00027\u0001\u0000\u0000\u0000\u0004;\u0001"+
		"\u0000\u0000\u0000\u0006K\u0001\u0000\u0000\u0000\bM\u0001\u0000\u0000"+
		"\u0000\n[\u0001\u0000\u0000\u0000\f]\u0001\u0000\u0000\u0000\u000e_\u0001"+
		"\u0000\u0000\u0000\u0010g\u0001\u0000\u0000\u0000\u0012v\u0001\u0000\u0000"+
		"\u0000\u0014x\u0001\u0000\u0000\u0000\u0016\u0088\u0001\u0000\u0000\u0000"+
		"\u0018\u008a\u0001\u0000\u0000\u0000\u001a\u0097\u0001\u0000\u0000\u0000"+
		"\u001c\u00a4\u0001\u0000\u0000\u0000\u001e\u00a8\u0001\u0000\u0000\u0000"+
		" \u00b0\u0001\u0000\u0000\u0000\"\u00b4\u0001\u0000\u0000\u0000$\u00bf"+
		"\u0001\u0000\u0000\u0000&\u00cb\u0001\u0000\u0000\u0000(\u00d0\u0001\u0000"+
		"\u0000\u0000*\u00dd\u0001\u0000\u0000\u0000,\u00e0\u0001\u0000\u0000\u0000"+
		".\u00e3\u0001\u0000\u0000\u00000\u00eb\u0001\u0000\u0000\u00002\u00f0"+
		"\u0001\u0000\u0000\u000045\u0003\u0002\u0001\u00005\u0001\u0001\u0000"+
		"\u0000\u000068\u0005\u0012\u0000\u000076\u0001\u0000\u0000\u000078\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0003\u0004\u0002\u0000"+
		":\u0003\u0001\u0000\u0000\u0000;?\u0005\u0001\u0000\u0000<>\u0003\u0006"+
		"\u0003\u0000=<\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000BC\u0005\u0002\u0000\u0000C\u0005\u0001\u0000"+
		"\u0000\u0000DL\u0003\b\u0004\u0000EL\u0003\u0014\n\u0000FL\u0003\"\u0011"+
		"\u0000GL\u0003&\u0013\u0000HL\u0003(\u0014\u0000IL\u0003*\u0015\u0000"+
		"JL\u00032\u0019\u0000KD\u0001\u0000\u0000\u0000KE\u0001\u0000\u0000\u0000"+
		"KF\u0001\u0000\u0000\u0000KG\u0001\u0000\u0000\u0000KH\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000L\u0007\u0001"+
		"\u0000\u0000\u0000MN\u0005\u0003\u0000\u0000NP\u0003\n\u0005\u0000OQ\u0003"+
		"\f\u0006\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QV\u0001"+
		"\u0000\u0000\u0000RS\u0005\u0004\u0000\u0000ST\u0003\u000e\u0007\u0000"+
		"TU\u0005\u0005\u0000\u0000UW\u0001\u0000\u0000\u0000VR\u0001\u0000\u0000"+
		"\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000XZ\u0003\u0010"+
		"\b\u0000YX\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\t\u0001"+
		"\u0000\u0000\u0000[\\\u0005\u0013\u0000\u0000\\\u000b\u0001\u0000\u0000"+
		"\u0000]^\u0007\u0000\u0000\u0000^\r\u0001\u0000\u0000\u0000_d\u0005\u0013"+
		"\u0000\u0000`a\u0005\u0006\u0000\u0000ac\u0005\u0013\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000e\u000f\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000gk\u0005\u0001\u0000\u0000hj\u0003\u0012\t\u0000ih\u0001\u0000"+
		"\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000"+
		"no\u0005\u0002\u0000\u0000o\u0011\u0001\u0000\u0000\u0000pw\u0003\u0014"+
		"\n\u0000qw\u0003\b\u0004\u0000rw\u0003\"\u0011\u0000sw\u0003&\u0013\u0000"+
		"tw\u0003,\u0016\u0000uw\u00032\u0019\u0000vp\u0001\u0000\u0000\u0000v"+
		"q\u0001\u0000\u0000\u0000vr\u0001\u0000\u0000\u0000vs\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000vu\u0001\u0000\u0000\u0000w\u0013\u0001"+
		"\u0000\u0000\u0000x~\u0005\u0013\u0000\u0000y\u007f\u0005\u0007\u0000"+
		"\u0000z{\u0005\b\u0000\u0000{|\u0003.\u0017\u0000|}\u0005\u0005\u0000"+
		"\u0000}\u007f\u0001\u0000\u0000\u0000~y\u0001\u0000\u0000\u0000~z\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0003\u0016\u000b\u0000\u0081\u0015\u0001\u0000"+
		"\u0000\u0000\u0082\u0089\u0005\u0015\u0000\u0000\u0083\u0089\u0005\u0014"+
		"\u0000\u0000\u0084\u0089\u0005\u0013\u0000\u0000\u0085\u0089\u0003\u0018"+
		"\f\u0000\u0086\u0089\u0003\u001a\r\u0000\u0087\u0089\u0003\u001e\u000f"+
		"\u0000\u0088\u0082\u0001\u0000\u0000\u0000\u0088\u0083\u0001\u0000\u0000"+
		"\u0000\u0088\u0084\u0001\u0000\u0000\u0000\u0088\u0085\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000"+
		"\u0000\u0089\u0017\u0001\u0000\u0000\u0000\u008a\u0093\u0005\t\u0000\u0000"+
		"\u008b\u0090\u0003\u0016\u000b\u0000\u008c\u008d\u0005\u0006\u0000\u0000"+
		"\u008d\u008f\u0003\u0016\u000b\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u008b\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005\n\u0000\u0000\u0096\u0019\u0001\u0000\u0000\u0000\u0097"+
		"\u00a0\u0005\u0001\u0000\u0000\u0098\u009d\u0003\u001c\u000e\u0000\u0099"+
		"\u009a\u0005\u0006\u0000\u0000\u009a\u009c\u0003\u001c\u000e\u0000\u009b"+
		"\u0099\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d"+
		"\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e"+
		"\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0"+
		"\u0098\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0002\u0000\u0000\u00a3"+
		"\u001b\u0001\u0000\u0000\u0000\u00a4\u00a5\u0007\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005\u000b\u0000\u0000\u00a6\u00a7\u0003\u0016\u000b\u0000\u00a7"+
		"\u001d\u0001\u0000\u0000\u0000\u00a8\u00aa\u0005\u0001\u0000\u0000\u00a9"+
		"\u00ab\u0003 \u0010\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005\u0002\u0000\u0000\u00af\u001f\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0005\u0015\u0000\u0000\u00b1\u00b2\u0005\u000b\u0000\u0000\u00b2\u00b3"+
		"\u0003\u0016\u000b\u0000\u00b3!\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005"+
		"\f\u0000\u0000\u00b5\u00b6\u0005\u0013\u0000\u0000\u00b6\u00b7\u0005\u0007"+
		"\u0000\u0000\u00b7\u00b9\u0005\u0001\u0000\u0000\u00b8\u00ba\u0003$\u0012"+
		"\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u0002\u0000"+
		"\u0000\u00be#\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\r\u0000\u0000"+
		"\u00c0\u00c1\u0005\u0014\u0000\u0000\u00c1\u00c2\u0005\u0007\u0000\u0000"+
		"\u00c2\u00c6\u0005\u0001\u0000\u0000\u00c3\u00c5\u0003\u0006\u0003\u0000"+
		"\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0005\u0002\u0000\u0000\u00ca%\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0005\u000e\u0000\u0000\u00cc\u00cd\u0005\u0013\u0000\u0000\u00cd"+
		"\u00ce\u0005\u0007\u0000\u0000\u00ce\u00cf\u0007\u0000\u0000\u0000\u00cf"+
		"\'\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u000f\u0000\u0000\u00d1\u00d2"+
		"\u0005\u0007\u0000\u0000\u00d2\u00d3\u0005\t\u0000\u0000\u00d3\u00d8\u0005"+
		"\u0014\u0000\u0000\u00d4\u00d5\u0005\u0006\u0000\u0000\u00d5\u00d7\u0005"+
		"\u0014\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00da\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d9\u00db\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0005\n\u0000\u0000\u00dc)\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0005\u0010\u0000\u0000\u00de\u00df\u0003\u001a"+
		"\r\u0000\u00df+\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0011\u0000"+
		"\u0000\u00e1\u00e2\u0003\u001a\r\u0000\u00e2-\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e8\u00030\u0018\u0000\u00e4\u00e5\u0005\u0006\u0000\u0000\u00e5"+
		"\u00e7\u00030\u0018\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00ea"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e9/\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ee\u0005\u0013\u0000\u0000\u00ec\u00ed\u0005"+
		"\u0007\u0000\u0000\u00ed\u00ef\u0003\u0016\u000b\u0000\u00ee\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef1\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0005\u0016\u0000\u0000\u00f13\u0001\u0000\u0000"+
		"\u0000\u00157?KPVYdkv~\u0088\u0090\u0093\u009d\u00a0\u00ac\u00bb\u00c6"+
		"\u00d8\u00e8\u00ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}