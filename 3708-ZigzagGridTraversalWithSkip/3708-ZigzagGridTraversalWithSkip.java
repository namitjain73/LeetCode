// Last updated: 8/7/2025, 12:40:41 AM
class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        boolean flag = true;
       int j = 0;
        ArrayList<Integer> arrl = new ArrayList<Integer>();
        for(int i = 0 ; i < grid.length ; i++){
            if(flag){
                for( ; j < grid[0].length ; j+=2){
                    arrl.add(grid[i][j]);
                
                }
                flag = false;
            }
            else{
                if(grid[0].length % 2 == 0){
                    for(int k = j -1; k >= 0 ; k -= 2){
                        arrl.add(grid[i][k]);
                    }
                }
                else{
                    for(int k = j - 3 ; k >= 0 ; k -= 2){
                        arrl.add(grid[i][k]);
                    }
                }
                flag  = true;
                j = 0;
            }
        }
        return arrl;
        
    }
}