package algorythms.tree;

class HeightOfTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);
        Node node6 = new Node(7);
        Node node7 = new Node(8);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.left = node6;
        node3.left = node7;

        int height1 = height(root.left);
        int height2 = height(root.right);
        System.out.println(height1);
        System.out.println(height2);

    }

    public static int height(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            return (leftHeight > rightHeight) ? leftHeight + 1 : rightHeight + 1;
        }
    }

}