// Generated from /Users/glebbeglecov/IdeaProjects/ParsoTangue AST/src/main/antlr4/ParsoTangue.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParsoTangueParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParsoTangueVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParsoTangueParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ParsoTangueParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#function_blocks_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_blocks_list(ParsoTangueParser.Function_blocks_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(ParsoTangueParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(ParsoTangueParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#elif_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_statement(ParsoTangueParser.Elif_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(ParsoTangueParser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ParsoTangueParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ParsoTangueParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#parameter_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_var(ParsoTangueParser.Parameter_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ParsoTangueParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigment(ParsoTangueParser.AssigmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ParsoTangueParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(ParsoTangueParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#bool_op_with_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_op_with_expr(ParsoTangueParser.Bool_op_with_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#bool_expr_or_bool_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_or_bool_var(ParsoTangueParser.Bool_expr_or_bool_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#number_bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_bool_expr(ParsoTangueParser.Number_bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#string_bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_bool_expr(ParsoTangueParser.String_bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#bool_expr_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_var(ParsoTangueParser.Bool_expr_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#math_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expr(ParsoTangueParser.Math_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#number_math_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_math_expr(ParsoTangueParser.Number_math_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#negative_math_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative_math_expr(ParsoTangueParser.Negative_math_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#string_math_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_math_expr(ParsoTangueParser.String_math_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#string_plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_plus(ParsoTangueParser.String_plusContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#number_expr_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_expr_var(ParsoTangueParser.Number_expr_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#string_expr_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_expr_var(ParsoTangueParser.String_expr_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(ParsoTangueParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#function_parameters_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameters_list(ParsoTangueParser.Function_parameters_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#function_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameter(ParsoTangueParser.Function_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#function_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_var(ParsoTangueParser.Function_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#function_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_type(ParsoTangueParser.Function_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#bool_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_operator(ParsoTangueParser.Bool_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#first_bool_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_bool_operator(ParsoTangueParser.First_bool_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#second_bool_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond_bool_operator(ParsoTangueParser.Second_bool_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#first_math_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_math_operator(ParsoTangueParser.First_math_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#second_math_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond_math_operator(ParsoTangueParser.Second_math_operatorContext ctx);
}