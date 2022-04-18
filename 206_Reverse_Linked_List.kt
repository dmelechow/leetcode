// https://leetcode.com/problems/reverse-linked-list/

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
    fun reverseList(head: ListNode?): ListNode? {
        if(head == null) return  head

        var prev: ListNode?  = null
        var mutableHead: ListNode? = head

        while (mutableHead != null) {
            var next: ListNode? = mutableHead?.next
            mutableHead?.next = prev
            prev = mutableHead
            mutableHead = next
        }

        return prev
    }
}