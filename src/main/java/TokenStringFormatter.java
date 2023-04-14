import org.antlr.v4.runtime.tree.TerminalNode;

public class TokenStringFormatter {
    public static String formattedId(TerminalNode node) {
        return formattedNode(Constants.ID, node);
    }

    public static String formattedType(TerminalNode node) {
        return formattedNode(Constants.TYPE, node);
    }

    public static String formattedOperator(String parameter) {
        return formattedString(Constants.OPERATOR, parameter);
    }

    public static String formattedNode(String parameterName, TerminalNode node) {
        return String.format(parameterName + ": %s", node.getText());
    }

    public static String formattedString(String parameterName, String parameter) {
        return String.format(parameterName + ": %s", parameter);
    }
}
