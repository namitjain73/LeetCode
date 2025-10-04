// Last updated: 10/4/2025, 11:26:15 PM
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n < 2){
            return nums[0];
        }
        int[] dp = new int[n+1];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        int max = 0;
        for(int i =2 ; i < n ;i++){
            int take = dp[i-2] + nums[i];
            int skip = dp[i-1];
            dp[i] = Math.max(take,skip);
        }


        return dp[n-1];
        
    }
}