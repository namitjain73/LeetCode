// Last updated: 8/23/2025, 10:49:03 PM
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int[][] arr = new int[n][2];

        for(int i = 0 ; i < n ; i++){
            arr[i][0] = capital[i];
            arr[i][1] = profits[i];
        }

        return IPO(arr,k,w);
    }

    public int IPO(int[][]arr , int k , int w){
        Arrays.sort(arr , (a,b)-> Integer.compare(a[0],b[0]));
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(b[1],a[1]));
        
        for(int i = 0 ; i < arr.length ;){
            while(i < arr.length && w >= arr[i][0]){
                pq.add(arr[i]);
                i++;
            }

            if( pq.isEmpty() || k == 0) return w;
            w += pq.poll()[1];
            k--;
        }



        while(!pq.isEmpty() && k > 0){
            w += pq.poll()[1];
            k--;
        }

        return w;
    }
}