// Last updated: 8/28/2025, 6:01:26 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int sum = 0;
        int ans = 0;
        int srt = 0;
        Map<Character,Integer> map = new HashMap<>();
        int[] arr = new  int[128];

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            while(srt < s.length() && arr[ch] > 0){
                arr[s.charAt(srt)]--;
                srt++;
            }
            arr[ch]++;
            ans = Math.max(ans,i - srt + 1);
        }
        return ans;
    }
}