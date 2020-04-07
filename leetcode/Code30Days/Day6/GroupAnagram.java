package leetcode.Code30Days.Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] input = new String[] { "eat", "tea", "tan" };
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            char[] charArray = input[i].toCharArray();
            Arrays.sort(charArray);
            if (!map.containsKey(String.valueOf(charArray))) {
                map.put(String.valueOf(charArray), new ArrayList<String>());
            }
            map.get(String.valueOf(charArray)).add(input[i]);
        }
        List<List<String>> output = new ArrayList<>(map.values());
        for (int i = 0; i < output.size(); i++) {
            for (int j = 0; j < output.get(i).size(); j++) {
                System.out.println(output.get(i).get(j));
            }
        }
    }
}