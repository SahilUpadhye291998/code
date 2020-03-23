package algorythms.string;

class ReverseString {
    public static void main(String[] args) {
        char[] input = "Hello world".toCharArray();
        int left = 0, right = input.length - 1;
        while (left < right) {
            char temp = input[right];
            input[right] = input[left];
            input[left] = temp;
            right--;
            left++;
        }
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
        }
    }
}