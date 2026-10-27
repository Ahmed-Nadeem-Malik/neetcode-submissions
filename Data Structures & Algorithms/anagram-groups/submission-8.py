class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashMap = {}

        for s in strs:
            sortedString = ''.join(sorted(s))
            if sortedString in hashMap:
                hashMap[sortedString].append(s)
            else:
                hashMap[sortedString] = [s]
        
        return list(hashMap.values())
     