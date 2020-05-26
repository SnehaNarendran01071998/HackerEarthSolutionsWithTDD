import java.util.Scanner;

public class MirrorImageTree {
    Node root;

    MirrorImageTree() {
        root = new Node(1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MirrorImageTree mirrorImageTree = new MirrorImageTree();
        int numberOfNodes = scanner.nextInt();
        int numberOfInputNodes = scanner.nextInt();

        for (int i = 0; i < numberOfNodes - 1; i++) {
            int parentNodeData = scanner.nextInt();
            Node parentNode = findNode(mirrorImageTree.root, parentNodeData);
            int dataInChildNode = scanner.nextInt();
            String child = scanner.next();
            if (child.equals("R")) {
                parentNode.right = new Node(dataInChildNode);

            } else if (child.equals("L")) {
                parentNode.left = new Node(dataInChildNode);

            }


        }

        for (int i = 0; i < numberOfInputNodes; i++) {
            int inputNode = scanner.nextInt();
            int mirrorNode = mirror(mirrorImageTree.root, inputNode);
            if (mirrorNode != 0)
                System.out.println(mirrorNode);
            else
                System.out.println(-1);
        }

    }


    private static int mirror(Node node, int input) {
        if (node == null)
            return 0;
        if (node.data == input)
            return node.data;
        return findMirror(input, node.left, node.right);

    }

    private static int findMirror(int input, Node left, Node right) {
        if (left == null || right == null)
            return 0;
        if (left.data == input)
            return right.data;
        if (right.data == input)
            return left.data;
        int mirrorValue = findMirror(input, left.left, right.right);
        if (mirrorValue != 0)
            return mirrorValue;
        return findMirror(input, left.right, right.left);
    }

    private static Node findNode(Node node, int parentNode) {
        if (node != null) {
            if (node.data == parentNode)
                return node;
            else {
                Node resultNode = findNode(node.left, parentNode);
                if (resultNode == null)
                    resultNode = findNode(node.right, parentNode);
                return resultNode;
            }

        } else
            return null;

    }

}
