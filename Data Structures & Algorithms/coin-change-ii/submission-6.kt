class Solution {
    fun change(amount: Int, coins: IntArray): Int {
        coins.sort()
        val cache = mutableMapOf<Pair<Int, Int>, Int>()

        fun dfs(c: Int, a: Int): Int {
            if (a == 0) return 1
            if (c >= coins.size) return 0
            if ((c to a) in cache) return cache[c to a]!!
            var res = 0
            if (a >= coins[c]) {
                res = dfs(c + 1, a)
                res += dfs(c, a - coins[c])
            }
            cache[c to a] = res
            return cache[c to a]!!
        }

        return dfs(0, amount)


    }
}
