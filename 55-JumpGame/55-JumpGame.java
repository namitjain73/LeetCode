// Last updated: 10/1/2025, 2:17:37 PM
class Solution {
    public boolean canJump(int[] nums) {
        int jump = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(jump < i) return false;
            jump = Math.max(jump,i+nums[i]);
        }
        return true;
    }
}