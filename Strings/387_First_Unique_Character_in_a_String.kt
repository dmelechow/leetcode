// https://leetcode.com/problems/first-unique-character-in-a-string/

fun main() {
    println(firstUniqChar("loveleetcode").toString())
}

fun firstUniqChar(s: String): Int {
    val map = HashMap<Char, Int>()

    for(l in s) {
        if(map.containsKey(l)) {
            map[l] = 2
        } else {
            map[l] = 1
        }
    }

    for(i in 0 until s.length) {
        if(map[s.get(i)] == 1) return i
    }

    return -1
}