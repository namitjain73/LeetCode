// Last updated: 9/12/2025, 12:45:09 PM
class Solution {
    public boolean doesAliceWin(String s) {
        return s.chars().anyMatch(ch -> "aeiou".indexOf(ch) >= 0);
        
    }
}