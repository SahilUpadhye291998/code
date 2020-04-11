package hackerrank.problemsolving;

import java.util.Arrays;

public class BlowCandle {
    static int birthdayCakeCandles(long[] ar) {

        if (ar.length == 0) {
            return 0;
        }
        Arrays.sort(ar);

        int counter = 1;
        for (int i = ar.length - 1; i >= 1; i--) {
            if (ar[i] <= ar[i - 1]) {
                counter++;
            } else {
                break;
            }
        }

        return counter;

    }
}