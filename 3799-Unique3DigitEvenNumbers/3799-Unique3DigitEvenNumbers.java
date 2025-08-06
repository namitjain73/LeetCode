// Last updated: 8/6/2025, 6:54:01 PM
class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        int n = digits.length;
        for(int i = 0 ; i < n ; i++){
            if(digits[i] != 0){
                for(int j = 0 ; j < n ; j++){
                    for(int k = 0 ; k < n ; k++){
                        int x = digits[i]*100 + digits[j]*10 + digits[k];
                        if(((i != j) && (i != k) && (j != k)) && (x % 2 == 0 )){
                            set.add(x);
                        }
                    }
                }
            }
        }
        return set.size();
    }
}