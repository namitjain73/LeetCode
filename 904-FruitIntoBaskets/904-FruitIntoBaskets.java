// Last updated: 10/5/2025, 12:53:22 PM
class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> map = new HashMap<>();
        int l = 0;
        int sum = 0;
        int max = 0;
        for(int r = 0 ; r < fruits.length ; r++){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            sum ++;
            if(map.size() > 2){
                map.put(fruits[l],map.getOrDefault(fruits[l],0)-1);
                if(map.get(fruits[l]) == 0) map.remove(fruits[l]);
                l++;
                sum--;
            }
            max = Math.max(sum,max);

        }
        return max;
        
    }
}