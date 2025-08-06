// Last updated: 8/6/2025, 6:54:39 PM
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0, right = 0, underscore = 0;
        
        for (char move : moves.toCharArray()) {
            if (move == 'L') left++;
            else if (move == 'R') right++;
            else underscore++;
        }
        return Math.abs(left - right) + underscore;
    }
}