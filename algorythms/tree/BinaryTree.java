package algorythms.tree;

class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(int data) {
        root = new Node(data);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(5);
        insertInBinaryTree(tree.root, 2);
        insertInBinaryTree(tree.root, 4);
        insertInBinaryTree(tree.root, 8);
        insertInBinaryTree(tree.root, 6);
        insertInBinaryTree(tree.root, 7);
        insertInBinaryTree(tree.root, 3);
        insertInBinaryTree(tree.root, 9);
        deleteInBinaryTree(tree.root, 2);
        System.out.println(search(tree.root, 7));
        int max = maximumValue(tree.root);
        System.out.println(max);
        inOrder(tree.root);
    }

    public static Node insertInBinaryTree(Node node, int data) {

        if (node == null) {
            return (new Node(data));
        }

        if (node.data > data) {
            node.left = insertInBinaryTree(node.left, data);
        } else if (node.data < data) {
            node.right = insertInBinaryTree(node.right, data);
        }
        return node;
    }

    public static Node deleteInBinaryTree(Node node, int data) {
        if (node == null) {
            return null;
        }

        // reach to sub trees:
        if (data < node.data) {
            node.left = deleteInBinaryTree(node.left, data);
        } else if (data > node.data) {
            node.right = deleteInBinaryTree(node.right, data);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            node.data = minimumValue(node);
            node.right = deleteInBinaryTree(node.right, data);
        }
        return node;
    }

    public static void inOrder(Node node) {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public static int minimumValue(Node node) {
        int min = node.data;
        while (node.left != null) {
            min = node.data;
            node = node.left;
        }
        return min;
    }

    public static int maximumValue(Node node) {
        int max = node.data;
        while (node != null) {
            max = node.data;
            node = node.right;
        }
        return max;
    }

    public static boolean search(Node node, int data) {

        if (node == null) {
            return false;
        }

        if (data == node.data) {
            return true;
        }

        boolean leftFlag = search(node.left, data);
        if (leftFlag) {
            return true;
        }

        boolean rightFlag = search(node.right, data);
        if (rightFlag) {
            return true;
        }

        return false;
    }

}