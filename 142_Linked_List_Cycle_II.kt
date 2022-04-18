// https://leetcode.com/problems/linked-list-cycle-ii/

f fun detectCycle(head: ListNode?): ListNode? {
        if(head == null || head?.next == null) return null

        var fast: ListNode? = head
        var slow: ListNode? = head

        while (fast != null && fast?.next != null) {
            fast = fast?.next?.next
            slow = slow?.next

            if(fast == slow) break
        }
        
        if(fast != slow) return null
        
        var newHead: ListNode? = head
        
        while(fast != newHead){
            println("${newHead?.`val`} ${fast?.`val`}")
            newHead = newHead?.next
            fast = fast?.next
        }
        
        return newHead
    } 
}