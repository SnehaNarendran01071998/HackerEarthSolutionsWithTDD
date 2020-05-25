import java.util.Scanner;

public class Tree {
    Node root;
    Node current;

    Tree() {
        root = null;
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        Scanner scanner = new Scanner(System.in);
        int numberOfNodes = scanner.nextInt();
        int dataInRootNode = scanner.nextInt();
        tree.root = new Node(dataInRootNode);
        for (int i = 0; i < numberOfNodes - 1; i++) {
            String path = scanner.next();
            tree.current = tree.root;

            for (int k = 0; k < path.length(); k++) {
                if (path.charAt(k) == 'L') {
                    if (tree.current.left == null)
                        tree.current.left = new Node(0);
                    tree.current = tree.current.left;
                } else {
                    if (tree.current.right == null)
                        tree.current.right = new Node(0);
                    tree.current = tree.current.right;
                }
            }
            assert tree.current != null;
            tree.current.data = scanner.nextInt();

        }
        System.out.println(diameter(tree.root));

    }

    public static int diameter(Node node) {
        if (node == null)
            return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        int leftDiameter = diameter(node.left);
        int rightDiameter = diameter(node.right);

        return Math.max(1 + leftHeight + rightHeight, Math.max(leftDiameter, rightDiameter));
    }

    public static int height(Node node) {
        if (node == null)
            return 0;
        return (1 + Math.max(height(node.left), height(node.right)));
    }
}
