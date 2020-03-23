package algorythms.array;

class PlusOne {
    public static void main(String[] args) {
        int[] input = new int[] { 1, 9, 9 };
        for (int i = input.length - 1; i >= 0; i--) {
            if (input[i] >= 9) {
                try {
                    input[i - 1] = input[i - 1] + 1;
                    input[i] = 0;
                    if (input[i - 1] <= 9) {
                        break;
                    }
                } catch (Exception ex) {
                    int[] newArray = new int[input.length + 1];
                    newArray[0] = 1;
                    return;
                }
            } else {
                input[i]++;
                break;
            }
        }

    }
}