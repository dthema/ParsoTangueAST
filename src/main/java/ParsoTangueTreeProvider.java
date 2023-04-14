import hu.webarticum.treeprinter.SimpleTreeNode;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.InputStream;

public class ParsoTangueTreeProvider {
    public static SimpleTreeNode treeFromStream(InputStream stream) throws IOException {
        ParsoTangueLexer lexer = new ParsoTangueLexer(CharStreams.fromStream(stream));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ParsoTangueParser parser = new ParsoTangueParser(tokens);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        ParsoTangueListenerImpl listener = new ParsoTangueListenerImpl();
        walker.walk(listener, tree);
        return listener.getTree().getRoot();
    }
}
