// https://leetcode.com/problems/string-to-integer-atoi/

fun main () {
    print(myAtoi("-91283472332"))
}

fun myAtoi(s: String): Int {
    if(s.isEmpty()) return 0

    var sign = 1
    var res = 0
    var index = 0

    while(index < s.length && s[index] == ' ') index ++

    if(index < s.length && (s[index] == '+' || s[index] == '-')) {
        sign = if(s[index] == '+') 1 else - 1
        index++
    }

    while(index < s.length) {
        if(s[index] !in '0'..'9') break

        val digit = s[index].toString().toInt()

        if(Integer.MAX_VALUE/10 < res || Integer.MAX_VALUE/10 == res && Integer.MAX_VALUE % 10 < digit)
            return if(sign == 1) Integer.MAX_VALUE else Integer.MIN_VALUE

        if(res != 0) res *= 10

        res += digit
        index ++
    } 

    return res * sign   
}