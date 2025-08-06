// Last updated: 8/6/2025, 6:54:12 PM
class Solution {
    public int smallestNumber(int x) {
        String s = tobinary(x);
        int n = s.length();
        return (int)Math.pow(2,n) - 1;
        
    }

    public static String tobinary(int n){
        int sum = 0;
        int mul = 1;
        while(n > 0){
            int rem = n % 2;
            n = n / 2;
            sum = sum + rem*mul;
            mul *= 10;
        }
        return Integer.toString(sum);
    }
}