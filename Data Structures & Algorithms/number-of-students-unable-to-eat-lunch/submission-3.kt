class Solution {
    fun countStudents(students: IntArray, sandwiches: IntArray): Int {
        var circle = 0
        var square = 0
        var neat = students.size

        for (student in students) {
            if (student == 0) circle++ else square++
        }

        for (s in sandwiches) {
            if (s == 1 && square > 0) {
                square--
                neat--
            } else if (s == 0 && circle > 0) {
                circle--
                neat--
            } else {
                break
            }
        }
        return neat
    }
}