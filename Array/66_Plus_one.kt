// https://leetcode.com/problems/plus-one/

fun main(){
    val res = plusOne(intArrayOf(9))
    for(set in res)
        print("$set ")
}


fun plusOne(digits: IntArray): IntArray {
    var lastIndex = digits.size - 1

    for(i in lastIndex downTo 0){
        if(digits[i] < 9) {
            digits[i] += 1
            return digits
        }

        digits[i] = 0
    }
   
    return intArrayOf(1) + digits
}

// fun plusOne(digits: IntArray): IntArray {
//     var lastIndex = digits.size - 1
//     var nextDecimal = 0

//     if(digits[lastIndex] != 9){
//         digits[lastIndex] += 1
//         return digits
//     } else {
//         digits[lastIndex] = 0
//         nextDecimal = 1
//     }

//     for(i in lastIndex - 1 downTo 0) {
//         if(nextDecimal == 1){
//             if(digits[i] == 9) {
//                 digits[i] = 0
//                 nextDecimal = 1
//             } else {
//                 digits[i] += nextDecimal
//                 nextDecimal = 0
//             }
//         } else break
//     }

//     var nums: IntArray  = digits

//     if(nextDecimal == 1){
//         nums = intArrayOf(1) + nums
//     }

//     return nums
// }

// fun plusOne(digits: IntArray): IntArray {
//     var number = 0

//     for(i in 0 until digits.size) {
//         number += digits[i]

//         if(i < digits.size - 1)
//             number = number * 10
//     }

//     number++

//     val length = number.toString().length
//     var res = IntArray(length) {0}

//     for(i in length - 1 downTo 0){
//         res.set(i, number % 10)
//         number /=10
//     }

//     return res
// }