// Last updated: 8/6/2025, 6:54:15 PM
class Solution {
    public boolean canAliceWin(int n) {
        int ans =0;
        int count = 10;
        while(n >= count){
            n -= count;
            count -=1;
            ans++;
        }
        return ans%2!=0;
        
    }
}