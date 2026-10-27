class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)
        for i in range(len(strs)):
            tmp = "".join(sorted(strs[i]))
            res[tmp].append(strs[i])
        return list(res.values())


        


        