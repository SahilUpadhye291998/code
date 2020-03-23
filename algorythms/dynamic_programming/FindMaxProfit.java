package algorythms.dynamic_programming;

class FindMaxProfit {
    public static void main(String[] args) {
        int[] input = new int[] { 7, 1, 5, 3, 6, 4 };
        int maxProfit = 0;
        for (int i = 0; i < input.length; i++) {
            int tempMaxProfit = 0;
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] < input[j]) {
                    tempMaxProfit = input[j] - input[i];
                }
                if (tempMaxProfit > maxProfit) {
                    maxProfit = tempMaxProfit;
                }
            }
        }
        System.out.println(maxProfit);
    }
}