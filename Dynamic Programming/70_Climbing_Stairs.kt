// 70. Climbing Stairs 

fun main(){
    println(climbStairs(5))
}

fun climbStairs(n: Int): Int {
    var oneStepBack = 2
    var twoStepsBack = 1
    
    if(n <= 2) return n
    
    for(i in 3..n) {
        var temp = oneStepBack
        oneStepBack = oneStepBack + twoStepsBack
        twoStepsBack = temp
    }
    
    return oneStepBack
}