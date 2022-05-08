// https://leetcode.com/problems/valid-anagram/

fun isAnagram(s: String, t: String): Boolean {
    if(s.isEmpty() && t.isEmpty()) return true
    if(s.length != t.length) return false

    var map = HashMap<Char, Int> 

    for(i in 0 until s.length) {
        map[s[i]] = map[s[i]] ?: 0 + 1
        map[t[i]] = map[t[i]] ?: 0 - 1
    }

    for (i in 0 until map.size) {
        if(map[i] != 0) return false
    }

    return true
}