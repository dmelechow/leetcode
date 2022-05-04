
val target = 9;
val nums = listOf(0, 1, 0, 3, 12)

fun main(){  
    println(twoSum(nums, target))
}

fun twoSum(nums: List<Int>, target: Int): List<Int?> {
    var map  = HashMap<Int, Int> ()

    for ((index, value) in nums.withIndex()) {
        if(map.containsKey(target - value)){
          return intArrayOf(index, map.get(target- value)!!)
        }
        map.set(value, index)
    }  
    
    return intArrayOf()
}
