// https://leetcode.com/problems/number-of-1-bits/


fun main(){  
   hammingWeight(00000000000000000000000000001011)
}

 fun hammingWeight(n:Int):Int {
    var num = n
    var res = 0
                    
    while (num != 0) {
        if(num and 1 != 0) {
            res++
        }
        num = num ushr 1        
    }

    return res
}