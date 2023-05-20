public class BinaryTree {
    public static void main(String[] args) {

       Tree tree = Tree.getInstance();

        tree.add(2);
        tree.add(6);
        tree.add(10);
        tree.add(20);
        tree.add(-2);
        tree.add(-8);
        System.out.println(tree);

        System.out.println("\n******************************");

        System.out.println("Minimlna wartość z drzewa:");
        System.out.println(tree.min());
        System.out.println("Maksymalna wartość z drzewa:");
        System.out.println(tree.max());

        System.out.println("\n******************************");
        System.out.println(tree.contains(2));
        System.out.println(tree.contains(5));
        System.out.println(tree.contains(55));
    }
}
