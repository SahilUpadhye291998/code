package leetcode.Code30Days.Day12;

import java.util.HashMap;

public class ContiguousArray {
    public static void main(String[] args) {
        int[] input = new int[]{0,1,0};
        int counter = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < input.length-1; i++) {
            counter+= (input[i]==0) ? -1 : 1;

            if(map.containsKey(counter)){
                maxLength=Math.max(maxLength,i-map.get(counter));
            }else{
                map.put(counter, i);
            }
        }

        System.out.println(maxLength);
    }
}