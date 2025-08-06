// Last updated: 8/6/2025, 6:54:18 PM
class Solution {
    public char kthCharacter(int k) {
        String bin = Integer.toBinaryString(k-1);
        int c = 0;
        for(char ch : bin.toCharArray()){
            if(ch == '1') c++;
        }

        return (char)('a'+c);
    }
}