// Last updated: 10/6/2025, 11:49:47 AM
class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp =new int[word1.length()][word2.length()];
        for(int[] d : dp) Arrays.fill(d,-1);
        return solver(word1,word2,0,0,dp);
    }
    public int solver(String s1 , String s2 , int i , int j,int[][] dp){
        if(i == s1.length()){
            return s2.length()-j;
        }
        if(j == s2.length()){
            return s1.length() - i;
        }
        if(dp[i][j] != -1) return dp[i][j];

        int ans = 0;
        if(s1.charAt(i) != s2.charAt(j)){
            // insert
            int ins = solver(s1 , s2 , i , j+1,dp);
            // delete
            int del = solver(s1 , s2 , i + 1 ,j,dp);
            // replace
            int rep = solver(s1 , s2 , i+1 , j+1,dp);
            ans = Math.min(ins,Math.min(del,rep))+1;
        }
        else{
           ans = solver(s1,s2,i+1,j+1,dp);
        }
        return dp[i][j] = ans;
    }
}