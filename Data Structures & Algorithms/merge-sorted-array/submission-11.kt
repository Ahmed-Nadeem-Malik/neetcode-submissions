class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var l1 = m
        var l2 = 0

        while (l2 < n) {
            nums1[l1] = nums2[l2]

            for (i in l1 downTo 1) {
                if (nums1[i] < nums1[i - 1]) {
                    val tmp = nums1[i - 1]
                    nums1[i - 1] = nums1[i]
                    nums1[i] = tmp
                } else {
                    break
                }
            }

            l1++
            l2++
        }
    }
}