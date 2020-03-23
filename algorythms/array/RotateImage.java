package algorythms.array;

import sun.net.www.content.audio.wav;

class RotateImage {
    public static void main(String[] args) {
        int[][] input = new int[][] { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                int data = input[i][j];
                input[i][j] = input[j][i];
                input[j][i] = data;
            }
        }

         for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < (input.length / 2); j++) {
                int temp = input[i][j];
                input[i][j] = input[j][input.length - 1 - j];
                input[i][input.length - 1 - j] = temp;
            }
        }

      

    }

    public static void transpose(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                int data = input[i][j];
                input[i][j] = input[j][i];
                input[j][i] = data;
            }
        }
    }

    public static void reverse(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < (input.length / 2); j++) {
                int temp = input[i][j];
                input[i][j] = input[j][input.length - 1 - j];
                input[j][input.length - 1 - j] = temp;
            }
        }
    }
}