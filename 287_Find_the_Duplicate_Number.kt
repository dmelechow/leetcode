// https://leetcode.com/problems/find-the-duplicate-number/

fun findDuplicate(nums: IntArray): Int {
    var slow = nums[0]
    var fast = nums[0]

    while(true) {
        slow = nums[slow]
        fast = nums[nums[fast]] 
        
        if(slow == fast) break
    }

    fast = nums[0]

    while(fast != slow) {
        slow = nums[slow]
        fast = nums[fast]
    }

    return slow
}