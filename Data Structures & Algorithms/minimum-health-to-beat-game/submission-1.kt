class Solution {
    fun minimumHealth(damage: IntArray, armor: Int): Long {
        val dmgSum = damage.sumOf { it.toLong() }
        val maxDmg = damage.maxOrNull()!!

        return dmgSum - minOf(maxDmg, armor) + 1
    }
}

