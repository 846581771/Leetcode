class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length; 
        int n = obstacleGrid[0].length; 
        int [] dp = new int[n]; 
        dp[0] = obstacleGrid[0][0]==1?0:1; 
        for(int x = 0; x < m; x++)
        {
            for(int y = 0; y < n; y++)
            {
                if(obstacleGrid[x][y] == 1)
                {
                    dp[y] = 0; 
                    continue; 
                }
                if(y - 1 >= 0 && obstacleGrid[x][y - 1] == 0)
                {
                    dp[y]+= dp[y-1];
                }
            }
        }
        return dp[n-1];
    }
}
