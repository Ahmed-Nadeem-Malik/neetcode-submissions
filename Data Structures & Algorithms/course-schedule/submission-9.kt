class Solution {
    fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
        val preMap = (0 until numCourses)
            .associateWith { mutableListOf<Int>() }
            .toMutableMap()
        
        for ((crs, pre) in prerequisites) {
            preMap[crs]!!.add(pre)
        }

        val visiting = mutableSetOf<Int>()

        fun dfs(crs: Int): Boolean {
            if (crs in visiting) return false
            if (preMap[crs]!!.isEmpty()) return true
            visiting.add(crs)
            for (pre in preMap[crs]!!) {
                if (!dfs(pre)) return false
            }
            visiting.remove(crs)
            preMap[crs] = mutableListOf()
            return true
        }

        for (c in 0 until numCourses) {
            if (!dfs(c)) return false
        }

        return true
    }
}
