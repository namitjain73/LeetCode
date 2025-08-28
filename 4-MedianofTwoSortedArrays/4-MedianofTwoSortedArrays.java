// Last updated: 8/28/2025, 6:20:21 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n+m];
        int i = 0;
        int j = 0;
        int k =0;

        while(i < n && j < m ){
            if(nums1[i] < nums2[j]){
                arr[k] = nums1[i];
                i++;
                k++;
            }else{
                arr[k] = nums2[j];
                k++;
                j++;
            }
        }
        while(i < n){
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while(j < m){
            arr[k] = nums2[j];
            k++;
            j++;
        }
        

        int medean = arr.length/2;
        if(arr.length % 2 != 0) return arr[medean];
        else{
            return (double)(arr[medean]+ arr[medean-1])/2;
        }
        // return -1;
    }
}