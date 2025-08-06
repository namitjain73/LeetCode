// Last updated: 8/7/2025, 12:41:08 AM
class Solution {
    public int differenceOfSum(int[] arr) {
        int n = arr.length;
        int x = 0;
        int sum2 = 0;
        int sum = 0;
        for(int i  = 0 ; i < n ; i++){
            sum += arr[i];
            if(arr[i] > 9){
                x = _sum(arr[i]);
                sum2 += x;
            }
            else{
                sum2 += arr[i];
            }
        }
        return sum - sum2;

        
    }

    public static int _sum(int n){
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            sum += rem;
        }
        return sum;
    }
}