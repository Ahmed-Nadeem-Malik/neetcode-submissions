class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = {}

        for s in strs:
            sortedS = "".join(sorted(s))
            if sortedS not in hashmap:
                hashmap[sortedS] = []
            hashmap[sortedS].append(s)

        return  list(hashmap.values())