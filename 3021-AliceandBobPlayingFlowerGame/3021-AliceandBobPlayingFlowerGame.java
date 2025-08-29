// Last updated: 8/29/2025, 11:32:58 PM
class Solution {
    public long flowerGame(int n, int m) {
        return (((long)n + 1)/2 * ((long)m/2)) + (long)((long)(n)/2 * (((long)m+1)/2));
    }
}