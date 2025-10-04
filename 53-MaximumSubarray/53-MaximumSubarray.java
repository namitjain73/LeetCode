// Last updated: 10/4/2025, 11:33:17 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if(n < 2) return nums[0];
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += nums[i];
            max = Math.max(max,sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}