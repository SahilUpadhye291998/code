package algorythms.string;

import java.util.HashMap;
import java.util.Iterator;

class FirstUniqueCharacter {
    public static void main(String[] args) {
        String input = "leetcode";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < input.length(); i++) {
            if (map.containsKey(input.charAt(i))) {
                map.put(input.charAt(i), -1);
            } else {
                map.put(input.charAt(i), i);
            }
        }

        int min = Integer.MAX_VALUE;
        for (Character ch : map.keySet()) {
            if (map.get(ch) > -1 && map.get(ch) < min) {
                min = map.get(ch);
                System.out.println(ch + "=>" + map.get(ch));
            }
        }
        int temp = min == Integer.MAX_VALUE ? -1 : min;
        System.out.println(temp);
    }
}