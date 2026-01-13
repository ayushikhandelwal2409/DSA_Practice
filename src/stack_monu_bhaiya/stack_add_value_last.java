package stack_monu_bhaiya;

import java.util.*;

public class stack_add_value_last {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int item=in.nextInt();
        Stack<Integer> s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s);
        reverse(s,item);
        System.out.println(s);
    }

    public static void reverse(Stack<Integer> s,int item) {
        if (s.isEmpty()) {
            s.push(item);
            return;
        }
        int val = s.pop();
        reverse(s,item);
        s.push(val);
    }
}
