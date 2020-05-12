package hackerrank.problemsolving.gradingstudent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudent {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(new Integer[] { 73, 67, 38, 33 });
        List<Integer> output = new ArrayList<Integer>();
        for (int i = 0; i < input.size(); i++) {
            int roundOffDigit = ((input.get(i) / 5) * 5) + 5;
            if (roundOffDigit >= 40) {
                if ((roundOffDigit - input.get(i)) < 3) {
                    input.set(i, roundOffDigit);
                }
            }
            output.add(input.get(i));
        }

        for (int i = 0; i < output.size(); i++) {
            // expected result [75,70,38,33]
            System.out.println(output.get(i));
        }
    }
}