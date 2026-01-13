package backtracking;

public class maze_path {
    // cr----> curr row
    // cc----> curr col
    // er----> end col
    // ec----> end col
    public static void path(int cr,int cc,int er,int ec,String ans) {
        if(cr==er && cc==ec){
            System.out.println(ans);
            return;
        }
        if(cr > er || cc > ec){
            return;
        }
        path(cr, cc+1, er, ec, ans+"H");
        path(cr+1, cc, er, ec, ans+"V");


    }
    public static void main(String[] args) {
        int m=3;
        int n=3;
        path(0, 0, m-1, n-1, "");
    }
}

