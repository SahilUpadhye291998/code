package hackerrank.problemsolving.dayofprogrammer;

public class DayOfProgrammer {
    public static void main(String[] args) {
        int input = 1916;
        if (input == 1918) {
            System.out.println("26.9." + input);
        } else if (input <= 1917) {
            // Julian year
            if (input % 4 == 0) {
                System.out.println("12.09." + input);
            } else {
                System.out.println("13.09." + input);
            }
        } else {
            // gregorian year
            if ((input % 400 == 0) || (input % 4 == 0 && input % 100 != 0)) {
                System.out.println("12.09." + input);
            } else {
                System.out.println("13.09." + input);
            }
        }

    }
}