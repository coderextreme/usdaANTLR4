// Generated from USDA.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link USDAParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface USDAVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link USDAParser#usdFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsdFile(USDAParser.UsdFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(USDAParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersion(USDAParser.VersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#layer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLayer(USDAParser.LayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#layerBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLayerBody(USDAParser.LayerBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(USDAParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#prim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrim(USDAParser.PrimContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#primType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimType(USDAParser.PrimTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#primName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimName(USDAParser.PrimNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#inherits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInherits(USDAParser.InheritsContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#primBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimBody(USDAParser.PrimBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#primStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimStatement(USDAParser.PrimStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#propertySpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertySpec(USDAParser.PropertySpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(USDAParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(USDAParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(USDAParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(USDAParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#references}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferences(USDAParser.ReferencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#payload}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPayload(USDAParser.PayloadContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#closeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTag(USDAParser.CloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#arrayValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValue(USDAParser.ArrayValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#dictionaryValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryValue(USDAParser.DictionaryValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#keyValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValuePair(USDAParser.KeyValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#timeSample}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeSample(USDAParser.TimeSampleContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#timeSampleItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeSampleItem(USDAParser.TimeSampleItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#variants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariants(USDAParser.VariantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#variant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariant(USDAParser.VariantContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#dictionary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary(USDAParser.DictionaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(USDAParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#subLayer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubLayer(USDAParser.SubLayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#customLayerData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomLayerData(USDAParser.CustomLayerDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#customData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomData(USDAParser.CustomDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#metadataList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadataList(USDAParser.MetadataListContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#metadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadata(USDAParser.MetadataContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(USDAParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link USDAParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(USDAParser.TypeContext ctx);
}