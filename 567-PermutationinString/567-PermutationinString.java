// Last updated: 10/5/2025, 2:22:11 AM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        
        // build frequency for s1
        for (char c : s1.toCharArray()) {
            freq1[c - 'a']++;
        }
        
        int k = s1.length();
        
        // first window
        for (int i = 0; i < k; i++) {
            freq2[s2.charAt(i) - 'a']++;
        }
        
        if (matches(freq1, freq2)) return true;
        
        // sliding window
        for (int i = k; i < s2.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;   // add new char
            freq2[s2.charAt(i - k) - 'a']--; // remove old char
            
            if (matches(freq1, freq2)) return true;
        }
        
        return false;
    }
    
    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
