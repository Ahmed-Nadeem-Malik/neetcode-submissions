class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var j = 0
        for (i in m..nums1.size - 1) {
            nums1[i] = nums2[j++]
        }
        nums1.sort()
    }
}
