// https://leetcode.com/problems/merge-sorted-array/

fun main() {  
    val nums1 = intArrayOf(1,2,3,0,0,0)
    val m = 3

    val nums2 = intArrayOf(2,5,6)
    val n = 3

    merge(nums1, m, nums2, n)
}

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
     var p1 = m-1
     var p2 = n-1
     var i = m+n-1

    while(p2 >=0 ){
        if(p1 >=0 && nums1[p1] > nums2[p2]){
            nums1[i--] = nums1[p1--];
        } else {
            nums1[i--] = nums2[p2--];
        }
    }
    
    println(nums1)
}


// fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
//     var index1 = 0
//     var index2 = 0

//     val array: MutableList<Int> = ArrayList()

//     val lastIndex1: Int = m - 1 
//     val lastIndex2: Int = n - 1

//     while(index1 <= lastIndex1 && index1 <= lastIndex2) {
//         if(nums1[index1] <= nums2[index2]){
//             array.add(nums1[index1])
//             index1 ++
//         } else {
//             array.add(nums2[index2])
//             index2 ++
//         }
//     }

//     while(index1 <= lastIndex1) {
//         array.add(nums1[index1])
//         index1++
//     }

//      while(index2 <= lastIndex2) {
//         array.add(nums2[index2])
//         index2++
//     }

//     println(array)
// }
