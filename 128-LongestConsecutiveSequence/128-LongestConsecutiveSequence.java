// Last updated: 8/27/2025, 12:30:31 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int max = 1;
        int sum = 1;


        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i-1] == nums[i]) continue;
            else if(nums[i-1] == nums[i]-1) sum++;
            else sum = 1;
            max = Math.max(max,sum);
        }
        return max;
    }
}