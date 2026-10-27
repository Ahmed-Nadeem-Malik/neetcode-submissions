class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var set = mutableSetOf<Int>()
        for (num in nums){
            if (num !in set) set.add(num) else return true
        }

        return false

    }
}
