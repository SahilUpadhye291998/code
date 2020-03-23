package leetcode;

class DecreaseElementToMakeArrayZigZag {
    public static void main(String[] args) {
        int[] input = new int[] { 2, 1, 2 };
        int output = 0;
        for (int i = 1; i < input.length - 1; i += 2) {
            while (input[i - 1] >= input[i]) {
                input[i]++;
                output++;
            }
            while (input[i] <= input[i + 1]) {
                input[i]++;
                output++;
            }
        }
        System.out.println(output);
        for (int i : input) {
            System.out.println(i);
        }
    }
}