class Solution:
    def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        l1 = 0 
        l2 = 0
        N, M = len(text1), len(text2)
        cache = [[0] * M for _ in range(N) ]
        def lcs(l1, l2):
            if len(text1) == l1 or len(text2) == l2:
                return 0
            
            if cache[l1][l2] != 0:
                return cache[l1][l2]

            if text1[l1] == text2[l2]:
                cache[l1][l2] =  1 + lcs(l1+1, l2+1)
            else:
                cache[l1][l2] =  max(lcs(l1, l2+1), lcs(l1+1, l2))
            
            return cache[l1][l2]

        return lcs(l1, l2)