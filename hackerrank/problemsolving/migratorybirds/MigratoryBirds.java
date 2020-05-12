package hackerrank.problemsolving.migratorybirds;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(new Integer[] { 1, 4, 4, 4, 5, 3 });
        Map<Integer, Integer> birds = new HashMap<Integer, Integer>();
        for (int i = 0; i < input.size(); i++) {
            birds.put(input.get(i), birds.getOrDefault(input.get(i), 0) + 1);
        }
        int max = Collections.max(birds.values());
        int min = 6;
        for (int i : birds.keySet()) {
            if (birds.get(i) == max) {
                System.out.println(i + ":" + birds.get(i));
                if (i < min) {
                    min = i;
                }
            }
        }
        System.out.println(min);
    }
}