package oops;

public class add_number {
    public static void main(String[] args) {
        //compiletime overloading
//        Compile-time overloading, also known as static polymorphism, is achieved through method overloading, where multiple methods
//        share the same name but differ in their parameters (number, type, or sequence).
//        The compiler determines which method to call based on the arguments passed, resolving this at compile time.
        System.out.println(add(2,3));
        System.out.println(add(2,4,3));
        System.out.println(add(2,3,4.0));
        System.out.println(add(20,3,4,5,6,7,7,88,6,12));
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static int add(int a,int b,double c){
        return (int)(a+b+c);
    }
    public static int add(int...a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
