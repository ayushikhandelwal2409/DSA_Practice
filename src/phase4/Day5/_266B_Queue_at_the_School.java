package phase4.Day5;

import java.util.Scanner;

public class _266B_Queue_at_the_School {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        String s=in.next();
        while(m>0){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<n;i++){
                if(i>0 && i<n-1 && s.charAt(i-1)=='B' && s.charAt(i)=='G' && s.charAt(i+1)=='G'){
                    sb.setCharAt(i-1,'G');
                    sb.append('B');
                    sb.append('G');
                    i++;
                    continue;
                }
                else if(i>0 && s.charAt(i-1)=='B' && s.charAt(i)=='G'){
                    sb.setCharAt(i-1,'G');
                    sb.append('B');
                    continue;
                }
                sb.append(s.charAt(i));
            }
            s=sb.toString();
            m--;
        }
    System.out.println(s);
    }
}
//Examples
//InputCopy
//5 1
//BGGBG
//OutputCopy
//GBGGB
//InputCopy
//5 2
//BGGBG
//OutputCopy
//GGBGB
//InputCopy
//4 1
//GGGB
//OutputCopy
//GGGB
