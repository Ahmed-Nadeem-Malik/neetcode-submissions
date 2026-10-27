from typing import List

class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        stack: List[tuple[int, str]] = []

        for ast in asteroids:
            cur = (ast, "p" if ast > 0 else "n")
            destroyed = False

            while stack and stack[-1][1] == "p" and cur[1] == "n":
                top_val = stack[-1][0]
                cur_val = cur[0]
                if abs(top_val) < abs(cur_val):
                    stack.pop()           # top explodes, keep checking chain
                    continue
                if abs(top_val) == abs(cur_val):
                    stack.pop()           # both explode
                # current explodes for equal or smaller
                destroyed = True
                break

            if not destroyed:
                stack.append(cur)

        # strip signs
        return [v for v, _ in stack]