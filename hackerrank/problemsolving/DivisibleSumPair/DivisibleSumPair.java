package hackerrank.problemsolving.DivisibleSumPair;

public class DivisibleSumPair {
    public static void main(String[] args) {
        int[] input = new int[] { 1, 3, 2, 6, 1, 2 };
        int key = 3;
        int counter = 0;

        // to be included pairs
        /**
         * (1,4) = 5 % 5 = 0 == true (2,3) = 5 % 5 = 0 == true (4,6) = 15 % 5 = 0 ==
         * true
         */
        for (int i = 0; i < input.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < input.length; j++) {
                sum = input[i] + input[j];
                if (sum % key == 0) {
                    counter++;
                }

            }
        }
        System.out.println(counter);
    }
}