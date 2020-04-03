class Sample2 {
    public static void main(String[] args) {
        String array = "abcdefghijklmnopqrstuvwxyz";
        char input = "h".charAt(0);
        int temp = array.indexOf(input);
        int counter = 3;
        System.out.println(array.charAt((temp + counter) % 26));
    }
}