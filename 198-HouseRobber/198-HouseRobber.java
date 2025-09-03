// Last updated: 9/3/2025, 11:10:20 AM
class Solution {
    public int rob(int[] nums) {
    int[] dp = new int[nums.length+1];
    Arrays.fill(dp,-1);
    return helper(nums,0,dp);
    }
    public int helper(int[] arr , int i, int[] dp){
        if(i > arr.length-1) return 0;
        if(i == arr.length-1) return arr[i];
        if(dp[i] != -1) return dp[i];

        int inc = helper(arr,i+2,dp)+arr[i];
        int ex = helper(arr,i+1,dp);
        return dp[i] = Math.max(inc,ex);

    }
}

















































 