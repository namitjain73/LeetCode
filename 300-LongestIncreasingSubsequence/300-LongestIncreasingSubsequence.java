// Last updated: 10/7/2025, 1:38:18 PM
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr,1);
        int max = 1;

        for(int i = 0 ; i < n ; i++){
            for(int j = i-1 ; j >= 0 ; j--){
                if(nums[j] < nums[i]){
                    arr[i] = Math.max(arr[i],arr[j]+1);
                    max = Math.max(max,arr[i]);
                    // break;
                }
            }
        }
        return max;
        
    }
}