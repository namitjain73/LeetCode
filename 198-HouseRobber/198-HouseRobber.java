// Last updated: 9/3/2025, 11:28:51 AM
class Solution {
    public int rob(int[] arr) {
        if(arr.length < 2) return arr[arr.length-1];
		int n = arr.length;
		int[] dp = new int[arr.length+1];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0],arr[1]);
		for(int i = 2; i < arr.length ; i++) {
			dp[i] = Math.max(dp[i-1], dp[i-2]+ arr[i]);
		}
		return dp[n-1];
	}
}

















































 