class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        L = 0
        R = len(numbers) - 1 

        while L <= R:
            diff = numbers[R] + numbers[L]
            if diff == target:
                return [L + 1, R + 1]
            elif diff > target:
                R -= 1
            else:
                L += 1