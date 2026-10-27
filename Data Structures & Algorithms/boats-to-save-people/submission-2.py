class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        people.sort()
        output = 0
        l, r = 0, len(people) - 1

        while l <= r:
            weightLeft = limit - people[r] 
            r -= 1
            output += 1
            if l <= r and weightLeft >= people[l]:
                l += 1

        return output
