class Solution {
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        val startingColor = image[sr][sc]
        if (startingColor == color) return image
        image[sr][sc] = color
        val rows = image.size
        val cols = image[0].size
        val q = ArrayDeque<Pair<Int,Int>>()
        val dirs = arrayOf((1 to 0), (-1 to 0), (0 to -1), (0 to 1))
        q.addLast(sr to sc)

        while (q.isNotEmpty()) {
            val (r, c) = q.removeFirst()
            for ((upr, upc) in dirs) {
                val nr = upr + r
                val nc = upc + c
                if (0 <= nr  && nr < rows && 0 <= nc && nc < cols && image[nr][nc] == startingColor) {
                    image[nr][nc] = color
                    q.addLast(nr to nc)
                }

            }
        }
        return image
    }
}
