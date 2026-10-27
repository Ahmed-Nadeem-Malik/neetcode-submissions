class Solution {
    fun shipWithinDays(weights: IntArray, days: Int): Int {
        var l = weights.max()
        var r = weights.sum()
        var res = r

        fun canShip(cap: Int): Boolean {
            var ships = 1
            var curCap = cap

            for (w in weights) {
                if (curCap - w < 0) {
                    ships++
                    if (ships > days) return false
                    curCap = cap
                }
                curCap -= w
            }

            return true
        }

        while (l <= r) {
            val m = l + (r - l) / 2
            if (canShip(m)) {
                res = min(res, m)
                r = m - 1
            } else {
                l = m + 1
            }
        }

        return res

    }
}
