class Solution(object):
    def isPalindrome(self, x):
        # Negative numbers are not palindromes
        if x < 0:
            return False
        
        # Convert to string and check palindrome
        s = str(x)
        return s == s[::-1]