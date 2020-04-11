package algorythms.tree;

public class DiameterTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);

        root.left = node1;
        root.right = node2;
        root.left.left = node3;
        root.left.right = node4;

        int diameter = diameter(root);
        System.out.println(diameter);

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

    public static int diameter(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
            int maxFromRoot = leftHeight + rightHeight;

            int leftDiameter = diameter(node.left);
            int rightDiameter = diameter(node.right);
            int maxWithinRoot = Math.max(leftDiameter, rightDiameter);

            return Math.max(maxFromRoot, maxWithinRoot);
        }
    }

}