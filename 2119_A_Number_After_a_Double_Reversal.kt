// 2119. A Number After a Double Reversal

fun main () {
    isSameAfterReversals(1800)
}

fun isSameAfterReversals(num: Int): Boolean {
    val first = reverse(num)
    val second = reverse(first)

    println(first)
    println(second)

    return second == num 
}

fun reverse(num: Int) : Int {
    var res = 0
    var numTemp: Int = num

    while(numTemp != 0) {
        val x = numTemp % 10
        res += x

        if(numTemp/10 > 0)
            res *=10

        numTemp = numTemp/10
    }

    return res
}