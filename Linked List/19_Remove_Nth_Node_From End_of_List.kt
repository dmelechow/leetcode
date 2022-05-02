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

    var curr: ListNode? = head

    var countNodes  = 1

    while (curr != null) {
        countNodes++
        curr = curr?.next
    }

    var prev: ListNode? = null
    curr = head

    var pointer = 1

    while(pointer < countNodes) {
        if(pointer == countNodes) {
            prev?.next = curr?.next
        }

        prev = curr
        curr = curr?.next
        
        pointer++
    }

    return head
}