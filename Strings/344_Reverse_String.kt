// https://leetcode.com/problems/reverse-string/

fun reverseString(s: CharArray): Unit {
    var lastIndex = s.size - 1
    for (i in 0..lastIndex ) {
        val j = lastIndex - i
        if(i >= j) return

        var temp = s[i]
        s[i] = s[j]
        s[j] = temp
    }

    return
}