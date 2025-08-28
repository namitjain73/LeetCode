// Last updated: 8/28/2025, 6:34:29 PM
class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i = 0 ;i < s.length() ; i++){
            for(int j = s.length()-1 ; j >= 0 && j > i; j--){
                if(ispossible(s.substring(i,j+1))){
                    String s1 = s.substring(i,j+1);
                    if(ans.length() < s1.length()){
                        ans = s1;
                    }
                }
            }
        }
        if(ans.length() == 0  &&  s.length() >= 0){
            return Character.toString(s.charAt(0));
        }
        return ans;
        
    }

    public static boolean ispossible(String s){
        int lo = 0;
        int hi = s.length()-1;
        while(lo < hi){
            if(s.charAt(lo) != s.charAt(hi)){
                return false;
            }
            lo++;
            hi--;
        }
        return true;
    }
}