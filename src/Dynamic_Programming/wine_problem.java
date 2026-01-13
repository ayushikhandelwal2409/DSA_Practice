package Dynamic_Programming;
//Given a row of n wines, with integers representing the cost of each wine. You can sell the first or last wine in a row every year. The cost of wine, on the other hand, rises over time. Let the initial profits from the wines be P1, P2, P3…Pn. In the Yth year, the profit from the ith wine will be Y*Pi.
//
//The goal is to calculate the maximum profit that can be made by selling all of the wines.
public class wine_problem {
    public static void main(String[] args) {
        int [] wine={2,4,6,2,5} ;//==>64
        System.out.println(max_profit(wine,0,wine.length-1,1));
        System.out.println(max_proBU(wine));
    }
    // top-down
    public static int max_profit(int []wine,int i,int j,int year) {
        if(i>j) {
            return 0;
        }
        int fsell=wine[i]*year+max_profit(wine,i+1,j,year+1);
        int Lsell=wine[j]*year+max_profit(wine,i,j-1,year+1);
        return Math.max(fsell, Lsell);
    }

    //	 bottom up approach
    public static int max_proBU(int [] wine) {
        int n = wine.length;
        int[][] dp = new int[n][n];
        int year = n;

        // Base case: when only one bottle remains
        for (int i = 0; i < n; i++) {
            dp[i][i] = wine[i] * year;
        }

        // Fill DP table for all possible lengths
        for (int len = 2; len <= n; len++) {
            year = n - len + 1;  // Calculate current year
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                int fsell = wine[i] * year + dp[i + 1][j];
                int Lsell = wine[j] * year + dp[i][j - 1];
                dp[i][j] = Math.max(fsell, Lsell);
            }
        }

        return dp[0][n - 1];  // Max profit for full range
    }
}

//price = 2*1 = 2, remaining WinePrice = [ 4, 6, 2, 5 ], Profit = 2
//price = 5*2 = 10, remaining WinePrice = [ 4, 6, 2 ], Profit = 12
//price = 2*3 = 6, remaining WinePrice = [ 4, 6], Profit = 18
//price = 4*4 = 16, remaining WinePrice = [ 6 ], Profit = 34
//price = 6*5 = 30, remaining WinePrice = [ ], Profit = 64


//{2,3,5,1,4};==>50