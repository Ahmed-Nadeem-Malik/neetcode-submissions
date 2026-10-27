class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        sortToList = {}

        for string in strs:
            sortedString = "".join(sorted(string))
            if sortedString in sortToList:
                sortToList[sortedString].append(string)
            else:
                sortToList[sortedString] = [string]

        return list(sortToList.values())
     