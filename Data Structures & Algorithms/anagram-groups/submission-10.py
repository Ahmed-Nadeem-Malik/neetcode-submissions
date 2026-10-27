class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        sortToWords = {}

        for word in strs:
            sortedWord = "".join(sorted(word))
            if sortedWord in sortToWords:
                sortToWords[sortedWord].append(word)
            else:
                sortToWords[sortedWord] = [word]

        return list(sortToWords.values())
        