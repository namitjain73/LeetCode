// Last updated: 10/5/2025, 7:19:15 PM
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] p = new int[n+1];
        boolean[] valid = new boolean[n+1];
        for(int i = 0 ; i < trust.length ; i++){
            p[trust[i][1]]++;
            valid[trust[i][0]] = true;
        }

        for(int i = 1 ; i <= n ; i++){
            if(!valid[i] && p[i] == (n-1)) return i;
        }
        return -1;
    }
}