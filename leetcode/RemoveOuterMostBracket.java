package leetcode;

import java.util.Stack;

class RemoveOuterMostBracket {
    public static void main(String[] args) {
        String input = "(()())((()()))";
        StringBuilder output = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();
        stack.push(input.charAt(0));
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push(input.charAt(i));
                continue;
            }
            if (stack.size() == 1) {
                stack.clear();
                continue;
            }
            if (input.charAt(i) == ')') {
                output.append(String.valueOf(input.charAt(i - 1))).append(String.valueOf(input.charAt(i)));
                stack.pop();
            }
            System.out.println(stack);
        }
        System.out.println(output);
    }
}