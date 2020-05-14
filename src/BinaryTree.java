public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(5);
        binaryTree.root.right = new Node(3);
        binaryTree.printPreOrder();

    }

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.println("Node: " + node.data + "   " + numberOfNodesOnLeft(node));
        preOrder(node.left);
        if (node.left != null && node.right != null) {
            System.out.println("Node: " + node.data + "   " + numberOfNodesOnRight(node));
        }
        preOrder(node.right);

    }

    public void printPreOrder() {
        preOrder(root);
    }

    private int numberOfNodesOnLeft(Node node) {
        if (node.left == null && node.right == null) {
            return 1;
        }

        assert node.left != null;
        return 1 + numberOfNodesOnLeft(node.left);
    }

    private int numberOfNodesOnRight(Node node) {
        if (node.left == null && node.right == null)
            return 1;
        return 1 + numberOfNodesOnRight(node.right);
    }
}
