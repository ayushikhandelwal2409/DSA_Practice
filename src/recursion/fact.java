package recursion;

public class fact {
    public static void main(String[] args) {
        int n=10;
        System.out.println(fac(n));
    }
    public static int fac(int n){
        if(n==0) return 1;
        int fn=fac(n-1);
        return fn*n;
    }
}
