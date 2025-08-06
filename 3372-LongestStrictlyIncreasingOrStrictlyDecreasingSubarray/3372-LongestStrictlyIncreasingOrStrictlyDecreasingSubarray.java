// Last updated: 8/6/2025, 6:54:31 PM
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max = 1;
        int inc = 1;
        int dec = 1;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i-1] < nums[i]){ inc++ ; dec = 1;}
            else if(nums[i-1] > nums[i]){ dec++ ; inc = 1;}
            else{inc = 1 ; dec  = 1;}
            max = Math.max(max,Math.max(inc,dec));
        }
        return max;
        
    }
}