package random;

import java.util.Random;

public class random_no {
    public static void main(String[] args) {
        int si=10;
        int ei=100;
        Random rn=new Random();
        for (int i = 0; i < 10; i++) {
            int x=rn.nextInt(ei-si+1)+si;
            System.out.println(x);
        }
    }
}


//(ei-si+1)==range from 0 to 90 i.e.(total 91)
// 0+si=10 and 90+si=100  (will give in range 10 to 100)