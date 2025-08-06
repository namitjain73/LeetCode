// Last updated: 8/6/2025, 6:53:51 PM
class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        for(int p = 1 ; p < n-2 ; p++){
            for(int q= p+1 ; q < n-1 ; q++){
                if(increasing(nums , 0 , p) && decreasing(nums , p, q) && increasing(nums , q, n-1)) return true;
            }
        }
        return false;
    }
    public boolean increasing(int[] nums , int start , int end){
        while(start < end){
            if(nums[start] >= nums[start+1]) return false;
            start++;
        }
        return true;
    }

    public boolean decreasing(int[] nums , int start , int end){
        while(start < end){
            if(nums[start] <= nums[start+1]) return false;
            start++;
        }
        return true;
    }
}