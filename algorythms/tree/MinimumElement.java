package algorythms.tree;

class MinimumElement {

    Node root;
    public static int minimumElement;

    public MinimumElement() {
        root = null;
    }

    public MinimumElement(int data) {
        root = new Node(data);
    }

    public static void main(String[] args) {
        MinimumElement tree = new MinimumElement();
        tree.root = new Node(10);

        tree.root.left = new Node(3);
        tree.root.right = new Node(2);
        tree.root.left.right = new Node(5);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.left.right = new Node(4);
        minimumElement = tree.root.data;
        inorder(tree.root);

        System.out.println("Minimum element is " + tree.minimumElement);
    }

    public static void inorder(Node node) {
        if (node == null) {
            return;
        }

        inorder(node.left);

        if (node.data < minimumElement) {
            minimumElement = node.data;
        }

        inorder(node.right);
    }

}