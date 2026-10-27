class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val hashSet = HashSet<Int>()

        for (num in nums) {
            if (num in hashSet) return true
            hashSet.add(num)
        }
        return false
    }
}
