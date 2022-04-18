// https://leetcode.com/problems/linked-list-cycle/

fun hasCycle(head: ListNode?): Boolean {
    if(head == null || head?.next == null) return false

    var fast: ListNode? = head
    var slow: ListNode? = head

    while (fast != null && fast?.next != null) {
        fast = fast?.next?.next
        slow = slow?.next

        if(fast == slow) return true
    }

    return false
}