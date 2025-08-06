// Last updated: 8/7/2025, 12:41:02 AM
class Solution {
    public int minLength(String s) {
            while(s.contains("AB") || s.contains("CD")){
                s = s.replace("AB","");
                s = s.replace("CD","");
            }
        return s.length();
        
    }
}