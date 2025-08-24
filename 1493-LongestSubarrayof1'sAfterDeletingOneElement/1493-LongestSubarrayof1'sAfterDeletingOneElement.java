// Last updated: 8/24/2025, 1:17:12 PM
class Solution {
    public int longestSubarray(int[] nums) {
        int ans  = 0;
        int max = 0;
        int str = 0;
        int zero = 0;

        for(int end = 0 ; end < nums.length;end++){
            if(nums[end] == 0) zero++;
            while(zero > 1){
                if(nums[str] == 0){
                    zero--;
                }
                str++;
            }

            max = Math.max(max , end-str);
            
        }

        // if(max == nums.length) return --max;
        return max;
    }
}