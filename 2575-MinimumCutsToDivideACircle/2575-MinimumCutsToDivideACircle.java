// Last updated: 8/7/2025, 12:41:14 AM
class Solution {
    public int numberOfCuts(int n) {
        if(n == 1) return 0;
        if(n % 2 == 0) return n / 2;
        return n;
    }
}