class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        count = {} # num to count
        res = []

        for num in nums:
            count[num] = 1 + count.get(num, 0)

        for key, val in count.items():
            if val > (len(nums) // 3):
                res.append(key)


        return res