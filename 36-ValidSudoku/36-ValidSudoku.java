// Last updated: 8/30/2025, 10:45:38 AM
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0 ; i < 9 ;i++){
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') {
                    board[i][j] = '.';
                    if (!isitsafe(board, i, j, num)) {
                        return false;
                    }
                    board[i][j] = num;
                }
            }
        }
        return true;
        
    }
    public static boolean isitsafe(char[][] grid , int row , int col , char val) {
//		col
		for(int i = 0 ; i < 9 ; i++) {
			if(grid[row][i] == val) {
				return false;
			}
		}
//		row 
		for(int i = 0 ; i < 9 ; i++) {
			if(grid[i][col] == val) {
				return false;
			}
		}
//		3*3 matrix
		int r = row - row % 3;
		int c = col - col % 3;
		for(int i = r ; i < r + 3 ; i++) {
			for(int j = c ; j < c + 3 ; j++) {
				if(grid[i][j] == val) {
					return false;
				}
			}
		}
		return true;
		
	}
}
