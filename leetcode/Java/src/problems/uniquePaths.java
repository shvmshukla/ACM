package problems;

/**
 * Created by Martin on 13/02/2016.
 */
public class uniquePaths {
    /**
     * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
     * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right
     * corner of the grid (marked 'Finish' in the diagram below).
     * How many possible unique paths are there?
     * <p>
     * Dynamic programming.
     */

    public static int uniquePaths(int m, int n) {
//        Dynamic programming.
//        if(m==0 || n==0) return 0;
//        if(m==1 || n==1) return 1;
//
//        int[][] dp = new int[m][n];
//
//        //left column
//        for(int i=0; i<m; i++){
//            dp[i][0] = 1;
//        }
//
//        //top row
//        for(int j=0; j<n; j++){
//            dp[0][j] = 1;
//        }
//
//        //fill up the dp table
//        for(int i=1; i<m; i++){
//            for(int j=1; j<n; j++){
//                dp[i][j] = dp[i-1][j] + dp[i][j-1];
//            }
//        }
//
//        return dp[m-1][n-1];
        return dfs(1, 1, m, n);
//        if(m==1 || n==1) return 1;
//        return uniquePaths(m-1, n) + uniquePaths(m, n-1);
    }

    private static int dfs(int row, int col, int m, int n) {
        if (row == m && col == n) {
            System.out.println(row);
            System.out.println(col);
            System.out.println(1);
            System.out.println("------");
            return 1;
        }
        if (row > m || col > n) {
            System.out.println(row);
            System.out.println(col);
            System.out.println(0);
            System.out.println("------");
            return 0;
        }
        return dfs(row + 1, col, m, n) + dfs(row, col + 1, m, n);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println(uniquePaths(2, 3));

    }
}
