package antlr;// Generated from UnoPls.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CParser}.
 */
public interface CListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(CParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(CParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(CParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(CParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(CParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(CParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(CParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(CParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(CParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(CParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(CParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(CParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(CParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(CParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(CParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(CParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(CParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(CParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(CParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(CParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(CParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(CParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(CParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(CParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(CParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(CParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(CParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(CParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(CParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(CParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(CParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(CParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(CParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(CParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(CParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(CParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(CParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(CParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(CParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(CParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(CParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(CParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(CParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(CParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(CParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(CParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(CParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(CParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void enterModuleName(CParser.ModuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void exitModuleName(CParser.ModuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(CParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(CParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(CParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(CParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(CParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(CParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(CParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(CParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(CParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(CParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(CParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(CParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(CParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(CParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#ordinaryCompilation}.
	 * @param ctx the parse tree
	 */
	void enterOrdinaryCompilation(CParser.OrdinaryCompilationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#ordinaryCompilation}.
	 * @param ctx the parse tree
	 */
	void exitOrdinaryCompilation(CParser.OrdinaryCompilationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#modularCompilation}.
	 * @param ctx the parse tree
	 */
	void enterModularCompilation(CParser.ModularCompilationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#modularCompilation}.
	 * @param ctx the parse tree
	 */
	void exitModularCompilation(CParser.ModularCompilationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(CParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(CParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(CParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(CParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(CParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(CParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(CParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(CParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(CParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(CParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(CParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(CParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(CParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(CParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(CParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(CParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclaration(CParser.ModuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclaration(CParser.ModuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void enterModuleDirective(CParser.ModuleDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void exitModuleDirective(CParser.ModuleDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#requiresModifier}.
	 * @param ctx the parse tree
	 */
	void enterRequiresModifier(CParser.RequiresModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#requiresModifier}.
	 * @param ctx the parse tree
	 */
	void exitRequiresModifier(CParser.RequiresModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(CParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(CParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainDeclaration(CParser.MainDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainDeclaration(CParser.MainDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(CParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(CParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(CParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(CParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(CParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(CParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(CParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(CParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(CParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(CParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(CParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(CParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(CParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(CParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(CParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(CParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(CParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(CParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(CParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(CParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(CParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(CParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(CParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(CParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(CParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(CParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(CParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(CParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(CParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(CParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(CParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(CParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(CParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(CParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(CParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(CParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(CParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(CParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(CParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(CParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(CParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(CParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(CParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(CParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(CParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(CParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(CParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(CParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(CParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(CParser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(CParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(CParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(CParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(CParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(CParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(CParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(CParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(CParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(CParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(CParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(CParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(CParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(CParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(CParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(CParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(CParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(CParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(CParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(CParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(CParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(CParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(CParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(CParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(CParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(CParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(CParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(CParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(CParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(CParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(CParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(CParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(CParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(CParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(CParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(CParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(CParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(CParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(CParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(CParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(CParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(CParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(CParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(CParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(CParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(CParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(CParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(CParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(CParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(CParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(CParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(CParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(CParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(CParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(CParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(CParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(CParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(CParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(CParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(CParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(CParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(CParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(CParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(CParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(CParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(CParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(CParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(CParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(CParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(CParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(CParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(CParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(CParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(CParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(CParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(CParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(CParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(CParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(CParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(CParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(CParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(CParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(CParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(CParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(CParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(CParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(CParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(CParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(CParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(CParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(CParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(CParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(CParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(CParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(CParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(CParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(CParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(CParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(CParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(CParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(CParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(CParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(CParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(CParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(CParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(CParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(CParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(CParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(CParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(CParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(CParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(CParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(CParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(CParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(CParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(CParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(CParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(CParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(CParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(CParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(CParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(CParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(CParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(CParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(CParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#functionCaller}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCaller(CParser.FunctionCallerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#functionCaller}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCaller(CParser.FunctionCallerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(CParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(CParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(CParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(CParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(CParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(CParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(CParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(CParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(CParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(CParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(CParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(CParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(CParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(CParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(CParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(CParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(CParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(CParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(CParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(CParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(CParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(CParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(CParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(CParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(CParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(CParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(CParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(CParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(CParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(CParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(CParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(CParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(CParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(CParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(CParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(CParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(CParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(CParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(CParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(CParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#whileUpToStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileUpToStatement(CParser.WhileUpToStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#whileUpToStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileUpToStatement(CParser.WhileUpToStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(CParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(CParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(CParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(CParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(CParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(CParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#forUpToStatement}.
	 * @param ctx the parse tree
	 */
	void enterForUpToStatement(CParser.ForUpToStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#forUpToStatement}.
	 * @param ctx the parse tree
	 */
	void exitForUpToStatement(CParser.ForUpToStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(CParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(CParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(CParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(CParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(CParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(CParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(CParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(CParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(CParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(CParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(CParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(CParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(CParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(CParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(CParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(CParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(CParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(CParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(CParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(CParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(CParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(CParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(CParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(CParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(CParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(CParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(CParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(CParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(CParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(CParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(CParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(CParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(CParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(CParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(CParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(CParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(CParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(CParser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(CParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(CParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(CParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(CParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(CParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(CParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(CParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(CParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#variableAccess}.
	 * @param ctx the parse tree
	 */
	void enterVariableAccess(CParser.VariableAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#variableAccess}.
	 * @param ctx the parse tree
	 */
	void exitVariableAccess(CParser.VariableAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(CParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(CParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(CParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(CParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(CParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(CParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(CParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(CParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(CParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(CParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(CParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(CParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(CParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(CParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(CParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(CParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(CParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(CParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(CParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(CParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#classLiteral}.
	 * @param ctx the parse tree
	 */
	void enterClassLiteral(CParser.ClassLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#classLiteral}.
	 * @param ctx the parse tree
	 */
	void exitClassLiteral(CParser.ClassLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(CParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(CParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(CParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(CParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(CParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(CParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(CParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(CParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(CParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(CParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(CParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(CParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(CParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(CParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(CParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(CParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(CParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(CParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(CParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(CParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(CParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(CParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(CParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(CParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(CParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(CParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(CParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(CParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(CParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(CParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(CParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(CParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(CParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(CParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(CParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(CParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(CParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(CParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(CParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(CParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(CParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(CParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(CParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(CParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(CParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(CParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(CParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(CParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(CParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(CParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(CParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(CParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(CParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(CParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(CParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(CParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(CParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(CParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(CParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(CParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(CParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(CParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(CParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(CParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(CParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(CParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(CParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(CParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(CParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(CParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(CParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(CParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(CParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(CParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(CParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(CParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(CParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(CParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(CParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(CParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(CParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(CParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(CParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(CParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(CParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(CParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(CParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(CParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(CParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(CParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(CParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(CParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(CParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(CParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(CParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(CParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CParser.IdentifierContext ctx);
}