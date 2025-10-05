// Last updated: 10/5/2025, 6:16:17 PM
class Solution {
    int ans;
    public int countArrangement(int n) {
        ans =  0;
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ll = new ArrayList<>();
        solve(n ,ll,list);
        System.out.println(ll);
        return ans;
    }
    public void solve(int n , List<List<Integer>> ll , List<Integer> list){
        if(list.size() == n){
            ll.add(new ArrayList<>(list));
            ans++;
            return;
        }

        for(int i = 1 ; i <= n ; i++){
            if(list.contains(i)) continue;
            if((list.size()+1)%i == 0 || i%(list.size()+1)==0){
                list.add(i);
                solve(n,ll,list);
                list.remove(list.size()-1);
            }
        }
    }
}