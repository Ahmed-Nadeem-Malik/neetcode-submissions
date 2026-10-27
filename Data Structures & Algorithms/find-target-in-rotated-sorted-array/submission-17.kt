class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.size - 1

        while (l < r) {
            val m = l + (r - l) / 2
            if (nums[m] > nums[r]) {
                l = m + 1
            } else {
                r = m
            }
        }

        val pivot = l

        fun bsearch(left: Int, right: Int): Int {
            var left = left
            var right = right
            while (left <= right) {
                val mid = left + (right - left) / 2
                if (nums[mid] == target) return mid
                if (nums[mid] < target) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }
            return -1
        }

        var res = bsearch(0, pivot - 1)
        return if (res != -1) res else bsearch(pivot, nums.size - 1)
    }
}
