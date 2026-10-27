class Solution:
    def maxArea(self, heights: List[int]) -> int:
        maxVol = 0
        L, R = 0, len(heights) -1

        while L <= R:
            vol = (R - L) * min(heights[R],heights[L])
            maxVol = max(maxVol, vol)
            if heights[L] > heights[R]:
                R -= 1
            else:
                L += 1

        return maxVol