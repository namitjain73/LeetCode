// Last updated: 8/23/2025, 10:48:42 PM
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profit, int[] capital) {
        int[][] arr = new int[profit.length][2];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i][0] = capital[i];
			arr[i][1] = profit[i];
		}
        return IPO(arr,k,w);
    }
    public static int IPO(int[][] arr , int k ,int w) {
		Arrays.sort(arr , (a,b) -> Integer.compare(a[0],b[0]));
		PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(b[1], a[1]));
		
		for(int i = 0 ; i < arr.length ; ) {
			while(i < arr.length && w >= arr[i][0]) {
				pq.add(arr[i]);
				i++;
			}
			if(pq.isEmpty() || k ==0) return w;
			w += pq.poll()[1];
			k--;
		}
        while(k-- > 0 && !pq.isEmpty()){
            w  += pq.poll()[1]; 
        }
		return w;
		
	}
}