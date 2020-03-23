package algorythms.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Anagram {
    public static void main(String[] args) {
        String input1 = "abab";
        String input2 = "baca";

        if (input1.length() != input2.length()) {
            return;
        }

        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

        for (int i = 0; i < input1.length(); i++) {
            map1.put(input1.charAt(i), map1.getOrDefault(input1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < input2.length(); i++) {
            map2.put(input2.charAt(i), map2.getOrDefault(input2.charAt(i), 0) + 1);
        }

        if (map1.size() != map2.size()) {
            return;
        }

        boolean isAnagram = true;
        for (Character character : map1.keySet()) {
            // System.out.println(character + "=>" + map1.get(character));
            // System.out.println(character + "=>" + map2.get(character));
            if (!map1.get(character).equals(map2.get(character))) {
                isAnagram = false;
                break;
            }
            if (map2.get(character) == null) {
                isAnagram = false;
                break;
            }
        }
        System.out.println(isAnagram);

    }
}