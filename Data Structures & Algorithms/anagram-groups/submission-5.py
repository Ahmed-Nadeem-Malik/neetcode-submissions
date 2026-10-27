class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashMap = {}
        for string in strs:
            curString = "".join(sorted(string))
            if curString in hashMap:
                hashMap[curString].append(string)
            else:
                hashMap[curString] = [string]

        return list(hashMap.values())