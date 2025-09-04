// Last updated: 9/4/2025, 11:17:14 AM
class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        return helper(nums1,nums2);
    }
    public static int helper(int[] arr1, int[] arr2) {
        int[][] dp = new int[arr1.length+1][arr2.length+1];
        int ans = 0;
        for(int i = 1 ; i < dp.length ; i++) {
        	for(int j = 1 ; j < dp[0].length ; j++) {
        		if(arr1[i-1] == arr2[j-1]){
                    ans = 1 + dp[i-1][j-1];
                }else{
                    int l = dp[i-1][j];
                    int r = dp[i][j-1];
                    ans = Math.max(l,r);
                }
        		dp[i][j] = ans;
        		
        	}
        }
        
        return dp[dp.length-1][dp[0].length-1];
    }
}