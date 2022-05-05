// https://leetcode.com/problems/valid-palindrome/


fun main() {
    println(isPalindrome("A man, a plan, a canal: Panama"))
}

fun isPalindrome(s: String): Boolean {
    if(s.isEmpty()) return true

    val lowerS = s.toLowerCase().filter{
        it in 'a'..'z'
    }
    
    var left = 0
    var right = lowerS.length - 1

    while(left < right) { 
        if(lowerS[left++] != lowerS[right--]) return false
    }

    return true
}