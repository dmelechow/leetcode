// https://leetcode.com/problems/implement-strstr/

fun main(){
    println(strStr("hello", "ll"))
}

fun strStr(haystack: String, needle: String): Int {
    if(haystack.isEmpty()) return 0
    if(needle.isEmpty()) return -1

    for(i in 0.rangeTo(haystack.length)){
        for(j in 0.rangeTo(needle.length)) {
            if(j == needle.length) return i
            if(i + j == haystack.length) break
            if(haystack.get(i+j) != needle.get(j)) break
        }
    }

    return -1
}