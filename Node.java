public class Node {
    private int value;
    private Node right;
   private Node left;
    public Node(int vaule) {
        this.value = vaule;
    }
    public Node() {
    }
    public int getVaule() {
        return value;
    }
    public void setVaule(int vaule) {
        this.value= vaule;
    }
    public Node getRight() {
        return right;
    }
    public void setRight(Node right) {
        this.right = right;
    }
    public Node getLeft() {
        return left;
    }
    public void setLeft(Node left) {
        this.left = left;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(System.getProperty("line.separator"))
                .append("Node{")
                .append("value=")
                .append(value)
                .append(", right=")
                .append(right)
                .append(", left=")
                .append(left)
                .toString();
    }
}
