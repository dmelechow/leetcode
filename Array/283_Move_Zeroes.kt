// https://leetcode.com/problems/move-zeroes/

fun moveZeroes(nums: IntArray): Unit {
    for(i in 0 until nums.size) {
        if(nums[i] == 0) {
            for(j in i until nums.size) {
                if(nums[j] != 0) {
                    nums[i] = nums[j]
                    nums[j] = 0
                    break
                }
            }
        }
    }
}

// two pointers
fun moveZeroes(nums: IntArray): Unit {
    var insertPosition = 0

    for(num in nums) {
        if(num != 0) {
            nums[insertPosition++] = num
        }
    }

    while(insertPosition < nums.size) {
        nums[insertPosition++] = 0
    }
}