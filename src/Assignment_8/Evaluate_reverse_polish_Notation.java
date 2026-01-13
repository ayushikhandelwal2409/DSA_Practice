package Assignment_8;


import java.util.Stack;

public class Evaluate_reverse_polish_Notation {
    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));

    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int ans=0;
        int n1=0;
        int n2=0;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                n1=st.pop();
                n2=st.pop();
                st.push(n1+n2);
            }
            else if(tokens[i].equals("-")){
                n1=st.pop();
                n2=st.pop();
                st.push(n2-n1);
            }
            else if(tokens[i].equals("*")){
                n1=st.pop();
                n2=st.pop();
                st.push(n1*n2);
            }
            else if(tokens[i].equals("/")){
                n1=st.pop();
                n2=st.pop();
                st.push(n2/n1);
            }
            else{
                st.push(Integer.valueOf(tokens[i]));
            }
        }
        return st.peek();
    }
}
//Input: tokens = ["2","1","+","3","*"]
//Output: 9
//tc=>O(n)
//sc=>O(n)