class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False

        s1Count = {}
        
        for s in s1:
            s1Count[s] = 1 + s1Count.get(s, 0)

        l = 0
        r = len(s1) - 1
        searchCount = {}
        for i in range(r + 1):
            searchCount[s2[i]] = 1 + searchCount.get(s2[i], 0)

        while r < len(s2):
            if searchCount == s1Count:
                return True

            searchCount[s2[l]] -= 1
            if searchCount[s2[l]] == 0:
                del searchCount[s2[l]]

            l += 1
            r += 1
            if r < len(s2):
                searchCount[s2[r]] = 1 + searchCount.get(s2[r], 0)

        return False

        