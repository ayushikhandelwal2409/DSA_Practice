package phase4.Day2;

import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {
        String  s = "()[]{}";//true
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char openingBracket = stack.pop();
                if ((c == ')' && openingBracket != '(') ||
                        (c == ']' && openingBracket != '[') ||
                        (c == '}' && openingBracket != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
