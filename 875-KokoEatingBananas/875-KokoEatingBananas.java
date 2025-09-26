// Last updated: 9/26/2025, 3:24:09 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1;
        int hi = 0;
        for(int i : piles){
            hi = Math.max(hi,i);
        }
        int ans = hi;

        while(lo <= hi){
            int mid = lo + (hi - lo) /2;
            if(ispossible(piles,mid,h)){
                ans = mid;
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return ans;
    }

    public boolean ispossible(int[] arr , int mid,  int h){
        long hour = 0;
        for(int i = 0 ; i < arr.length ;i++){
            hour += (arr[i] + (long)mid - 1) / mid;

        }
        return h >= hour;
    }
}