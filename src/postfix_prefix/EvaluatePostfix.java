package postfix_prefix;
import java.util.*;
public class EvaluatePostfix {
    private static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }
    public static int evaluate(String exp) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else if (isOperator(c)) {
                int val2 = stack.pop();
                int val1 = stack.pop();
                switch (c) {
                    case '+': stack.push(val1 + val2); break;
                    case '-': stack.push(val1 - val2); break;
                    case '*': stack.push(val1 * val2); break;
                    case '/': stack.push(val1 / val2); break;
                    case '^': stack.push((int)Math.pow(val1, val2)); break;
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String postfix = "35+2*"; // (3+5)*2
        System.out.println("Postfix: " + postfix);
        System.out.println("Result: " + evaluate(postfix));
    }
}
