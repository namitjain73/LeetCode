// Last updated: 8/6/2025, 6:59:48 PM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        List<Long> list = new ArrayList<>();
        Long c = 0l;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] == 0){
                c++;
            }
            else{
                if(c != 0){
                    list.add(c);
                }
                c = 0l;
            }
        }
        list.add(c);

        long n = 0;
        for(long i : list){
            if(i != 0){
                n += (i * (i + 1)) / 2;
            }
        }
        return n;
        
    }
}