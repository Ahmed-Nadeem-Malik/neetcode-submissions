class Solution:
    def maxArea(self, heights: List[int]) -> int:
        maxVol = 0
        L = 0
        R = len(heights) - 1

        while L < R:
            vol = (R - L) * min(heights[L], heights[R])
            maxVol = max(vol, maxVol)
            if heights[L] < heights[R]:
                L += 1
            else:
                R -= 1

        return maxVol