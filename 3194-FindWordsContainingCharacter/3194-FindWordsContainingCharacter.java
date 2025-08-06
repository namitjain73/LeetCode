// Last updated: 8/6/2025, 6:54:37 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0  ; i < words.length ; i++){
            if(words[i].contains(Character.toString(x))){
                list.add(i);
            }
        }
        return list;
        
    }
}