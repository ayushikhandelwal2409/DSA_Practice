package backtracking;

public class palindromic_sub {
    public static void main(String[] args) {
        String s="nitin";
        count_palindromic(s);
    }
    public static void count_palindromic(String s) {
        // odd palindrome check
        int odd=0;
        for(int axis=0;axis<s.length();axis++) {
            for(int orbit=0;axis-orbit>=0 && axis+orbit<s.length();orbit++) {
                if(s.charAt(axis-orbit)!=s.charAt(axis+orbit)) {
                    break;
                }
                odd++;
            }
        }

        // even palindrome check
        int even=0;
        for(double axis=0.5;axis<s.length();axis++) {
            for(double orbit=0.5;axis-orbit>=0 && axis+orbit<s.length();orbit++) {
                if(s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit)) ){
                    break;
                }
                even++;
            }
        }

        System.out.println("Even p: "+even);
        System.out.println("odd p: "+odd);
        System.out.println("total p: "+(even+odd));
    }


    public static boolean ispalindrome(String s){
        int i=0;
        int j =s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}
