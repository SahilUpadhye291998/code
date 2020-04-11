package hackerrank.problemsolving;

import java.util.Arrays;

public class MiniMaxSum {
    static void miniMaxSum(long[] arr) {
        Arrays.sort(arr);
        long smallest = arr[0] + arr[1] + arr[2] + arr[3];
        long largest = arr[1] + arr[2] + arr[3] + arr[4];

        System.out.print(smallest + " ");
        System.out.println(largest);

    }
}