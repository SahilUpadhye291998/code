package algorythms.stack_and_queue.stack;

import java.util.HashMap;
import java.util.Stack;

class InfixToPostFix {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        // char[] parentheses =
        // "(()])}[}[}[]][}}[}{})][[(]({])])}}(])){)((){".split("");
        String parentheses = "(())";
        // char[] parentheses = "(())".toCharArray();
        if (parentheses.length() % 2 != 0) {
            System.exit(0);
        }
        stack.push(parentheses.charAt(0));
        for (int i = 1; i < parentheses.length(); i++) {
            if (parentheses.charAt(i) == '(' || parentheses.charAt(i) == '[' || parentheses.charAt(i) == '{') {
                stack.push(parentheses.charAt(i));
            }
            if (!stack.isEmpty()) {
                if (parentheses.charAt(i) == ')' && stack.peek().equals('(')
                        || parentheses.charAt(i) == '}' && stack.peek().equals('{')
                        || parentheses.charAt(i) == ']' && stack.peek().equals('[')) {
                    stack.pop();
                }
            }
        }
        System.out.println(stack.isEmpty());
    }
}