// Last updated: 10/5/2025, 5:12:22 PM
class Solution {
    public boolean predictTheWinner(int[] nums) {
        int sum = 0;
        for(int i : nums) sum += i;
        int[][] dp = new int[nums.length][nums.length];
        for(int[] d : dp) Arrays.fill(d,-1);
        int ans = solver(nums,0,nums.length-1,dp);
        if((sum-ans) > ans) return false;
        else return true;
    }
    public int solver(int[] nums , int i , int j,int[][] dp){
        if(i > j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int ls = nums[i] + Math.min(solver(nums , i+2 ,j,dp) , solver(nums,i+1,j-1,dp));
        int fs = nums[j] + Math.min(solver(nums , i+1 , j-1,dp) , solver(nums,i , j-2,dp));
        return dp[i][j] =  Math.max(ls,fs);
    }
}