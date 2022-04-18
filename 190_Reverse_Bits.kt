// https://leetcode.com/problems/reverse-bits/

fun reverseBits(n:Int):Int {
    var res = 0
    var num = n
    for(i in 0..31) {
        res = res shl 1
        res += num and 1
        num = num ushr 1   
    }
    
    return res
}