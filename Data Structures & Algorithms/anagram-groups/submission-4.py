class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashMap = {}

        for string in strs:
            sortedString = "".join(sorted(string))
            if sortedString not in hashMap:
                hashMap[sortedString] = [string]
            else:
                hashMap[sortedString].append(string)

        return list(hashMap.values())