// Last updated: 9/4/2025, 10:45:22 AM
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for(int i = 0 ; i < text1.length() ; i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(text1,text2,0,0,dp);
    }
    public int helper(String s1 , String s2 , int i , int j,int[][] dp){
        if(s1.length() == i || s2.length() == j) return 0;
        if(dp[i][j] != -1) return dp[i][j];



        int ans = 0;
        if(s1.charAt(i) == s2.charAt(j)){
            ans = 1 + helper(s1,s2,i+1,j+1,dp);
        }else{
            int l = helper(s1,s2,i+1,j,dp);
            int r = helper(s1,s2,i,j+1,dp);
            ans = Math.max(l,r);
        }
        return dp[i][j] = ans;
    }
}