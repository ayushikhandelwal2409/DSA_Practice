package recursion;

public class tail_fact {
    public static int factorial(int n, int ans) {
        if(n==0){
            return ans;
        }
        return factorial(n-1,ans*n);
    }

    // up to down growing phase

    // ---------------------------------n=0
    // ans=1*5*4*3*2*1=120
    // 
    // ---------------------------------n=1
    // fact(1,1*5*4*3*2)
    //
    // ----------------------------------n=2
    // fact(2,1*5*4*3)
    //
    // --------------------------------- n=3
    //  fact(3,1*5*4)
    //
    // ----------------------------------n=4
    // fact(4,1*5)
    //
    // --------------------------------- n=5
    //  fact(5,1)
    //
    // ---------------------------------

    public static void main(String[] args) {
        System.out.println(factorial(5,1));
    }

}
