class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashMap = {}

        sortedArr = []
        for string in strs:
            sortedArr.append("".join(sorted(string)))

        for i in range(len(strs)):
            if sortedArr[i] in hashMap:
                hashMap[sortedArr[i]].append(strs[i])
            else:
                hashMap[sortedArr[i]]  = [strs[i]]

        return list(hashMap.values())

