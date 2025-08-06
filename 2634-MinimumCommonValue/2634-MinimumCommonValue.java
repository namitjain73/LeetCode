// Last updated: 8/6/2025, 6:59:22 PM
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set set = new HashSet();
        int n = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums1.length ; i++){
            set.add(nums1[i]);
        }

        for(int i = 0 ; i < nums2.length ; i++){
            if(set.contains(nums2[i])){
                if(n > nums2[i]){
                    n = nums2[i];
                }

            }
        }
        if(n == Integer.MAX_VALUE)return -1;
        return n;
    }
}