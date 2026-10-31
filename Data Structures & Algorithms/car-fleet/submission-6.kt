class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        val pair = position.zip(speed).sortedByDescending { it.first }

        var fleets = 1
        var prevTime = (target - pair[0].first).toDouble() / pair[0].second
        for (i in 1 until pair.size) {
            val (p, s) = pair[i]
            val currTime = (target - p).toDouble() / s
            if (currTime > prevTime) {
                fleets++
                prevTime = currTime
            }
        }

        return fleets
    }
}