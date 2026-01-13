package backtracking;
import java.util.*;
public class n_knight {
    public static void main(String args[]) {
        // Your Code Here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[][] num = new boolean[n][n];
        System.out.print("\n"+answer(num,n,"",0,0));
    }
    public static int answer(boolean[][] num , int n,String ans,int row,int col){
//        if(col==num.length){
//            row++;
//            col=0;
//        }
        if(n==0){
            System.out.print(ans+" ");
            return 1;
        }
        if(row==num.length){
            return 0;
        }
        int c=0;
        while(row<num.length){
            if(col==num.length){
                row++;
                col=0;
            }
            if(row < num.length && isValid(num,row,col)){
                num[row][col] = true;
                c += answer(num,n-1,ans+"{"+row+"-"+col+"} ",row,col+1);
                num[row][col] = false;
            }
            col++;
        }
        return c;
    }
    public static boolean isValid(boolean[][] num , int row , int col){
        // check for knight
        int r=row,c=col;
        // left above
        while(r>=0 && c>=0){
            if(num[r][c]){
                return false;
            }
            r-=2;
            c--;
        }
        // left side
        r=row;c=col;
        while(r>=0 && c>=0){
            if(num[r][c]){
                return false;
            }
            r--;
            c-=2;
        }
        // right side
        r=row;c=col;
        while(r>=0 && c<num[0].length){
            if(num[r][c]){
                return false;
            }
            r--;
            c+=2;
        }
        // right above
        r=row;c=col;
        while(r>=0 && c<num.length){
            if(num[r][c]){
                return false;
            }
            r-=2;
            c++;
        }
        return true;
    }
}
