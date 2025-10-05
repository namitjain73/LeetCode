// Last updated: 10/5/2025, 12:34:34 PM
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return solver(nums,k)-solver(nums,k-1);
    }
    public int solver(int[] arr , int k){
        int l = 0;
        int sum = 0;
        for(int r= 0 ; r < arr.length ; r++){
            if(arr[r] % 2 != 0) k--;

            while(k < 0){
                if(arr[l] % 2 != 0) k++;
                l++;
            }
            sum += (r - l + 1);
        }
        return sum;
    }
}