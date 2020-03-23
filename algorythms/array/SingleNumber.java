package algorythms.array;

class SingleNumber {
    public static void main(String[] args) {
        int[] input = new int[] { 2, 2, 1 };
        int a = 0;
        for (int i = 0; i < input.length; i++) {
            a ^= input[i];
        }
        System.out.println(a);
    }
}