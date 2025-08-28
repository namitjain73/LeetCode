// Last updated: 8/29/2025, 1:07:18 AM
class Solution {
    public int reverse(int x) {
        int y = 0;
        int mul = 1;
        int MAX_VALUE = 2147483647;
        int MIN_VALUE = -2147483648;
        while(x != 0){
            int rem = x % 10;
            x = x / 10;
            if((y > MAX_VALUE / 10) || (y < MIN_VALUE / 10)){
                return  0;
            }
            y = (y*10) + rem;
        }
        return y;
        
    }
}