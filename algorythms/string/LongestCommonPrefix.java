package algorythms.string;
class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] input = new String[] { "flower", "flow", "flee" };
        if(input.length==0) {return;}
        String prefix = input[0];
        for (int i = 1; i < input.length; i++) {
            while (input[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        System.out.println(prefix);
    }

}