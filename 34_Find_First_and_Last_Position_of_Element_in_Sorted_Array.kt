// val nums = intArrayOf(5,7,7,8,8,10)
// val nums = intArrayOf(1, 4)
val nums = intArrayOf(1,2,3,3,3,3,4,5,9)
val target = 3

fun main(){  
    searchRange(nums, target).forEach(System.out::print)
}

fun searchRange(nums: IntArray, target: Int): IntArray {
     val targetIndex = binarySearch(nums, target)

    if(targetIndex == -1) return intArrayOf(-1, -1)

    var left = targetIndex
    var right = targetIndex

    var brexitL = false
    var brexitR = false
    
    for(i in 1..nums.size){
        var l = targetIndex - i
        val r = targetIndex + i

        if(l >= 0 && nums[l] == target){
            left = l
        } else brexitL = true

        if(r < nums.size && nums[r] == target){
            right = r
        } else brexitR = true
        
        if(brexitL && brexitR) break
    }

    return intArrayOf(left, right)
}

fun binarySearch(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1

    while(left <= right){
        var mid = (right + left)/ 2 

        if(nums[mid] == target){
            return mid
        } else if(nums[mid] > target){
            right = mid - 1
        } else if(nums[mid] < target){
            left = mid + 1
        }
    }

    return -1
}
