import java.util.Arrays;
import java.util.Scanner;

class Sample {
    public static void main(String[] args) {
        int m;
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter M an N:");
        m = scanner.nextInt();
        n = scanner.nextInt();
        int[][] input = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                input[i][j] = scanner.nextInt();
            }
        }
        maximum(input, m, n);
        scanner.close();

    }

    public static void maximum(int[][] input, int m, int n) {
        int max[] = new int[m];

        for (int i = 0; i < input.length; i++) {
            Arrays.sort(input[i]);
        }

        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(input[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        for (int i = 0; i < m; i++) {
            System.out.print(input[i][input[i].length - 1] + " ");
        }

    }

}

/**
 * 100 198 333 323 122 232 221 111 223 565 245 764
 */
