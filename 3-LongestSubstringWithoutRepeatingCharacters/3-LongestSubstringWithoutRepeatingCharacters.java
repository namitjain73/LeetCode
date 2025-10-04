// Last updated: 10/5/2025, 2:00:52 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int sum = 0;
        int l = 0;
        int n = s.length();
        for(int r = 0 ;  r < n ; r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            while(l < n && map.get(s.charAt(r)) > 1){
                map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);
                if(map.get(s.charAt(l)) == 0) map.remove(s.charAt(l));
                l++;
            }
            sum = Math.max(sum,r-l+1);
        }
        return sum;
    }
}