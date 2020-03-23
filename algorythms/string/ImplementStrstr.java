package algorythms.string;

class ImplementStrstr {
    public static void main(String[] args) {
        StringBuilder input = new StringBuilder("Hello");
        StringBuilder needle = new StringBuilder("ll");

        int output = input.indexOf("ll");

        System.out.println(output);

    }
}