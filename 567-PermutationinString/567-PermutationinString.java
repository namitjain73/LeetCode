// Last updated: 10/5/2025, 2:20:57 AM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character , Integer> map= new HashMap<>();
        int n = s2.length();
        int k = s1.length();
        for(char ch : s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i = 0 ; i < n-k+1 ; i++){
            if(map.containsKey(s2.charAt(i)) && present(map,s2.substring(i,i+k))) return true;
        }
        return false;
    }
    public boolean present(Map<Character , Integer> map , String s){
        Map<Character, Integer> copymap = new HashMap<>(map);
        for(char ch : s.toCharArray()){
            if(copymap.containsKey(ch)){
                copymap.put(ch,copymap.getOrDefault(ch,0)-1);
                if(copymap.get(ch) == 0) copymap.remove(ch);
            }else return false;
        }

        return copymap.isEmpty();
    }
}