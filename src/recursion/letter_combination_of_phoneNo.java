package recursion;

public class letter_combination_of_phoneNo {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public static void main(String[] args) {
        String s="2378";
        print(s,"");
    }
    public static void print(String s,String ans){
        if(s.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch=s.charAt(0);
        String  getString=key[ch-'0'];
        for (int i = 0; i < getString.length(); i++) {
            print(s.substring(1),ans+getString.charAt(i));
        }
    }
}
