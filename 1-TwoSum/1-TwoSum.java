// Last updated: 8/28/2025, 3:42:32 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Map<Integer,Integer> map  = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++) map.put(nums[i],i);


        for(int i = 0 ; i < nums.length ; i++){
            int  n = target - nums[i];
            if(map.containsKey(n)){
                if(map.get(n) != i){
                    arr[0] = Math.min(i,map.get(n));
                    arr[1] = Math.max(i,map.get(n));
                }
            }
        }
        return arr;
        
    }
}