package algorythms.linkedlist;

public class List {

    private int number;
    private List next;

    public List(int number) {
        this.number = number;
        this.next = null;
    }

    public List(int number, List list) {
        this.number = number;
        this.next = null;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List getNext() {
        return next;
    }

    public void setNext(List next) {
        this.next = next;
    }

    public static void iterate(List head) {
        List temp = head;
        while (temp != null) {
            System.out.println(temp.number);
            temp = temp.next;
        }
    }

}
