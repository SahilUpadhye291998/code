package algorythms.array;

import java.util.Arrays;

class ContainsDuplicate {
    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,1};
        Arrays.sort(input);
        for (int i = 0; i < input.length-1; i++) {
            if(input[i]==input[i+1]){
               return; 
            }
        }
    }
}