package algorythms.stack_and_queue.stack;

class Stack {
    private static final int LIMIT = 5;
    private int counter;
    public int[] data;

    public Stack() {
        data = new int[LIMIT];
    }

    public boolean push(int data) {
        boolean flag = false;
        if (counter < LIMIT) {
            this.data[counter] = data;
            this.counter++;
            flag = true;
        } else {
            System.err.println("StackOverFlow in Stack");
        }
        return flag;
    }

    public boolean pop() {
        boolean flag = false;
        if (!isEmpty()) {
            counter--;
            flag = true;
        } else {
            System.err.println("StackUnderFlow in Stack");
        }
        return flag;
    }

    public boolean isEmpty() {
        return (counter <= 0);
    }

    public void show() {
        for (int i = counter - 1; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }

}