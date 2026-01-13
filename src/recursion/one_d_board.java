package recursion;

public class one_d_board {
    public static void main(String[] args) {
        int n=4;
        System.out.println("\n"+print(n,0,""));
    }
    public static int print(int n,int curr,String ans){
        if(n==curr){
            System.out.println(ans);
            return 1;
        }
        if(curr>n){
            return 0;
        }
        int a=print(n,curr+1,ans+1);
        int b=print(n,curr+2,ans+2);
        int c=print(n,curr+3,ans+3);
        return a+b+c;
    }
}
