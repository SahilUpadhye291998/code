package leetcode;

import java.util.HashMap;

class RomanToInt {
    public static void main(String[] args) {
        String input = "IV";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int output = 0;
        for (int i = 0; i < input.length(); i++) {
            if ((i != input.length() - 1) && map.get(input.charAt(i)) < map.get(input.charAt(i + 1))) {
                output -= map.get(input.charAt(i));
            } else {
                output += map.get(input.charAt(i));
            }
        }
        System.out.println(output);
    }
}