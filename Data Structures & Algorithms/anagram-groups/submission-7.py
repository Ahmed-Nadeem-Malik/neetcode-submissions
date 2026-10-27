class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashMap = {}

        for idx, string in enumerate(strs):
            normString = "".join(sorted(string))
            if normString in hashMap:
                hashMap[normString].append(string)
            else:
                hashMap[normString] = [string]
        
        return list(hashMap.values())