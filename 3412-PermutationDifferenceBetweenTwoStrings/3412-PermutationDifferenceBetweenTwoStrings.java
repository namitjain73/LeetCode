// Last updated: 8/6/2025, 6:54:28 PM
class Solution {
    public int findPermutationDifference(String s, String t) {
        int n = 0;
        for(int i = 0 ; i < s.length() ; i++){
            for(int j= 0  ; j < t.length() ; j++){
                if(s.charAt(i) == t.charAt(j)){
                    n += Math.abs(i - j);
                    break;
                }
            }
        }
        return n;
        
    }
}