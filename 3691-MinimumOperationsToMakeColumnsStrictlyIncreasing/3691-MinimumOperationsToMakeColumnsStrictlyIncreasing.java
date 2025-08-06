// Last updated: 8/6/2025, 6:54:11 PM
class Solution {
    public int minimumOperations(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 1 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(grid[i][j] <= grid[i-1][j]){
                    ans += grid[i - 1][j] - grid[i][j] + 1;
                    grid[i][j] += grid[i - 1][j] - grid[i][j] + 1;
                    
                }
            }
        }
        return ans;
        
    }
}