// Last updated: 10/4/2025, 12:14:06 AM
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        solver(candidates,target,list,ll,0);
        return ll;
    }
    public void solver(int[] arr , int t ,List<Integer> list , List<List<Integer>> ll , int idx){
        if(t == 0){
            ll.add(new ArrayList<>(list));
            return;
        }

        for(int i = idx ; i < arr.length ; i++){
            if(i > idx && arr[i-1] == arr[i]) continue;
            if(t >= arr[i]){
                list.add(arr[i]);
                solver(arr,t-arr[i],list,ll,i+1);
                list.remove(list.size()-1);
            }
        }
    }
    public boolean possible(int[] arr , int idx , List<Integer> list){
        if(list.contains(arr[idx])) return true;
        int n = arr[idx];
        for(int i= 0  ; i< idx ; i++){
            if(n == arr[i]) return false;
        }
        return true;
    }
}