class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashMap = {}

        for string in strs:
            sortedString = sorted(string)
            sortedString = "".join(sortedString)
            if sortedString in hashMap:
                hashMap[sortedString].append(string)
            else:
                hashMap[sortedString] = [string]

        return list(hashMap.values())


        