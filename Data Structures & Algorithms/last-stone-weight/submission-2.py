class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        stones = [-s for s in stones]
        heapq.heapify(stones)

        while len(stones) > 1:
            first = heapq.heappop(stones)
            second = heapq.heappop(stones)
            if first < second:
                res = (abs(first) - abs(second)) * -1
                heapq.heappush(stones, res)

        if len(stones) < 1:
            return 0
        return abs(stones[0]) 