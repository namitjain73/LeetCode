// Last updated: 8/6/2025, 6:59:13 PM
class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i = 0 ;
        int j = nums.length-1;
        long n=0;
        while(i <= j){
            if(i == j){
                n += (long)nums[i];
            }
            else{
                String s = Integer.toString(nums[i]);
                s += Integer.toString(nums[j]);
                n += (long)Integer.parseInt(s);
            }
            i++;
            j--;
        }
        return n;
        
    }
}