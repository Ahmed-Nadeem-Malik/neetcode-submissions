class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val hashMap = mutableMapOf<Int, Int>()

        for (i in numbers.indices) {
            val aim = target - numbers[i]
            if (aim in hashMap) return intArrayOf(hashMap[aim]!! + 1, i + 1) 
            hashMap[numbers[i]] = i 
        }
        return intArrayOf()
    }
}
