package leetcode.Code30Days.Day8;

class MiddleElement {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);

        root.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        Node slow = root;
        Node fast = root;

        while (fast != null && fast.next != null) {
            System.out.println("slow " + slow.data);
            System.out.println("fast " + fast.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.data);

    }
}