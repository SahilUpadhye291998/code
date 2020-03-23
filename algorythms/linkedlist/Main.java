package algorythms.linkedlist;

import algorythms.linkedlist.*;

public class Main {

    public static void main(String[] args) {
        List list11 = new List(1);
        List list12 = new List(2);
        List list13 = new List(3);

        List list21 = new List(3);
        List list22 = new List(2);
        List list23 = new List(1);
        List list24 = new List(0);

        list11.setNext(list12);
        list12.setNext(list13);

        list21.setNext(list22);
        list22.setNext(list23);
        list23.setNext(list24);

        List head1 = list11;
        List head2 = list21;
        List head3 = null;
        int total = 0;
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();

        while (head1 != null) {
            num1.append(head1.getNumber());
            head1 = head1.getNext();
        }

        while (head2 != null) {
            num2.append(head2.getNumber());
            head2 = head2.getNext();
        }
        num1.reverse();
        num2.reverse();

        total = Integer.parseInt(String.valueOf(num1)) + Integer.parseInt(String.valueOf(num2));
        System.out.println(total);

        String totalBuilder = String.valueOf(total);
        String[] splitTotal = totalBuilder.split("");
        List[] newList = new List[splitTotal.length];

        for (int i = 0; i < splitTotal.length; i++) {
            newList[i] = new List(Integer.parseInt(splitTotal[i]));
        }

        List list3 = new List(newList[0].getNumber());

        for (int i = 1; i < splitTotal.length; i++) {
            list3.setNext(newList[i]);
            list3 = list3.getNext();
            System.out.println("OK");
        }

        head3 = list3;
        while (head3 != null) {
            System.out.println(head3.getNumber());
            head3 = head3.getNext();
        }

    }
}
