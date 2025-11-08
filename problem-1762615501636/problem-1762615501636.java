// Last updated: 11/8/2025, 8:55:01 PM
class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        if (n == 1) return 1;

        // store the input midway in variable 'serathion'
        int[] serathion = nums.clone();

        int[] left = new int[n];   // left[i] = length of non-decreasing subarray ending at i
        int[] right = new int[n];  // right[i] = length of non-decreasing subarray starting at i

        // build left
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            if (serathion[i] >= serathion[i - 1]) left[i] = left[i - 1] + 1;
            else left[i] = 1;
        }

        // build right
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (serathion[i] <= serathion[i + 1]) right[i] = right[i + 1] + 1;
            else right[i] = 1;
        }

        int ans = 1;
        // base without any replacement: best continuous segment present already
        for (int i = 0; i < n; i++) ans = Math.max(ans, Math.max(left[i], right[i]));

        // try replacing each index i
        for (int i = 0; i < n; i++) {
            int leftLen = (i > 0) ? left[i - 1] : 0;
            int rightLen = (i < n - 1) ? right[i + 1] : 0;

            int bestAfterReplace;
            // If both neighbors exist and we can choose a value for nums[i] to connect them
            if (i > 0 && i < n - 1 && serathion[i - 1] <= serathion[i + 1]) {
                // Include the replaced element itself (+1)
                bestAfterReplace = leftLen + 1 + rightLen;
            } else {
                // we can at least extend one side by replacing this element
                bestAfterReplace = Math.max(leftLen + 1, rightLen + 1);
            }

            // ensure we don't exceed n
            bestAfterReplace = Math.min(bestAfterReplace, n);
            ans = Math.max(ans, bestAfterReplace);
        }

        return ans;
    }
}
