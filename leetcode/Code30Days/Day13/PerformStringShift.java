package leetcode.Code30Days.Day13;


/**
 * a b c [ 0 ,1 ] => b c a 
 * b c a [ 1 ,2 ] => c a b 
 * 
 * a b c d e f g [1, 1] => g a b c d e f
 * g a b c d e f [1, 1] => f g a b c d e
 * f g a b c d e [0, 2] => a b c d e f g
 * a b c d e f g [1, 3] => e f g a b c d
 */

public class PerformStringShift {

    public static void main(String[] args) {
        String inputString = "abcdefg";
        int[][] shift = new int[][]{{1,1},{1,1},{0,2},{1,3}};
    
        for (int i = 0; i < shift.length; i++) {
            if(shift[i][0]==0){
                inputString = inputString.substring(shift[i][1]) + inputString.substring(0, shift[i][1]);
                System.out.println(inputString);
            }else{
                inputString = inputString.substring(inputString.length()-shift[i][1]) +
                              inputString.substring(0, inputString.length()-shift[i][1]);
                System.out.println(inputString);
            }
        }

    }

}