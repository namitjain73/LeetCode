// Last updated: 8/6/2025, 6:59:20 PM
class Solution {
    public int[] separateDigits(int[] nums) {
        String s = "";
        for(int i = 0; i < nums.length ; i++){
            s += Integer.toString(nums[i]);
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < s.length() ;i++){
            list.add(s.charAt(i) - '0');
        }

        int[] arr = new int[list.size()];
        for(int i = 0 ; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
        
    }
}