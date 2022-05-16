// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

fun main () {
    // println(removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4)))
    println(removeDuplicates(intArrayOf(1,1,2)))
}

fun removeDuplicates(nums: IntArray): Int {
    if(nums.isEmpty()) return 0

    var curr = 1
    var lastElement = nums[0]

    for(i in 1 until nums.size) {
        if(nums[i] != lastElement) {
            nums[curr] = nums[i]
            lastElement = nums[i]
            curr++
        }
    }

    return curr
}