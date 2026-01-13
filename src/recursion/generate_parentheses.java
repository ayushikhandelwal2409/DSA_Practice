package recursion;

public class generate_parentheses {
    public static void main(String[] args) {
        int n=2;
        parentheses(n,"",0, 0);
    }
    public  static void parentheses(int n,String ans,int closed,int open){
        if(closed==open && open==n){
            System.out.println(ans);
            return ;
        }
        if(closed>open || open>n){
            return ;
        }
        parentheses(n,ans+"(",closed,open+1);
        parentheses(n,ans+")",closed+1, open);
    }
}
