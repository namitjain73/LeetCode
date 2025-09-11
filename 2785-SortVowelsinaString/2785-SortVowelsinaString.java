// Last updated: 9/12/2025, 3:01:31 AM
class Solution {
    public String sortVowels(String s) {
        List<Character> list = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
    list.add(ch);
}
        }

        Collections.sort(list);
        String str = "";
        int i = 0;

        for(char ch : s.toCharArray()){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                str += list.get(i);
                i++;
            }else{
                str += ch;
            }
        }
        return str;        
    }
}