import org.antlr.v4.runtime.tree.TerminalNode;

public class ParsoTangueListenerImpl extends ParsoTangueBaseListener {
    private final ParsoTangueTree tree = new ParsoTangueTree(Constants.PROGRAM);

    public ParsoTangueTree getTree() {
        return tree;
    }

    @Override public void enterFunction(ParsoTangueParser.FunctionContext ctx) {
        tree.addBlockContainer(Constants.FUNCTION);
        addIdToLastBlockContainer(ctx.ID());
        tree.addNodeToLastBlockContainer(TokenStringFormatter.formattedString(Constants.RETURNED_TYPE, ctx.function_type().getText()));
        if (!ctx.parameter_var().isEmpty())
            tree.addBlockContainer(Constants.PARAMETERS);
    }

    @Override
    public void exitFunction(ParsoTangueParser.FunctionContext ctx) {
        tree.removeBlockContainer();
    }

    @Override
    public void enterParameter_var(ParsoTangueParser.Parameter_varContext ctx) {
        tree.addBlockContainer(Constants.PARAMETER);
        addIdToLastBlockContainer(ctx.ID());
        addTypeToLastBlockContainer(ctx.TYPE());
    }

    @Override
    public void exitParameter_var(ParsoTangueParser.Parameter_varContext ctx) {
        tree.removeBlockContainer();
    }


    @Override
    public void enterFunction_blocks_list(ParsoTangueParser.Function_blocks_listContext ctx) {
        tree.addBlockContainer(Constants.BLOCKS);
    }

    @Override
    public void exitFunction_blocks_list(ParsoTangueParser.Function_blocks_listContext ctx) {
        tree.removeBlockContainer();
    }

    @Override
    public void enterReturn(ParsoTangueParser.ReturnContext ctx) {
        tree.addBlockContainer(Constants.RETURN);
    }

    @Override
    public void exitReturn(ParsoTangueParser.ReturnContext ctx) {
        tree.removeBlockContainer();
    }

    @Override public void enterIf_statement(ParsoTangueParser.If_statementContext ctx) {
        if (tree.lastBlockContainerContentEquals(Constants.IF_ELSE))
            tree.duplicateLastBlockContainer();
        else
            tree.addBlockContainer(Constants.IF);
    }

    @Override public void exitIf_statement(ParsoTangueParser.If_statementContext ctx) {
        tree.removeBlockContainer();
    }

    @Override public void enterElif_statement(ParsoTangueParser.Elif_statementContext ctx) {
        tree.addBlockContainer(Constants.IF_ELSE);
    }

    @Override public void exitElif_statement(ParsoTangueParser.Elif_statementContext ctx) {
        tree.removeBlockContainer();
    }

    @Override public void enterElse_statement(ParsoTangueParser.Else_statementContext ctx) {
        tree.addBlockContainer(Constants.ELSE);
    }

    @Override public void exitElse_statement(ParsoTangueParser.Else_statementContext ctx) {
        tree.removeBlockContainer();
    }

    @Override public void enterDeclaration(ParsoTangueParser.DeclarationContext ctx) {
        tree.addBlockContainer(Constants.DECLARATION);
        addTypeToLastBlockContainer(ctx.TYPE());
    }

    @Override public void exitDeclaration(ParsoTangueParser.DeclarationContext ctx) {
        tree.removeBlockContainer();
    }

    @Override public void enterAssigment(ParsoTangueParser.AssigmentContext ctx) {
        tree.addBlockContainer(Constants.ASSIGMENT);
        addIdToLastBlockContainer(ctx.ID());
    }

    @Override public void exitAssigment(ParsoTangueParser.AssigmentContext ctx) {
        tree.removeBlockContainer();
    }

    @Override public void enterBool_expr(ParsoTangueParser.Bool_exprContext ctx) {
        tree.addBlockContainer(Constants.BOOL_EXPR);
    }

    @Override public void exitBool_expr(ParsoTangueParser.Bool_exprContext ctx) {
        tree.removeBlockContainer();
    }

    @Override
    public void enterBool_expr_var(ParsoTangueParser.Bool_expr_varContext ctx) {
        tree.addBlockContainer(Constants.BOOL_VAR);
        if (ctx.ID() != null)
            addIdToLastBlockContainer(ctx.ID());
        if (ctx.BOOL_VAR() != null)
            tree.addNodeToLastBlockContainer(ctx.BOOL_VAR().getText());
    }

    @Override
    public void exitBool_expr_var(ParsoTangueParser.Bool_expr_varContext ctx) {
        tree.removeBlockContainer();
    }

    @Override
    public void enterNumber_expr_var(ParsoTangueParser.Number_expr_varContext ctx) {
        tree.addBlockContainer(Constants.NUMBER_VAR);
        if (ctx.ID() != null)
            addIdToLastBlockContainer(ctx.ID());
        if (ctx.NUMBER() != null)
            tree.addNodeToLastBlockContainer(ctx.NUMBER().getText());
    }

    @Override
    public void exitNumber_expr_var(ParsoTangueParser.Number_expr_varContext ctx) {
        tree.removeBlockContainer();
    }

    @Override public void enterString_expr_var(ParsoTangueParser.String_expr_varContext ctx) {
        tree.addBlockContainer(Constants.STRING_VAR);
        if (ctx.ID() != null)
            addIdToLastBlockContainer(ctx.ID());
        if (ctx.STRING() != null)
            tree.addNodeToLastBlockContainer(ctx.STRING().getText());
    }

    @Override public void exitString_expr_var(ParsoTangueParser.String_expr_varContext ctx) {
        tree.removeBlockContainer();
    }

    @Override public void enterMath_expr(ParsoTangueParser.Math_exprContext ctx) {
        tree.addBlockContainer(Constants.MATH_EXPR);
    }

    @Override public void exitMath_expr(ParsoTangueParser.Math_exprContext ctx) {
        tree.removeBlockContainer();
    }

    @Override
    public void enterNumber_math_expr(ParsoTangueParser.Number_math_exprContext ctx) {
        tree.addBlockContainer(Constants.NUMBER_MATH_EXPR);
    }

    @Override
    public void exitNumber_math_expr(ParsoTangueParser.Number_math_exprContext ctx) {
        tree.removeBlockContainer();
    }

    @Override public void enterString_math_expr(ParsoTangueParser.String_math_exprContext ctx) {
        tree.addBlockContainer(Constants.STRING_MATH_EXPR);
    }

    @Override public void exitString_math_expr(ParsoTangueParser.String_math_exprContext ctx) {
        tree.removeBlockContainer();
    }

    @Override
    public void exitString_plus(ParsoTangueParser.String_plusContext ctx) {
        addOperatorToLastBlockContainer(Constants.PLUS);
    }

    @Override public void enterFunction_call(ParsoTangueParser.Function_callContext ctx) {
        tree.addBlockContainer(Constants.FUNCTION_CALL);
        addIdToLastBlockContainer(ctx.ID());
    }

    @Override public void exitFunction_call(ParsoTangueParser.Function_callContext ctx) {
        tree.removeBlockContainer();
    }

    @Override
    public void enterFunction_parameters_list(ParsoTangueParser.Function_parameters_listContext ctx) {
        tree.addBlockContainer(Constants.PARAMETERS);
    }

    @Override
    public void exitFunction_parameters_list(ParsoTangueParser.Function_parameters_listContext ctx) {
        tree.removeBlockContainer();
    }

    @Override
    public void enterFunction_var(ParsoTangueParser.Function_varContext ctx) {
        if (ctx.expression() == null)
            tree.addNodeToLastBlockContainer(ctx.getText());
    }

    @Override public void enterFirst_bool_operator(ParsoTangueParser.First_bool_operatorContext ctx) {
        addOperatorToLastBlockContainer(ctx.getText());
    }

    @Override public void enterSecond_bool_operator(ParsoTangueParser.Second_bool_operatorContext ctx) {
        addOperatorToLastBlockContainer(ctx.getText());
    }

    @Override public void enterFirst_math_operator(ParsoTangueParser.First_math_operatorContext ctx) {
        addOperatorToLastBlockContainer(ctx.getText());
    }

    @Override public void enterSecond_math_operator(ParsoTangueParser.Second_math_operatorContext ctx) {
        addOperatorToLastBlockContainer(ctx.getText());
    }

    private void addIdToLastBlockContainer(TerminalNode idNode) {
        tree.addNodeToLastBlockContainer(TokenStringFormatter.formattedId(idNode));
    }

    private void addTypeToLastBlockContainer(TerminalNode typeNode) {
        tree.addNodeToLastBlockContainer(TokenStringFormatter.formattedType(typeNode));
    }

    private void addOperatorToLastBlockContainer(String operatorText) {
        tree.addNodeToLastBlockContainer(TokenStringFormatter.formattedOperator(operatorText));
    }
}