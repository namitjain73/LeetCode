// Last updated: 10/7/2025, 1:50:53 PM
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        int len = 1;
        dp[0]=  nums[0];
        for(int i = 1 ; i < n ; i++){
            if(nums[i] > dp[len-1]){
                dp[len] = nums[i];
                len++;
            }else{
                int idx = BS(dp,0,len-1,nums[i]);
                dp[idx] = nums[i];
            }
        }
        return len;
    }
    public int BS(int[] dp ,int i ,int j , int ele){
        int ans = 0;
        while(i <= j){
            int mid = i + (j - i)/2;
            if(dp[mid] >= ele){
                ans = mid;
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        return ans;
    }
}