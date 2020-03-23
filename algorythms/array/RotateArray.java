package algorythms.array;

class RotateArray {
    public static void main(String[] args) {
        int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7};
        int k = 3, counter = 0;

        if (input.length <= 1) {
            return;
        }
        if (k > input.length) {
            k = k%input.length ;
        }

        k = input.length - k;

        int[] temp = new int[k];
        int[] output = new int[input.length];
        for (int i = 0; i < k; i++) {
            temp[i] = input[i];
        }

        for (int i = k; i < input.length; i++) {
            input[counter] = input[i];
            counter++;
        }

        for (int i : temp) {
            input[counter] = i;
            counter++;
        }

        for (int i = 0; i < output.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();

    }
}