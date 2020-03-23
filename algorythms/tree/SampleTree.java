package algorythms.tree;

class SampleTree {

    public Node root;

    public SampleTree() {
        root = null;
    }

    public SampleTree(int data) {
        root = new Node(data);
    }

    public static void main(String[] args) {
        SampleTree tree = new SampleTree();
        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);

        System.out.println("===================Post order====================");
        postOrder(tree.root);
        System.out.println("==================Pre Order==================");
        preOrder(tree.root);
        System.out.println("=====================In Order======================");
        inOrder(tree.root);
    }

    public static void postOrder(Node node) {
        if (node == null)
            return;

        postOrder(node.left);

        postOrder(node.right);

        System.out.println(node.data + " ");
    }

    public static void preOrder(Node node) {
        if (node == null)
            return;

        System.out.println(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void inOrder(Node node) {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.println(node.data + " ");
        inOrder(node.right);
    }
}