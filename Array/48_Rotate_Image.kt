// https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/770/ 


fun rotate(matrix: Array<IntArray>): Unit {
    transpose(matrix)
    reverse(matrix)
}

fun transpose(matrix: Array<IntArray>) {
    for(i in 0..matrix.size - 1) {
        for(j in i..matrix[i].size - 1) {
            val temp = matrix[i][j]
            matrix[i][j] = matrix[j][i]
            matrix[j][i] = temp
        }
    }
}

fun reverse(matrix: Array<IntArray>) {
    for(i in 0..matrix.size - 1) {
        var start = 0
        var end = matrix[i].size - 1 
        while(start < end) {
            val temp = matrix[i][start]
            matrix[i][start] = matrix[i][end]
            matrix[i][end] = temp
            start++
            end--
        }
    }
}