// https://leetcode.com/problems/reverse-integer/

fun main () {
    print(reverse(-123))
}

fun reverse(x: Int): Int {
   var xxx: Long = Math.abs(x).toLong()

    var sign = if(x < 0) -1 else 1
    
    var res: Long = 0L
    while(xxx > 0) {
        var remainder: Long = xxx % 10
        res += remainder
        if(xxx / 10 > 0) res *= 10
        xxx /= 10
    }
    res *= sign

    if(res < Int.MIN_VALUE || res > Int.MAX_VALUE) return 0

    return res.toInt()
}