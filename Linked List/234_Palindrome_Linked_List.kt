// https://leetcode.com/problems/palindrome-linked-list/

fun isPalindrome(head: ListNode?): Boolean {
    var slow: ListNode? = head
    var fast: ListNode? = head
    

    while(fast != null && fast?.next != null){
       slow = slow?.next 
       fast = fast?.next?.next
    }

    if(fast?.next != null) slow = slow?.next

    slow = reverse(slow)
    fast = head

     while (slow != null) {
        if (fast?.`val` != slow?.`val`) {
            return false
        }

        fast = fast?.next
        slow = slow?.next
    }

    return true
}

fun reverse(head: ListNode?): ListNode? {
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