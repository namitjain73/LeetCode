// Last updated: 8/6/2025, 6:54:08 PM
class Solution {
    public int subarraySum(int[] nums) {
        int result = 0;
        for(int i = 0 ;i < nums.length ;i++){
            int start = Math.max(0,i-nums[i]);
            for(int j = start ; j<= i ;j++){
                result += nums[j];
            }
        }
        return result;
        
    }
}