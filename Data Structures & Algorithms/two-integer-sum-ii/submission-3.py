class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        L = 0
        R = len(numbers) - 1 

        while L < R:
            val = numbers[R] + numbers[L]
            if val == target:
                return [L+1, R+1]
            elif val > target:
                R -= 1
            else:
                L += 1

                