// Last updated: 8/28/2025, 7:26:27 PM
class Solution {
    public String longestPalindrome(String s) {
        if(s.length() < 2) return s;
        String ans = "";
        int left=0;
        int right = 0;
        for(int i = 0 ; i< s.length() ; i++){
            left = i;
            right = i;
            while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                if (right - left + 1 > ans.length()) {
                    ans = s.substring(left, right + 1);
                }
                left--;
                right++;
            }
            left = i;
            right = i+1;

            while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                if (right - left + 1 > ans.length()) {
                    ans = s.substring(left, right + 1);
                }
                left--;
                right++;
            }
        }
        
        return ans;
    }
    public boolean isPalindrom(String s){
        int i = 0 ;
        int j = s.length()-1;

        while(i <= j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}