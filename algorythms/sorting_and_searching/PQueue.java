package algorythms.sorting_and_searching;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PQueue {
    public static void main(String[] args) {
        int[] input = new int[] { 2, 7, 4, 1, 8, 1 };

        PriorityQueue<Integer> pq = new PriorityQueue<>(input.length, (a, b) -> b - a);
        for (int i = 0; i < input.length; i++) {
            pq.add(input[i]);
        }

        while (pq.size() > 1) {
            int x = pq.peek();
            pq.remove();
            int y = pq.peek();
            pq.remove();
            if (x != y) {
                x = x - y;
                pq.add(x);
            }
        }

        Iterator iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}