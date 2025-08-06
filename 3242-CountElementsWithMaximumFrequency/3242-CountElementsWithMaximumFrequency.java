// Last updated: 8/6/2025, 6:54:35 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr  =new int[101];
        int max = 0;
        for(int i : nums) {
            arr[i]++;
            max = Math.max(max,arr[i]);
        }
        int ans = 0;
        for(int i : arr){
            if(i == max){
                ans += i;
            }
        }
        return ans;


        
    }
}