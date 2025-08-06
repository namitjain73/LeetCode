// Last updated: 8/6/2025, 6:59:23 PM
class Solution {
    public int alternateDigitSum(int n) {
        int c= 0;
        int mul = 1;
        String s = Integer.toString(n);
        if(s.length() % 2 == 0){
            mul = -1;
        }
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            c = c + rem*mul;
            mul = mul * -1;
        }
        return c;
        
    }
}
