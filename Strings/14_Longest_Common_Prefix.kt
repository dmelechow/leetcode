// https://leetcode.com/problems/longest-common-prefix/


fun main () {
    println(longestCommonPrefix("flower","flow","flight"))
}

fun longestCommonPrefix(strs: Array<String>): String {
    var res = StringBuilder()
    if(strs.isEmpty()) return ""

    for(i in 0 until strs[0].length) {
        var letter = strs[i]
        for(item in strs) {
            if(item[i] != letter) return res
        }
        res.append(letter)
    }

    return res.toString()
}