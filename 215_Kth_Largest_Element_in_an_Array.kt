// https://leetcode.com/problems/kth-largest-element-in-an-array/

fun main(){  
    val array = intArrayOf(3,2,1,5,6,4)
    val k = 2

    println(findKthLargest(array, k))
}

fun findKthLargest(nums: IntArray, k: Int): Int {
    val sortedNums = nums.sort()

    return sortedNums[sortedNums.size - k - 1]
}