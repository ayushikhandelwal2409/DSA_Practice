package Assignment_8;

import java.util.Stack;

public class simplify_path {
    public static void main(String[] args) {
        String path = "/home/user/Documents/../Pictures";
        System.out.println(simplifyPath(path));
    }
    public static String simplifyPath(String path) {
        String[] components = path.split("/");
        Stack<String> st = new Stack<>();

        for (String comp : components) {
            if (comp.equals("") || comp.equals(".")) {
                continue;
            }

            if (comp.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(comp);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0, "/" + st.pop());
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }
}

//Input: path = "/home/user/Documents/../Pictures"
//Output: "/home/user/Pictures"
//tc=>O(n)
//sc=>O(n)