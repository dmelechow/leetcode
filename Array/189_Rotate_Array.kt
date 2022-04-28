// https://leetcode.com/problems/rotate-array/

fun main() {
    rotate(intArrayOf(1,2,3,4,5,6,7), 3)
}
fun rotate(nums: IntArray, k: Int): Unit {
    val newK = k % nums.size
    
    reverse(nums, 0, nums.size - 1)
    reverse(nums, 0, newK - 1)
    reverse(nums, newK, nums.size - 1)
}

fun reverse(nums: IntArray, l: Int, h: Int) {
    var low = l
    var high = h

    while(low < high) {
        val temp = nums[low]
        nums[low] = nums[high]
        nums[high] = temp

        low ++
        high --
    }
}