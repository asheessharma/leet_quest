class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row=obstacleGrid.length;
        int col=obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1){
        return 0;
    }
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(i==0 || j==0){
                //its previous cell is obstacle or current cell is obstacle.
                if(obstacleGrid[i][j]==1|| i!=0 && obstacleGrid[i-1][0]==0||j!=0 && obstacleGrid[i][j-1]==0){
                    obstacleGrid[i][j]=0;}
                else{
                    obstacleGrid[i][j]=1;}}
            else{
                if(obstacleGrid[i][j]==1){
                    obstacleGrid[i][j]=0;}
                else{
                    obstacleGrid[i][j]=obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
                }
            }
        }
    }
        return obstacleGrid[row-1][col-1];
}
    
}
