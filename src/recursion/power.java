package recursion;

public class power {
    public static void main(String[] args) {
        int a=3;
        int n=4;
        System.out.println(pow(a,n));
    }
    public static int pow(int a,int n){
        if(n==0) return 1;
        int fn=pow(a,n-1);
        return fn*a;
    }
}
