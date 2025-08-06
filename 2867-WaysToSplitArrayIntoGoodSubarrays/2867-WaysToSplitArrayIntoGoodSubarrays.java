// Last updated: 8/6/2025, 6:54:45 PM
class Solution {
    public int numberOfGoodSubarraySplits(int[] nums) {
        long ans = 0;
        int hi =0;
        int lo= -1;
        int mod = 1_000_000_007;
        for(; hi < nums.length ; hi++){
            if(nums[hi] == 1){
                if(ans == 0) ans = 1;
                else{
                    ans *= (hi - lo);
                    ans %= 1000000007;
                }
                lo = hi;
            }
        }
        return (int)ans;

        
    }
}