package recursion;

public class fibo {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fibo(n));
    }
    public static int fibo(int n){
        if(n==0 || n==1) return n;
        return fibo(n-1)+fibo(n-2);
    }
}


//package recursion;
//
//public class fibo {
//    public static void main(String[] args) {
//        int n=5;
//        for (int i = 0; i <= n; i++) {
//            System.out.print(fibo(i)+" ");
//        }
//    }
//    public static int fibo(int n){
//        if(n==0 || n==1) return n;
//        return fibo(n-1)+fibo(n-2);
//    }
//}
//0/p=====0 1 1 2 3 5
