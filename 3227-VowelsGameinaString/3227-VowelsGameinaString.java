// Last updated: 9/12/2025, 12:41:29 PM
class Solution {
    public boolean doesAliceWin(String s) {
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch== 'u'){
                return true;
            }
        }
        return false;
        
    }
}