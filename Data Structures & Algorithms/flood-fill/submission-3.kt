class Solution {
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        val startingColor = image[sr][sc]
        if (startingColor == color) return image
        val rows = image.size
        val cols = image[0].size

        fun dfs(r: Int, c: Int) {
            if (r < 0 || r >= rows || c < 0 || c >= cols || image[r][c] != startingColor) return
            image[r][c] = color 
            dfs(r + 1, c)
            dfs(r - 1, c)
            dfs(r, c - 1)
            dfs(r, c + 1)
        }
        dfs(sr, sc)

        return image
    }
}
