class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        hashMap = {} 

        for idx, num in enumerate(numbers):
            aim = target - num
            if aim in hashMap:
                return [hashMap[aim] + 1, idx + 1]
            else:
                hashMap[num] = idx

        