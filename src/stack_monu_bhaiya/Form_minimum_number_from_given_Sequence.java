package stack_monu_bhaiya;
import java.util.Scanner;
import java.util.Stack;

public class Form_minimum_number_from_given_Sequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr=new String[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.next();
            Stack<Integer> st=new Stack<>();
            int k=1;
            String s="";
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'I') {
                    s+=k;
                    k++;
                    while (!st.isEmpty()) {
                        s+=st.pop();
                    }
                } else{
                    st.push(k);
                    k++;
                }
            }
            s+=k;
            while(!st.isEmpty()) {
                s += st.pop();
            }
            System.out.println(s);
        }
    }
}
//5
//D
//21
//I
//12
//DD
//321
//II
//123
//IDI
//1324