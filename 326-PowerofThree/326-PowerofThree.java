// Last updated: 8/13/2025, 11:12:00 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == Integer.MAX_VALUE) return false;
        
        for(int i = 0 ; i < n;i++){
            int pow = (int)Math.pow(3,i);
            if(n == pow) return true;
            else if(n < pow) return false;
        }

        return false;
    }
}