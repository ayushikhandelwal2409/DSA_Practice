package recursion;

public class print {
    public static void main(String[] args) {
        int n=5;
        pri(n);
    }
    public static void pri(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        pri(n-1);
    }
}
