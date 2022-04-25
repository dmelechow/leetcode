// https://leetcode.com/problems/contains-duplicate-ii/

fun main() {
    println(containsNearbyDuplicate(intArrayOf(1,2,3,1), 3).toString())
}

fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    var map = HashMap<Int, Int>()

    for(i in 0 until nums.size) {
        if(map.containsKey(nums[i]) && Math.abs(map[nums[i]]!! - i) <= k) {
            return true
        } else {
            map[nums[i]] = i
        }
    }

    return false
}