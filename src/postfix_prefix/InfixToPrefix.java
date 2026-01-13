package postfix_prefix;

import java.util.*;
public class InfixToPrefix {
    private static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
        }
        return -1;
    }
    private static String infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
    public static String convert(String exp) {
        StringBuilder input = new StringBuilder(exp).reverse();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                input.setCharAt(i, ')');
            } else if (input.charAt(i) == ')') {
                input.setCharAt(i, '(');
            }
        }
        System.out.println(input.toString());
        String postfix = infixToPostfix(input.toString());
        return new StringBuilder(postfix).reverse().toString();
    }
    public static void main(String[] args) {
        String infix = "(A+B)*C";
        System.out.println("Infix: " + infix);
        System.out.println("Prefix: " + convert(infix));
    }
}
