class Solution {
    public int minPathSum(int[][] grid) {
        if(grid==null || grid.length==0 || grid[0].length==0){
            return 0; }
        int row=grid.length;
        int col=grid[0].length;
        int dp[][]=new int[row][col];
        dp[0][0]=grid[0][0];//first ele per cost same rahegi
        for(int i=1;i<row;i++){//to fill first row[ele]=row[curr]+row[prev]
            dp[i][0]=dp[i-1][0]+grid[i][0];
        }
        for(int j=1;j<col;j++){//to fill first col[curr]+col[prev]
            dp[0][j]=dp[0][j-1]+grid[0][j];
        }
        for(int i=1;i<row;i++){//for remaining blocks grid[curr]+min of (upper ele,prev right)
            for(int j=1;j<col;j++){
                dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[row-1][col-1];
    }
}