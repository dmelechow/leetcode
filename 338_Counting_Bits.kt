fun main(){  
    countBits(2).forEach(System.out::print)
}

fun countBits(n: Int): IntArray {
    var array = mutableListOf<Int>()
    
    for (index in 0..n) {
        
        var sum = 0
        var num = index

        while(num != 0){
            sum+=num%2
            num = num/2
        }

        array.add(sum)
    }

    return array.toIntArray()
}