package algorythms.string;

class ValidPalandrom {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(input.toLowerCase());
        int left = 0, right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return;
            }
            left++;
            right--;
        }
        System.out.println("OK");
    }
}