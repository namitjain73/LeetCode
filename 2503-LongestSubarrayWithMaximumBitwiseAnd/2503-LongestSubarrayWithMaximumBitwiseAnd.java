// Last updated: 8/6/2025, 6:59:35 PM
class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int n = nums.length;
        for(int i : nums) max = Math.max(i,max);

        int ans = 0;
        int len = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == max){
                len++;
                ans = Math.max(len,ans);
            }else{
                len = 0;
            }
        }

        return ans;

    }
}