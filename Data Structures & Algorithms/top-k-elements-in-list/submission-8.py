class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count= {}
        for num in nums:
            if num in count:
                count[num] += 1
            else:
                count[num] = 1

        arr = []
        for num, count in count.items():
            arr.append([count, num])

        arr.sort()

        output = []
        while len(output) < k:
            output.append(arr.pop()[1])

        return output


        
