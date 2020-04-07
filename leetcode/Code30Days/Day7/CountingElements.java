package leetcode.Code30Days.Day7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class CountingElements {
    public static void main(String[] args) {
        int[] input = new int[] { 1, 2, 3 };
        int output = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            set.add(input[i]);
        }

        for (Integer integer : input) {
            if (set.contains(integer + 1)) {
                output++;
            }
        }

        System.out.println(output);
    }
}