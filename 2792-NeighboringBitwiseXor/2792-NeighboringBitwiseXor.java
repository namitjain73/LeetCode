// Last updated: 8/6/2025, 6:59:16 PM
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n = 0;
        for(int x : derived){
            n ^= x;
        }

        return n == 0;
        
    }
}