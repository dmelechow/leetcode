// https://leetcode.com/problems/missing-number/


fun missingNumber(nums: IntArray): Int {
    var expectedSum = 0
    var aсtualSum = 0

    for(i in 0 until nums.size) {
        expectedSum += i + 1
        aсtualSum += nums[i]
    }

    return expectedSum - aсtualSum
}

// Second Variant more efficient
fun missingNumber(nums: IntArray): Int {
    var sum = 0

    for(i in 0 until nums.size) {
        sum += i + 1
        sum -= nums[i]
    }

    return sum
}

// Second Variant more efficient
fun missingNumber(nums: IntArray): Int {
    var sum = 0

    for(i in 0 until nums.size) {
        sum = sum xor (i + 1) xor nums[i]
    }

    return sum
}