// Last updated: 8/6/2025, 6:59:10 PM
class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length < 3){
            return -1;
        }
        return nums[nums.length/2];
        
    }
}