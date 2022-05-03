// https://leetcode.com/problems/remove-nth-node-from-end-of-list/


fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
     var start = ListNode(0)
    start.next = head
    
    var fast: ListNode? = start
    var slow: ListNode? = start

    for(i in 0..n) {
        fast = fast?.next
    }
    
    while(fast != null) {
        fast = fast?.next
        slow = slow?.next
    }
    
    slow?.next = slow?.next?.next

    return start?.next
}


fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    if(head == null) return null

    var start = ListNode(0)
    start.next = head

    var curr: ListNode? = start

    var countNodes  = 0

    while (curr != null) {
        curr = curr?.next
        countNodes++
    }
    
    var i = 0
    curr = start
    val pos = (countNodes - n) - 1
    while(i < pos) {
        curr = curr?.next
        i++
    }
            
    curr?.next = curr?.next?.next

    return start.next
}