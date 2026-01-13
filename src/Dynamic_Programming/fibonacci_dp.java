package Dynamic_Programming;

public class fibonacci_dp {
    public static void main(String[] args) {
        int n=5;
        int[] dp=new int[n+1];
        System.out.println(fib_td(dp,n));
        System.out.println(FibBU(n));
    }
    public  static int fib_td(int[] dp,int n){ // top-down approach==>memoization   tc is more than bottoms-up
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=0) return dp[n];
        int f1=fib_td(dp,n-1);
        int f2=fib_td(dp,n-2);
        return dp[n]=f1+f2;
    }
    public static int FibBU(int n) {//bottom-up ==>tabular  tc is less than top-down
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<dp.length;i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}



