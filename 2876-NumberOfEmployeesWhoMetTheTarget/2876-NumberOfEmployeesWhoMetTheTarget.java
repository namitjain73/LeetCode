// Last updated: 8/6/2025, 6:54:42 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        Arrays.sort(hours);
        int n = -1;
        int lo = 0 ; 
        int hi = hours.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(hours[mid] >= target){
                n = mid;
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }
        }

        if(n == -1) return 0;
        return hours.length - n;
        
    }
}