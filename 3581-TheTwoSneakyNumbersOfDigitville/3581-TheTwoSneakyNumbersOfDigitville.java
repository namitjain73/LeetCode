// Last updated: 8/6/2025, 6:54:20 PM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        if(nums.length == 2) return nums;
        Arrays.sort(nums);
        int[] arr = new int[2];
        int k = 0;
        int i = 0 ;
        int j = 1;
        while(j < nums.length){
            if(nums[i] == nums[j]){
                arr[k] = nums[i];
                k++;
            }
            i++;
            j++;
        }
        return arr;
        
    }
}