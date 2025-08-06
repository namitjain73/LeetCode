# Last updated: 8/7/2025, 12:40:51 AM
class Solution(object):
    def scoreOfString(self, s):
        """
        :type s: str
        :rtype: int
        """
        su = 0
        suu = 0
        for i in range(len(s)):
            if i == len(s) - 1:
                break

            su = abs(ord(s[i]) - ord(s[i+1]))
            suu += su
            
        return suu