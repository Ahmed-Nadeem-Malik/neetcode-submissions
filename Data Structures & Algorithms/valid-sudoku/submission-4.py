class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:

        for row in range(9):
            seen = set()
            for i in range(9):
                curItem = board[row][i]
                if curItem == '.':
                    continue
                if curItem in seen:
                    return False
                seen.add(curItem)

        for col in range(9):
            seen = set()
            for i in range(9):
                curItem = board[i][col]
                if curItem == '.':
                    continue
                if curItem in seen:
                    return False
                seen.add(curItem)


        for square in range(9):
            seen = set()
            for i in range(3):
                for j in range(3):
                    row = (square // 3) * 3 + i
                    col = (square % 3) * 3 + j
                    curItem = board[row][col]
                    if curItem == '.':
                        continue
                    if curItem in seen:
                        return False
                    seen.add(curItem)
        
        return True

            