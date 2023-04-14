import hu.webarticum.treeprinter.SimpleTreeNode;

import java.util.Stack;

public class ParsoTangueTree {
    private final SimpleTreeNode root;
    private final Stack<SimpleTreeNode> blockContainer = new Stack<>();
    public ParsoTangueTree(String value) {
        root = new SimpleTreeNode(value);
        blockContainer.push(root);
    }

    public SimpleTreeNode getRoot() {
        return root;
    }

    public void addBlockContainer(String content) {
        var newNode = new SimpleTreeNode(content);
        getLastBlockContainer().addChild(newNode);
        blockContainer.push(newNode);
    }

    public SimpleTreeNode getLastBlockContainer() {
        return blockContainer.lastElement();
    }

    public void removeBlockContainer() {
        blockContainer.pop();
    }

    public void addNodeToLastBlockContainer(String content) {
        getLastBlockContainer().addChild(new SimpleTreeNode(content));
    }

    public void duplicateLastBlockContainer() {
        blockContainer.push(getLastBlockContainer());
    }

    public boolean lastBlockContainerContentEquals(String text) {
        return getLastBlockContainer().content().plain().equals(text);
    }
}