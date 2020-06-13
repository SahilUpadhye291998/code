package algorythms.linkedlist;

public class ReverseList {
    public static void main(String[] args) {
        List head = new List(1);
        List head2 = new List(2);
        List head3 = new List(3);
        List head4 = new List(4);
        List head5 = new List(5);
        List head6 = new List(6);

        head.setNext(head2);
        head2.setNext(head3);
        head3.setNext(head4);
        head4.setNext(head5);
        head5.setNext(head6);

        // printList(head);

        List newList = reverseList(head);

        printList(newList);

        System.out.println("ok");
    }

    private static List reverseList(List head) {
        List current = head;
        List prev = null;
        while (current != null) {
            List temp = current.getNext();
            current.setNext(prev);
            prev = current;
            current = temp;
        }
        head = prev;
        return head;
    }
    
    private static void printList(List head) {
        while (head != null) {
            System.out.println(head.getNumber());
            head = head.getNext();
        }
    }

}