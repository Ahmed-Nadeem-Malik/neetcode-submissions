class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashMap = {}
        
        for word in strs:
            sortedWord = ''.join(sorted(word))
            if sortedWord not in hashMap:
                hashMap[sortedWord] = []
            hashMap[sortedWord].append(word)

        return list(hashMap.values())