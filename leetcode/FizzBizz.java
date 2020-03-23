package leetcode;

class FizzBizz {
    public static void main(String[] args) {
        int input = 15;
        String[] output = new String[input];
        for (int i = 0; i < input; i++) {

            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                output[i] = "FizzBizz";
            } else if ((i + 1) % 3 == 0) {
                output[i] = "Fizz";
            } else if ((i + 1) % 5 == 0) {
                output[i] = "Bizz";
            } else {
                output[i] = String.valueOf(i + 1);
            }
        }

        for (String string : output) {
            System.out.println(string);
        }
    }
}