from typing import List

class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        stack = []

        for ast in asteroids:
            cur = (ast, "p" if ast > 0 else "n")
            destroyed = False

            while stack and stack[-1][1] == "p" and cur[1] == "n":
                top_val = stack[-1][0]
                cur_val = cur[0]
                if abs(top_val) < abs(cur_val):
                    stack.pop()         
                    continue
                if abs(top_val) == abs(cur_val):
                    stack.pop()          
                destroyed = True
                break

            if not destroyed:
                stack.append(cur)

        return [v for v, _ in stack]