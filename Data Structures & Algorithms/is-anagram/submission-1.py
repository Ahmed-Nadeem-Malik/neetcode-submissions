class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        ch1Dict = {}
        ch2Dict = {}
        for c1 in s:
            if c1 not in ch1Dict:
                ch1Dict[c1] = 1
            else:
                ch1Dict[c1] += 1

        for c2 in t:
            if c2 not in ch2Dict:
                ch2Dict[c2] = 1
            else:
                ch2Dict[c2] += 1
        
        return ch1Dict == ch2Dict


