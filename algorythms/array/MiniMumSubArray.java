package algorythms.array;

public class MiniMumSubArray {
    public static void main(String[] args) {
        int[] input = new int[] { 2, 3, 1, 2, 4, 3 };
        int current = input[0];
        int minValue = input[0];

        for (int i = 1; i < input.length; i++) {
            current = Math.min(input[i] + current, input[i]);
            minValue = Math.min(minValue, current);
        }

        System.out.println(minValue);

    }
}