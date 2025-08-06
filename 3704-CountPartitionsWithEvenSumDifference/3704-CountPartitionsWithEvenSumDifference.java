// Last updated: 8/6/2025, 6:54:09 PM
class Solution {
    public static int countPartitions(int[] nums) {
        int n = 0;
        for(int i = 0; i < nums.length ; i++){
            n += nums[i];
        }
        int count = 0;
        for(int i = 0 ; i < nums.length-1 ; i++){
            n -= 2*nums[i];
            if(n % 2  == 0){
                count++;
            }
        }
        return count;
        
    }
}