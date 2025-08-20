// Last updated: 8/21/2025, 2:18:39 AM
class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ll = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            List<Integer> list= new ArrayList<>();
            list.add(1);
            for(int j = 1 ; j < i ; j++){
                int x = ll.get(i-1).get(j)+ ll.get(i-1).get(j-1);
                list.add(x);
            }
            if(i != 0) list.add(1);
            ll.add(list);
        }
        return ll;
    }
}