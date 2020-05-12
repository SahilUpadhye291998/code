package hackerrank.problemsolving.birthdaybarproblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirthDayBarProblem {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list = Arrays.asList(new Integer[] { 4 });
        int days = 4;
        int month = 1;
        int counter = 0;
        // Simple solution with o(n*m)
        for (int i = 0; i <= list.size() - month; i++) {
            int sum = 0;
            for (int j = i; j < month + i; ++j) {
                sum += list.get(j);
            }
            if (sum == days) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}