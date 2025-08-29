// Last updated: 8/29/2025, 12:46:12 PM
class Solution {
    public boolean isPalindrome(int x) {
        String s  = Integer.toString(x);
        int i = 0;
        int j= s.length()-1;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;

        }
        return true;
    }
}