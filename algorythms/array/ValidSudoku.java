package algorythms.array;

import java.util.HashSet;
import java.util.Set;

class ValidSudoku {
    public static void main(String[] args) {
        char[][] test = new char[][]

        { { '.', '.', '.', '.', '5', '.', '.', '1', '.' }, { '.', '4', '.', '3', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '3', '.', '.', '1' }, { '8', '.', '.', '.', '.', '.', '.', '2', '.' },
                { '.', '.', '2', '.', '7', '.', '.', '.', '.' }, { '.', '1', '5', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '2', '.', '.', '.' }, { '.', '2', '.', '9', '.', '.', '.', '.', '.' },
                { '.', '.', '4', '.', '.', '.', '.', '.', '.' } };

        boolean temp = checkSol(test);
        System.out.println(temp);
    }

    public static boolean checkSol(char[][] board) {
        boolean checkCol, checkRow, checkInnerMat;
        checkCol = checkRow = checkInnerMat = false;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        checkCol = checkColounm(board);
        checkRow = checkRow(board);
        checkInnerMat = checkInnerMatrix(board);
        System.out.println(checkCol);
        System.out.println(checkRow);
        System.out.println(checkInnerMat);
        return checkCol && checkRow && checkInnerMat;
    }

    public static boolean checkColounm(char[][] board) {
        boolean flag = true;
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<Character>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.') {
                    continue;
                }
                if (set.contains(board[j][i])) {
                    flag = false;
                    return flag;
                }
                set.add(board[j][i]);
            }
        }
        return flag;
    }

    public static boolean checkRow(char[][] board) {
        boolean flag = true;
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<Character>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (set.contains(board[i][j])) {
                    flag = false;
                    return flag;
                }
                set.add(board[i][j]);
            }
        }
        return flag;
    }

    public static boolean checkInnerMatrix(char[][] board) {
        boolean flag = true;
        // first
        
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (set.contains(board[i][j])) {
                    flag = false;
                    return flag;
                }
                set.add(board[i][j]);
            }
        }
        // second
        set = new HashSet<Character>();
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 6; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (set.contains(board[i][j])) {
                    flag = false;
                    return flag;
                }
                set.add(board[i][j]);
            }
        }

        // third
        set = new HashSet<Character>();
        for (int i = 0; i < 3; i++) {
            for (int j = 6; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (set.contains(board[i][j])) {
                    flag = false;
                    return flag;
                }
                set.add(board[i][j]);
            }
        }

        /**
         * "==================================================="
         */
        set = new HashSet<Character>();
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (set.contains(board[i][j])) {
                    flag = false;
                    return flag;
                }
                set.add(board[i][j]);
            }
        }
        // second
        set = new HashSet<Character>();
        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 6; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (set.contains(board[i][j])) {
                    flag = false;
                    return flag;
                }
                set.add(board[i][j]);
            }
        }

        // third
        set = new HashSet<Character>();
        for (int i = 3; i < 6; i++) {
            for (int j = 6; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (set.contains(board[i][j])) {
                    flag = false;
                    return flag;
                }
                set.add(board[i][j]);
            }
        }

        /**
         * "==================================================="
         */
        set = new HashSet<Character>();
        for (int i = 6; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (set.contains(board[i][j])) {
                    flag = false;
                    return flag;
                }
                set.add(board[i][j]);
            }
        }
        // second
        set = new HashSet<Character>();
        for (int i = 6; i < 9; i++) {
            for (int j = 3; j < 6; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (set.contains(board[i][j])) {
                    flag = false;
                    return flag;
                }
                set.add(board[i][j]);
            }
        }

        // third
        set = new HashSet<Character>();
        for (int i = 6; i < 9; i++) {
            for (int j = 6; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (set.contains(board[i][j])) {
                    flag = false;
                    return flag;
                }
                set.add(board[i][j]);
            }
        }

        return true;
    }
}