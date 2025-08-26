// Last updated: 8/26/2025, 5:04:38 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] arr) {

        double max = 0.0;
        int idx = 0;
        int n = arr.length;
        int res = 0;
        for (int[] rect : arr) {
            int l = rect[0], b = rect[1];
            double d = Math.sqrt((double)l * l + (double)b * b);
            
            if (d > max) {
                max = d;
                res = l * b;
            } else if (d == max) {
                res = Math.max(res, l * b);
            }
        }
        return res;
        
    }
}