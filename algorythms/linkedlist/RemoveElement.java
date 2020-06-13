package algorythms.linkedlist;

public class RemoveElement {
    public static void main(String[] args) {
        List head = new List(1);
        List head2 = new List(2);
        List head3 = new List(3);
        List head4 = new List(4);
        List head5 = new List(5);
        List head6 = new List(6);
        List head7 = new List(7);

        head.setNext(head2);
        head2.setNext(head3);
        head3.setNext(head4);
        head4.setNext(head5);
        head5.setNext(head6);
        head6.setNext(head7);

        int value = 6;

        List newList = removeElement(head, value);
        List.iterate(newList);
    }

    private static List removeElement(List head, int value) {
        while (head != null && head.getNumber() == value) {
            head = head.getNext();
        }
        List newList = head;
        while (newList != null && newList.getNext() != null) {
            if (newList.getNext().getNumber() == value) {
                List temp = newList.getNext().getNext();
                newList.setNext(temp);
            } else {
                newList = newList.getNext();
            }
        }
        List.iterate(head);
        return head;
    }
}
