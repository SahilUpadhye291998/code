package algorythms.array;

class TwoSum {
    public static void main(String[] args) {
        int[] input = new int[] { 11, 7, 2, 15 };
        int[] output = new int[2];
        int target = 9;
        for (int i = 0; i < input.length; i++) {
            int num = target - input[i];
            for (int j = i + 1; j < input.length; j++) {
                if (num == input[j]) {
                    output[0] = i;
                    output[1] = j;
                }
            }
        }
    }
}