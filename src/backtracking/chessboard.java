package backtracking;

import java.util.Scanner;

public class chessboard {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        print(n,0,0,n-1,n-1,"");
    }
    public static void print(int n,int cr,int cc,int er,int ec,String ans){
        if(cc==ec && cr==er){
            System.out.println(ans+"{"+cr+"-"+cc+"}");
            return;
        }
        if(cc>=n ||cr>=n){
            return;
        }
        //In any cell, the piece moves like a knight.But out of the possible 8 moves for a knight, only the positive ones are valid i.e. both row and column must increase in a move.
        print(n,cr+2,cc+1,er,ec,ans+"{"+cr+"-"+cc+"}K");
        print(n,cr+1,cc+2,er,ec,ans+"{"+cr+"-"+cc+"}K");
        //On the walls (4 possible walls), the piece can move like a rook as well (in addition of knight moves). But, only the positive moves are allowed i.e. as a rook, piece can move any number of steps horizontally or vertically but in a manner, such that row or column must increase.
        if(cc==0||cr==0||cr==er||cc==ec){
            //horizontally
            for (int i = 1; i <=n; i++) {
                print(n,cr,cc+i,er,ec,ans+"{"+cr+"-"+cc+"}R");
            }
            //vertically
            for (int i = 1; i <=n; i++) {
                print(n,cr+i,cc,er,ec,ans+"{"+cr+"-"+cc+"}R");
            }
        }
        //On the diagonals (2 possible diagonals), the piece can move like a bishop as well (in addition to the knight and possibly rook moves). But, only the positive moves are allowed i.e. as a bishop, piece can move in a way such that row and column must increase.
        if(cr==cc ||(cr+cc)==ec){
            for (int i = 1; i <=n; i++) {
                print(n,cr+i,cc+i,er,ec,ans+"{"+cr+"-"+cc+"}B");
            }
        }
    }
}
