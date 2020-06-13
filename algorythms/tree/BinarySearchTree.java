package algorythms.tree;

public class BinarySearchTree {
    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 3);
        root = insert(root, 1);
        root = insert(root, 2);

        inorder(root);
    }

    public static void inorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.println(node.data);
        inorder(node.left);
        inorder(node.right);
    }

    public static Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
        }else if (node.data <= data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }

        return node;
    }
}