// Last updated: 10/3/2025, 1:55:12 AM
class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int curr= 0;
        int fre = 0;

        for(int i = 0 ; i < nums.length - 1; i++){
            fre = Math.max(fre , i+nums[i]);

            if(i == curr){
                jump++;
                curr = fre;
            }
        }

        return jump;
        
    }
}