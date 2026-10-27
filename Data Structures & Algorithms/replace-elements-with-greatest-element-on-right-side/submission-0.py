class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        maxVal = arr[-1]
        for i in range(len(arr) - 1, - 1, -1):
            cur = arr[i]
            arr[i] = maxVal
            maxVal = max(cur, maxVal)

        arr[-1] = -1

        return arr
        
            