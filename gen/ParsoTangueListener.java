// Generated from C:/Users/Gleb Begletsov/Java/ParsoTangueAST/src/main/antlr4\ParsoTangue.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParsoTangueParser}.
 */
public interface ParsoTangueListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ParsoTangueParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ParsoTangueParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ParsoTangueParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ParsoTangueParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#function_blocks_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_blocks_list(ParsoTangueParser.Function_blocks_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#function_blocks_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_blocks_list(ParsoTangueParser.Function_blocks_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(ParsoTangueParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(ParsoTangueParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(ParsoTangueParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(ParsoTangueParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#elif_statement}.
	 * @param ctx the parse tree
	 */
	void enterElif_statement(ParsoTangueParser.Elif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#elif_statement}.
	 * @param ctx the parse tree
	 */
	void exitElif_statement(ParsoTangueParser.Elif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(ParsoTangueParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(ParsoTangueParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ParsoTangueParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ParsoTangueParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ParsoTangueParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ParsoTangueParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#parameter_var}.
	 * @param ctx the parse tree
	 */
	void enterParameter_var(ParsoTangueParser.Parameter_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#parameter_var}.
	 * @param ctx the parse tree
	 */
	void exitParameter_var(ParsoTangueParser.Parameter_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ParsoTangueParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ParsoTangueParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterAssigment(ParsoTangueParser.AssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitAssigment(ParsoTangueParser.AssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ParsoTangueParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ParsoTangueParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(ParsoTangueParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(ParsoTangueParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#bool_op_with_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_op_with_expr(ParsoTangueParser.Bool_op_with_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#bool_op_with_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_op_with_expr(ParsoTangueParser.Bool_op_with_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#bool_expr_or_bool_var}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_or_bool_var(ParsoTangueParser.Bool_expr_or_bool_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#bool_expr_or_bool_var}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_or_bool_var(ParsoTangueParser.Bool_expr_or_bool_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#number_bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber_bool_expr(ParsoTangueParser.Number_bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#number_bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber_bool_expr(ParsoTangueParser.Number_bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#string_bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterString_bool_expr(ParsoTangueParser.String_bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#string_bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitString_bool_expr(ParsoTangueParser.String_bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#bool_expr_var}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_var(ParsoTangueParser.Bool_expr_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#bool_expr_var}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_var(ParsoTangueParser.Bool_expr_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#math_expr}.
	 * @param ctx the parse tree
	 */
	void enterMath_expr(ParsoTangueParser.Math_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#math_expr}.
	 * @param ctx the parse tree
	 */
	void exitMath_expr(ParsoTangueParser.Math_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#number_math_expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber_math_expr(ParsoTangueParser.Number_math_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#number_math_expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber_math_expr(ParsoTangueParser.Number_math_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#negative_math_expr}.
	 * @param ctx the parse tree
	 */
	void enterNegative_math_expr(ParsoTangueParser.Negative_math_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#negative_math_expr}.
	 * @param ctx the parse tree
	 */
	void exitNegative_math_expr(ParsoTangueParser.Negative_math_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#string_math_expr}.
	 * @param ctx the parse tree
	 */
	void enterString_math_expr(ParsoTangueParser.String_math_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#string_math_expr}.
	 * @param ctx the parse tree
	 */
	void exitString_math_expr(ParsoTangueParser.String_math_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#string_plus}.
	 * @param ctx the parse tree
	 */
	void enterString_plus(ParsoTangueParser.String_plusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#string_plus}.
	 * @param ctx the parse tree
	 */
	void exitString_plus(ParsoTangueParser.String_plusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#number_expr_var}.
	 * @param ctx the parse tree
	 */
	void enterNumber_expr_var(ParsoTangueParser.Number_expr_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#number_expr_var}.
	 * @param ctx the parse tree
	 */
	void exitNumber_expr_var(ParsoTangueParser.Number_expr_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#string_expr_var}.
	 * @param ctx the parse tree
	 */
	void enterString_expr_var(ParsoTangueParser.String_expr_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#string_expr_var}.
	 * @param ctx the parse tree
	 */
	void exitString_expr_var(ParsoTangueParser.String_expr_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(ParsoTangueParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(ParsoTangueParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#function_parameters_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameters_list(ParsoTangueParser.Function_parameters_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#function_parameters_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameters_list(ParsoTangueParser.Function_parameters_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#function_parameter}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameter(ParsoTangueParser.Function_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#function_parameter}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameter(ParsoTangueParser.Function_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#function_var}.
	 * @param ctx the parse tree
	 */
	void enterFunction_var(ParsoTangueParser.Function_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#function_var}.
	 * @param ctx the parse tree
	 */
	void exitFunction_var(ParsoTangueParser.Function_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#function_type}.
	 * @param ctx the parse tree
	 */
	void enterFunction_type(ParsoTangueParser.Function_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#function_type}.
	 * @param ctx the parse tree
	 */
	void exitFunction_type(ParsoTangueParser.Function_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#bool_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_operator(ParsoTangueParser.Bool_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#bool_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_operator(ParsoTangueParser.Bool_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#first_bool_operator}.
	 * @param ctx the parse tree
	 */
	void enterFirst_bool_operator(ParsoTangueParser.First_bool_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#first_bool_operator}.
	 * @param ctx the parse tree
	 */
	void exitFirst_bool_operator(ParsoTangueParser.First_bool_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#second_bool_operator}.
	 * @param ctx the parse tree
	 */
	void enterSecond_bool_operator(ParsoTangueParser.Second_bool_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#second_bool_operator}.
	 * @param ctx the parse tree
	 */
	void exitSecond_bool_operator(ParsoTangueParser.Second_bool_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#first_math_operator}.
	 * @param ctx the parse tree
	 */
	void enterFirst_math_operator(ParsoTangueParser.First_math_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#first_math_operator}.
	 * @param ctx the parse tree
	 */
	void exitFirst_math_operator(ParsoTangueParser.First_math_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#second_math_operator}.
	 * @param ctx the parse tree
	 */
	void enterSecond_math_operator(ParsoTangueParser.Second_math_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#second_math_operator}.
	 * @param ctx the parse tree
	 */
	void exitSecond_math_operator(ParsoTangueParser.Second_math_operatorContext ctx);
}