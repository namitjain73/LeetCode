// Last updated: 10/3/2025, 1:57:00 AM
class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1) return 0;
        int rc = 0;
        int jump = 0;
        int curr = 0;
        for(int i = 0 ; i < nums.length-1 ; i++){
            rc = Math.max(rc,i+nums[i]);
            if(i == curr){
                jump++;
                curr = rc;
            }
        }
        return jump;
    }
}