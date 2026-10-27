class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        hashMap = {}

        for i, num in enumerate(numbers):
            aim = target - num
            if aim in hashMap:
                return [hashMap[aim] + 1, i + 1]
            else:
                hashMap[num] = i
                
        