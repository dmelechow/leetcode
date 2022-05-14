// https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/769/


fun isValidSudoku(board: Array<CharArray>): Boolean {
    var setRow: HashSet<Char> = hashSetOf<Char>()
    var setColumn: HashSet<Char> = hashSetOf<Char>()

    val setSquare: HashMap<Pair<Int, Int>, HashSet<Char>> = hashMapOf()

    // check rows
    for(i in 0 until 9) {
        setRow.clear()
        setColumn.clear()

        for(j in 0 until 9) {

            val rowIndex = i / 3
            val columnIndex = j / 3

            if(setSquare[Pair(rowIndex, columnIndex)] == null) setSquare[Pair(rowIndex, columnIndex)] = HashSet()

            if(setRow.contains(board[i][j])) return false
            if(setColumn.contains(board[j][i])) return false

            if(setSquare[Pair(rowIndex, columnIndex)]!!.contains(board[i][j])) return false

            if(board[i][j] in '1'..'9') {
                setRow.add(board[i][j])        
                setSquare[Pair(rowIndex, columnIndex)]!!.add(board[i][j])    
            }

            if(board[j][i] in '1'..'9') {
                setColumn.add(board[j][i])    
            }
        }
    }

    return true
}