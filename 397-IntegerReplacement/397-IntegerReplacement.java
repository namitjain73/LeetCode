// Last updated: 10/2/2025, 11:46:55 PM
class Solution {
    Map<Long, Integer> dp = new HashMap<>();
    
    public int integerReplacement(int n) {
        return solver((long)n); // cast to long to handle n+1 safely
    }
    
    private int solver(long n) {
        if (n == 1) return 0;
        if (dp.containsKey(n)) return dp.get(n);
        
        int res;
        if (n % 2 == 0) {
            res = 1 + solver(n / 2);
        } else {
            res = 1 + Math.min(solver(n - 1), solver(n + 1));
        }
        
        dp.put(n, res);
        return res;
    }
}