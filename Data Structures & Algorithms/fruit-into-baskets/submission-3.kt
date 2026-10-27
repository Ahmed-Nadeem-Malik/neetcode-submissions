class Solution {
    fun totalFruit(fruits: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        var total = 0
        var output = 0
        var l = 0

        for (r in fruits.indices) {
            map[fruits[r]] = 1 + map.getOrDefault(fruits[r], 0)
            total++

            while (map.size > 2) {
                map[fruits[l]] = map.getOrDefault(fruits[l], 0) - 1
                total--
                if (map[fruits[l]] == 0) map.remove(fruits[l])
                l++
            }

            output = maxOf(total, output)
        }
        return output 
    }
}
