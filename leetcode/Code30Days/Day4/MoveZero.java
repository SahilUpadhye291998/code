package leetcode.Code30Days.Day4;

class MoveZero {
    public static void main(String[] args) {
        int[] input = new int[] { 1, 0, 3, 0, 12, 24, 43, 0, 0, 12 };
        // 1,3,12,24,43,12,0,0,0,0
        int counter = 0;
        for (int i = 0; i < input.length; i++) {

            if (input[i] != 0) {
                input[counter] = input[i];
                counter++;
            }

        }

        for (int i = counter; i < input.length; i++) {
            input[i] = 0;
        }

    }
}