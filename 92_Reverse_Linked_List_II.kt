// https://leetcode.com/problems/reverse-linked-list-ii/

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

 fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
         if(head == null || head.next == null || left == right) return head
    
        var mutableHead: ListNode? = head

        var leftHead: ListNode? = null
        var rightHead: ListNode? = null

        var leftInternalHead: ListNode? = null
        var rightInternalHead: ListNode? = null

        while(mutableHead != null) {
            val prev = mutableHead
            mutableHead = mutableHead.next
            
            if(mutableHead == null){
                return head
            }
            
            if(mutableHead.`val` == left) {
                leftHead = prev
                leftInternalHead = mutableHead
                break
            }
        }
        
        var prev: ListNode?  = null

        while (mutableHead != null) {     
            if(prev?.`val` == right) {
                break
            }
            
            var next: ListNode? = mutableHead?.next
            mutableHead?.next = prev
            prev = mutableHead
            mutableHead = next
            
            rightInternalHead = prev
            rightHead = mutableHead
            
            println("${rightInternalHead!!.`val`} + ${rightHead!!.`val`}")
        }
                
        println("${leftInternalHead!!.`val`} -> ${rightHead!!.`val`}")
        println("${leftHead!!.`val`} -> ${rightInternalHead!!.`val`}")

    
        leftInternalHead?.next = rightHead
        leftHead?.next = rightInternalHead

        return head
    }
