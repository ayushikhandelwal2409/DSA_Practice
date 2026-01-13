package faltu;

import stack.Stack;

import java.util.*;
public class morre_s_voting_max_ocuurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        int c=1;
        char k=word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            if(word.charAt(i)==k){
                c++;
            }
            else{
                c--;
                if(c==0) {
                    c = 1;
                    k = word.charAt(i);
                }
            }
        }
        System.out.println(k);
    }
}
