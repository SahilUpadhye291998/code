package algorythms.array;

import sun.font.EAttribute;

class RemoveDuplicate {
    public static void main(String[] args) {
        int[] input = new int[] { 1, 1, 2, 3, 4 };
        int i = 1;
        for (int j = 1; j < input.length - 1; j++) {
            if (input[j] != input[i]) {
                i++;
                input[i] = input[j];
            }
        }
        System.out.println(i + 1);
    }
}