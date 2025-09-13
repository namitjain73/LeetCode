// Last updated: 9/13/2025, 11:03:34 AM
class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> vowel = new HashMap<>();
        Map<Character,Integer> consonent = new HashMap<>();
        String str= "aeiou";
        for(char ch : s.toCharArray()){
            if(str.contains(Character.toString(ch))){
                vowel.put(ch, vowel.getOrDefault(ch,0)+1);
            }else consonent.put(ch, consonent.getOrDefault(ch,0)+1);
        }

        int max1 = 0;
        int max2 = 0;
        for(int i : vowel.values()){
            max1 = Math.max(max1,i);
        }
        for(int i : consonent.values()){
            max2 = Math.max(max2,i);
        }
        return max1+max2;
    }
}