package phase4.Day1;

import java.util.ArrayList;
import java.util.Arrays;

public class sieve_of_eratosthenes {
    public static void main(String[] args) {
        int n=100;
        ArrayList<Integer> ans=new ArrayList<>();
        sieve(n,ans);
        System.out.println(ans);
        System.out.println(ans.size());
    }
    public static void sieve(int n,ArrayList<Integer> ll){
        boolean[] checkPrime=new boolean[n+1];
        Arrays.fill(checkPrime,true);
        checkPrime[0]=false;
        checkPrime[1]=false;
        for(int i=0;i*i<=n;i++){
            if(checkPrime[i]){
                for (int j = i * i; j <=n; j += i) {
                    checkPrime[j] = false;
                }
            }
        }
        for (int i = 0; i <=n; i++) {
            if(checkPrime[i]){
                ll.add(i);
            }
        }
    }
}
//[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
//25