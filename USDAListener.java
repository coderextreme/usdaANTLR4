// Generated from USDA.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link USDAParser}.
 */
public interface USDAListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link USDAParser#usdFile}.
	 * @param ctx the parse tree
	 */
	void enterUsdFile(USDAParser.UsdFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#usdFile}.
	 * @param ctx the parse tree
	 */
	void exitUsdFile(USDAParser.UsdFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterLayer(USDAParser.LayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitLayer(USDAParser.LayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#layerBody}.
	 * @param ctx the parse tree
	 */
	void enterLayerBody(USDAParser.LayerBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#layerBody}.
	 * @param ctx the parse tree
	 */
	void exitLayerBody(USDAParser.LayerBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(USDAParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(USDAParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#prim}.
	 * @param ctx the parse tree
	 */
	void enterPrim(USDAParser.PrimContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#prim}.
	 * @param ctx the parse tree
	 */
	void exitPrim(USDAParser.PrimContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#primType}.
	 * @param ctx the parse tree
	 */
	void enterPrimType(USDAParser.PrimTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#primType}.
	 * @param ctx the parse tree
	 */
	void exitPrimType(USDAParser.PrimTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#primName}.
	 * @param ctx the parse tree
	 */
	void enterPrimName(USDAParser.PrimNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#primName}.
	 * @param ctx the parse tree
	 */
	void exitPrimName(USDAParser.PrimNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#inherits}.
	 * @param ctx the parse tree
	 */
	void enterInherits(USDAParser.InheritsContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#inherits}.
	 * @param ctx the parse tree
	 */
	void exitInherits(USDAParser.InheritsContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#primBody}.
	 * @param ctx the parse tree
	 */
	void enterPrimBody(USDAParser.PrimBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#primBody}.
	 * @param ctx the parse tree
	 */
	void exitPrimBody(USDAParser.PrimBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#primStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrimStatement(USDAParser.PrimStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#primStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrimStatement(USDAParser.PrimStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#propertySpec}.
	 * @param ctx the parse tree
	 */
	void enterPropertySpec(USDAParser.PropertySpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#propertySpec}.
	 * @param ctx the parse tree
	 */
	void exitPropertySpec(USDAParser.PropertySpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(USDAParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(USDAParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#arrayValue}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(USDAParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#arrayValue}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(USDAParser.ArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#dictionaryValue}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryValue(USDAParser.DictionaryValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#dictionaryValue}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryValue(USDAParser.DictionaryValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterKeyValuePair(USDAParser.KeyValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitKeyValuePair(USDAParser.KeyValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#timeSample}.
	 * @param ctx the parse tree
	 */
	void enterTimeSample(USDAParser.TimeSampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#timeSample}.
	 * @param ctx the parse tree
	 */
	void exitTimeSample(USDAParser.TimeSampleContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#timeSampleItem}.
	 * @param ctx the parse tree
	 */
	void enterTimeSampleItem(USDAParser.TimeSampleItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#timeSampleItem}.
	 * @param ctx the parse tree
	 */
	void exitTimeSampleItem(USDAParser.TimeSampleItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#variantSet}.
	 * @param ctx the parse tree
	 */
	void enterVariantSet(USDAParser.VariantSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#variantSet}.
	 * @param ctx the parse tree
	 */
	void exitVariantSet(USDAParser.VariantSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#variant}.
	 * @param ctx the parse tree
	 */
	void enterVariant(USDAParser.VariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#variant}.
	 * @param ctx the parse tree
	 */
	void exitVariant(USDAParser.VariantContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(USDAParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(USDAParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#subLayer}.
	 * @param ctx the parse tree
	 */
	void enterSubLayer(USDAParser.SubLayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#subLayer}.
	 * @param ctx the parse tree
	 */
	void exitSubLayer(USDAParser.SubLayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#customLayerData}.
	 * @param ctx the parse tree
	 */
	void enterCustomLayerData(USDAParser.CustomLayerDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#customLayerData}.
	 * @param ctx the parse tree
	 */
	void exitCustomLayerData(USDAParser.CustomLayerDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#customData}.
	 * @param ctx the parse tree
	 */
	void enterCustomData(USDAParser.CustomDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#customData}.
	 * @param ctx the parse tree
	 */
	void exitCustomData(USDAParser.CustomDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#metadataList}.
	 * @param ctx the parse tree
	 */
	void enterMetadataList(USDAParser.MetadataListContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#metadataList}.
	 * @param ctx the parse tree
	 */
	void exitMetadataList(USDAParser.MetadataListContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#metadata}.
	 * @param ctx the parse tree
	 */
	void enterMetadata(USDAParser.MetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#metadata}.
	 * @param ctx the parse tree
	 */
	void exitMetadata(USDAParser.MetadataContext ctx);
	/**
	 * Enter a parse tree produced by {@link USDAParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(USDAParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link USDAParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(USDAParser.CommentContext ctx);
}