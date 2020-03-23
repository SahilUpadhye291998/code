class Sample {
    public static void main(String[] args) {
        int a, b;

        StringBuilder builder = new StringBuilder("-100");
        int test = Integer.parseInt(builder.substring(1).toString());
        System.out.println(test);

    }

}