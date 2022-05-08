// https://leetcode.com/problems/reverse-words-in-a-string/

fun main () {
    println(reverseWords("   the sky is  blue"))
}

fun reverseWords(s: String): String {
    var words: List<String> = s.split("\\s+".toRegex())

    val builder = StringBuilder()

    for (i in words.size - 1 downTo 0) {
        builder.append(words[i])
        builder.append(" ")
    }

    return builder.toString().trim()
}

// fun reverseWords(s: String): String {
//     var array = s.toCharArray()

//     reverse(array, 0, array.size - 1)
//     detectWord(array)

//     return ""
// }

// fun detectWord(s: CharArray) {
//     var n: Int = s.size - 1
//     var i: Int = 0
//     var j: Int = 0

//     while (i < n) {
//         while(i < j || i < n && Character.isWhitespace(s[i])) i++
//         while(j < i || j < n && !Character.isWhitespace(s[j])) j++

//         reverse(s, i, j - 1)
//     } 

//     println(s)  
// }

// fun reverse (s: CharArray, left: Int, right: Int) {
//     var i = left
//     var j = right

//     while(i < j) {
//         var temp = s[i]
//         s[i++] = s[j]
//         s[j--] = temp
//     }
// }