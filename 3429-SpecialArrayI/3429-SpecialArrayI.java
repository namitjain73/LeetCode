// Last updated: 8/6/2025, 6:54:25 PM
class Solution {
    public boolean isArraySpecial(int[] arr) {
        for(int i = 0 ; i < arr.length - 1 ; i++){
            if(!((arr[i] % 2 == 0 && arr[i+1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i+1] % 2 == 0))){
                return false;
            }
        }
        return true;
        
    }
}