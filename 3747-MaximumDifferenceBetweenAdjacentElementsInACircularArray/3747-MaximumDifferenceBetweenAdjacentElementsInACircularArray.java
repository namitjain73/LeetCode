// Last updated: 8/6/2025, 6:54:05 PM
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int max = 0;
        int i = 0;
        int j = 1;
        while(i < n && j < n){
            int abs = Math.abs(nums[i] - nums[j]);
            ans = Math.max(ans,abs);
            j++;
            i++;
        }
        ans = Math.max(ans,Math.abs(nums[0]-nums[n-1]));
        return ans;
        
        
    }
}