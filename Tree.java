public class Tree {

    public static final Tree instance = new Tree();
    private Tree() {}
    Node node;

    public void add(int vaule) {
        if (this.node == null) {
            this.node = new Node(vaule);
        } else {
            if (vaule > this.node.getVaule() && this.node.getRight() == null) {
                node.setRight(new Node(vaule));
            } else if (vaule < this.node.getVaule() && this.node.getLeft() == null) {
                node.setLeft(new Node(vaule));
            } else if (vaule > this.node.getVaule() && this.node.getRight() != null) {
                addANode(this.node.getRight(), vaule);
            } else if (vaule < this.node.getVaule() && this.node.getLeft() != null) {
                addANode(this.node.getLeft(), vaule);
            } else {
                return;
            }
        }
    }

    private void addANode(Node aNode, int vaule) {
        if (vaule > aNode.getVaule() && aNode.getRight() == null) {
            aNode.setRight(new Node(vaule));
        } else if (vaule < aNode.getVaule() && aNode.getLeft() == null) {
            aNode.setLeft(new Node(vaule));
        } else if (vaule < aNode.getVaule() && aNode.getLeft() != null) {
            addANode(aNode.getLeft(), vaule);
        } else if (vaule > aNode.getVaule() && aNode.getRight() != null) {
            addANode(aNode.getRight(), vaule);
        } else {
            return;
        }
    }

    public int min() {
        return minA(this.node);
    }

    private int minA(Node aNode) {
        if (aNode.getLeft() == null) {
            return aNode.getVaule();
        } else {
            return minA(aNode.getLeft());
        }
    }

    public int max() {
        return maxA(this.node);
    }

    private int maxA(Node aNode) {
        if (aNode.getRight() == null) {
            return aNode.getVaule();
        } else {
            return maxA(aNode.getRight());
        }
    }

    public boolean contains(int vaule) {
        return containsA(this.node, vaule);
    }

    private boolean containsA(Node aNode, int value) {
        if (aNode == null) {
            return false;
        }
        if (aNode.getVaule() == value) {
            return true;
        } else {
            if (value > aNode.getVaule()) {
                return containsA(aNode.getRight(), value);
            } else {
                return containsA(aNode.getLeft(), value);
            }
        }
    }

    public static Tree getInstance(){
        return instance;
    }

    @Override
    public String toString() {
        return  new StringBuilder()
                .append("Node=")
                .append(node)
                .toString();
    }
}
