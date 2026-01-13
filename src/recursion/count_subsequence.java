package recursion;

//public class count_subsequence {
//    public static void main(String[] args) {
//        String s="abc";
//        print(s,"");
//        System.out.println("\n"+c);
//    }
//static int c=0;
//    public static void print(String s,String ans){
//        if(s.length()==0) {
//            System.out.print(ans+" ");
//            c++;
//            return ;}
//        char ch= s.charAt(0);
//        print(s.substring(1),ans);
//        print(s.substring(1),ans+ch);
//    }
//}


public class count_subsequence {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(count__subsequence(s,""));
    }
    public static int count__subsequence(String s,String ans){
        if(s.length()==0) {
            System.out.print(ans+" ");
            return 1;
        }
        char ch= s.charAt(0);
        int a=count__subsequence(s.substring(1),ans);
        int b=count__subsequence(s.substring(1),ans+ch);
        return a+b ;
    }
}
