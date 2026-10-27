class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        hashMap = {}
        L = 0
        count = 0
        for R in range(len(s)):
            hashMap[s[R]] = 1 + hashMap.get(s[R], 0)

            while (R - L + 1 - max(hashMap.values())) > k:
                hashMap[s[L]] -= 1
                L+=1

            count = max(count, R - L +1)
            
        return count

                    