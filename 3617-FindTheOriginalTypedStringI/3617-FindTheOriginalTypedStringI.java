// Last updated: 8/6/2025, 6:54:17 PM
class Solution {
    public int possibleStringCount(String word) {
        int c = 1;
        char pre = word.charAt(0);
        for(int i = 1 ; i < word.length();  i++){
            if(pre == word.charAt(i)){
                c++;
            }else{
                pre = word.charAt(i);
            }
        }
        return c;
    }
}