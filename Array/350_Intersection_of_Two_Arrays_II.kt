// https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/674/



fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
   val res = mutableListOf<Int>()
    nums1.sort() 
    nums2.sort()

    var i = 0    
    var j = 0

    while(i < nums1.size && j < nums2.size) {
        if(nums1[i] == nums2[j]) {
            res.add(nums1[i])
            i++
            j++
        } else if(nums1[i] < nums2[j]) {
            i++
        } else if(nums1[i] > nums2[j]) {
            j++
        }
    }

    return res.toIntArray()
}