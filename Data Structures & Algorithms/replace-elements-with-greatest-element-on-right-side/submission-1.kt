class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var max = -1
        val res = IntArray(arr.size)

        for (i in arr.size - 1 downTo 0) {
            res[i] = max
            max = maxOf(arr[i], max)
        }

        return res
    }
}
