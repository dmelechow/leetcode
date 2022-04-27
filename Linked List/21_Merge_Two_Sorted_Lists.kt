// https://leetcode.com/problems/merge-two-sorted-lists/

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if(list1 == null && list2 == null) return null

        if(list1 == null) return list2
        if(list2 == null) return list1

        var head: ListNode = ListNode(0)
        var mergedList: ListNode?  = head
        
        var l1: ListNode? = list1
        var l2: ListNode? = list2

        while(l1 != null && l2 != null) {
            if(l1!!.`val` <= l2!!.`val`) {
                mergedList?.next = l1
                l1 = l1!!.next
            } else {
                mergedList?.next = l2
                l2 = l2!!.next
            }
            
            mergedList = mergedList?.next
        }
        
        if(l1 != null){
            mergedList?.next = l1
        }
        
        if(l2 != null){
            mergedList?.next = l2
        }

        return head.next
    }
}