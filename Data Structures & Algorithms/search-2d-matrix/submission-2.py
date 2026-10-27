class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        ROWS, COLUMNS = len(matrix), len(matrix[0])

        top, bottom = 0, ROWS -1
        while top <= bottom:
            midRow = (top+bottom) // 2
            if matrix[midRow][0] > target:
                bottom = midRow - 1
            elif matrix[midRow][-1] < target:
                top = midRow + 1
            else:
                break

        if not(top<=bottom):
            return False
        row = (top+bottom) // 2
        l, r = 0, COLUMNS - 1
        while l <= r:
            midI = (l+r) // 2
            mid = matrix[row][midI]
            if mid == target:
                return True
            elif mid > target:
                r = midI - 1
            else:
                l = midI + 1

        return False