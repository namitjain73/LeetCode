// Last updated: 8/31/2025, 6:02:29 PM
class Solution {
    public int[] searchRange(int[] nums, int t) {
        int[] arr = new int[2];
        Arrays.fill(arr,-1);
        boolean start = true;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == t){
                arr[1] = i;
            }
            if(nums[i] == t && start){
                arr[0] = i;
                start = false;
            }
        }
        return arr;
        
    }
}