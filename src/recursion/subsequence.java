package recursion;

public class subsequence {
    public static void main(String[] args) {
    String s="abc";
    print(s,"");
    }
    public static void print(String s,String ans){
        if(s.length()==0) {
            System.out.print(ans+" ");
            return ;}
        char ch= s.charAt(0);
        print(s.substring(1),ans);
        print(s.substring(1),ans+ch);
    }
}
// subsequence of abc====  nothing,a,b,c,ab,bc,ac,abc
//a===  nothing,a
//ab==  nothing,a,b,ab