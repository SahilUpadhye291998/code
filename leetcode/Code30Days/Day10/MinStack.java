package leetcode.Code30Days.Day10;

import java.util.Collections;
import java.util.Stack;

public class MinStack {

    private Stack<Integer> stack = null;
    int minElement = Integer.MIN_VALUE;

    public MinStack() {
        stack = new Stack();
    }

    public void push(int x) {
        if (x < minElement) {
            minElement = x;
        }
        stack.push(x);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return Collections.min(stack);
    }

}