class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var l = 1
        var r = piles.max()
        var output = r

        while (l <= r) {
            val m = l + (r - l) / 2
            var totalTime = 0L

            for (pile in piles) {
                totalTime += Math.ceil(pile.toDouble() / m).toLong()
            }

            if (totalTime <= h) {
                output = m
                r = m - 1
            } else {
                l = m + 1
            }
        }
        return output
    }
}
