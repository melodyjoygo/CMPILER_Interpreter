package antlr;// Generated from C.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(CParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(CParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(CParser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(CParser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(CParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(CParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(CParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(CParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(CParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(CParser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(CParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(CParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(CParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(CParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(CParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(CParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(CParser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(CParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(CParser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(CParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(CParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(CParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(CParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(CParser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#moduleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleName(CParser.ModuleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(CParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(CParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(CParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(CParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(CParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(CParser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(CParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#ordinaryCompilation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinaryCompilation(CParser.OrdinaryCompilationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#modularCompilation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModularCompilation(CParser.ModularCompilationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(CParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(CParser.PackageModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(CParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(CParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(CParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(CParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(CParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(CParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDeclaration(CParser.ModuleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#moduleDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDirective(CParser.ModuleDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#requiresModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequiresModifier(CParser.RequiresModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(CParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#mainDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainDeclaration(CParser.MainDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(CParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(CParser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(CParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(CParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(CParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(CParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(CParser.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(CParser.InterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(CParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(CParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(CParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(CParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(CParser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(CParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(CParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(CParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(CParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(CParser.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(CParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(CParser.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(CParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(CParser.UnannClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(CParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(CParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType(CParser.UnannInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(CParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(CParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(CParser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(CParser.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(CParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(CParser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(CParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(CParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(CParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(CParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(CParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(CParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(CParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(CParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(CParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(CParser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(CParser.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(CParser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(CParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(CParser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(CParser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(CParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(CParser.ConstructorModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(CParser.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(CParser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(CParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(CParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(CParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(CParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(CParser.EnumConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(CParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(CParser.EnumConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(CParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(CParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(CParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(CParser.InterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(CParser.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(CParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(CParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(CParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(CParser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(CParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(CParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(CParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(CParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(CParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(CParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(CParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(CParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(CParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(CParser.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(CParser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(CParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(CParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(CParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(CParser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(CParser.MarkerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(CParser.SingleElementAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(CParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(CParser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(CParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(CParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#functionCaller}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCaller(CParser.FunctionCallerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(CParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(CParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(CParser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(CParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(CParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(CParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(CParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(CParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(CParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(CParser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(CParser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(CParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(CParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(CParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(CParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(CParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(CParser.SwitchLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(CParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(CParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(CParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#whileUpToStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileUpToStatement(CParser.WhileUpToStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(CParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(CParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(CParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#forUpToStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpToStatement(CParser.ForUpToStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(CParser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(CParser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(CParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(CParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(CParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(CParser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(CParser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(CParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(CParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(CParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(CParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(CParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(CParser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(CParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(CParser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(CParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(CParser.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(CParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(CParser.Finally_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(CParser.TryWithResourcesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(CParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(CParser.ResourceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(CParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#variableAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAccess(CParser.VariableAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(CParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(CParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(CParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(CParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(CParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(CParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(CParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(CParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(CParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(CParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#classLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassLiteral(CParser.ClassLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(CParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(CParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(CParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(CParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(CParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(CParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(CParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(CParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(CParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(CParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(CParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(CParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(CParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(CParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(CParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(CParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(CParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(CParser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(CParser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(CParser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(CParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(CParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(CParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(CParser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(CParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(CParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(CParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(CParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(CParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(CParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(CParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(CParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(CParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(CParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(CParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(CParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(CParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(CParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(CParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(CParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(CParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(CParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(CParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(CParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(CParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(CParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(CParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(CParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(CParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(CParser.IdentifierContext ctx);
}