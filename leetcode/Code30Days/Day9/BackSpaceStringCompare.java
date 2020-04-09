package leetcode.Code30Days.Day9;

public class BackSpaceStringCompare {
    public static void main(String[] args) {
        String input1 = "ab##";
        String input2 = "#c#d#";
        StringBuilder builder1 = new StringBuilder(input1);
        StringBuilder builder2 = new StringBuilder(input2);

        while (true) {
            int index = builder1.indexOf("#");
            if ((index >= 1)) {

                builder1.deleteCharAt(index);
                builder1.deleteCharAt(index - 1);

            } else {
                if (index != 0) {
                    break;
                }
                builder1.deleteCharAt(index);
            }
        }
        input1 = builder1.toString();

        while (true) {
            int index2 = builder2.indexOf("#");
            if ((index2 >= 1)) {

                builder2.deleteCharAt(index2);
                builder2.deleteCharAt(index2 - 1);

            } else {
                if (index2 != 0) {
                    break;
                }
                builder2.deleteCharAt(index2);
            }

        }
        input2 = builder2.toString();

        System.out.println(builder1);
        System.out.println(builder2);
        System.out.println(input1.equals(input2));

    }
}