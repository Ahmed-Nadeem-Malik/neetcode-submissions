class Solution {
    fun numRescueBoats(people: IntArray, limit: Int): Int {
        people.sort()
        var boats = 0
        var i = 0
        var j = people.lastIndex

        while (i <= j) {
            if (i == j) return boats + 1
            val sum = people[i] + people[j]
            if (sum > limit) {
                boats++
                j--
                continue
            }
            boats++
            i++
            j--
        }

        return boats
    }
}
