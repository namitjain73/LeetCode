// Last updated: 10/3/2025, 11:36:24 PM
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solver(n,k,list,ll,1);
        return ll;
    }
    public void solver(int n , int k ,List<Integer> list ,  List<List<Integer>> ll , int idx){
        if(list.size() == k){
            ll.add(new ArrayList<>(list));
            return;
        }


        for(int i = idx ; i <= n ; i++){
            list.add(i);
            solver(n,k,list,ll,i+1);
            list.remove(list.size()-1);
        }
    }
}