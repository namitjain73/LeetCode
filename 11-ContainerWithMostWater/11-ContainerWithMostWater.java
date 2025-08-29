// Last updated: 8/29/2025, 12:54:13 PM
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = height.length-1;
        int ans = 0;
        while(i < j){
            ans = Math.max(ans , (j-i) * Math.min(height[i],height[j]));
            if(height[i] < height[j]) i++;
            else j--;
        }
        return ans;
    }
}