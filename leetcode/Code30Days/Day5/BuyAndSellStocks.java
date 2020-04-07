package leetcode.Code30Days.Day5;

class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] input = new int[] { 7, 1, 5, 3, 6, 4 };
        int output = 0;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] < input[i + 1]) {
                output += input[i + 1] - input[i];
            }
        }
        System.out.println(output);
        System.out.println("asdf");
    }

}
