package algorythms.string;

class CountAndSay {
    public static void main(String[] args) {
        int input = 4; // 21
        String start = "1";
        while (--input != 0) {
            int i = 0;
            String newString = "";
            while (i < start.length()) {
                int count = 1;
                while (i + 1 < start.length() && start.charAt(i) == start.charAt(i + 1)) {
                    ++i;
                    ++count;
                }
                // this takes care of iteration where input is 2
                newString += String.valueOf(count) + start.charAt(i);
                i++;
            }
            start = newString;
        }
        System.out.println(start);
    }
}

/**
 * https://www.youtube.com/watch?v=JQOGiecrsaQ
 */