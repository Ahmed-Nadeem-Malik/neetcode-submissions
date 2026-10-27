class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = mutableMapOf<Int, Int>()

        for ((i, num) in nums.withIndex()) {
            val aim = target - num
            if (aim in hashMap) return intArrayOf(hashMap[aim]!!, i)
            hashMap[num] = i
        }

        return intArrayOf()
    }
}
