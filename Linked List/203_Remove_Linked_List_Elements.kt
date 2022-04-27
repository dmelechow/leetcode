// https://leetcode.com/problems/remove-linked-list-elements/

fun removeElements(head: ListNode?, `val`: Int): ListNode? {
    if(head == null) return head

    var node: ListNode? = head
    var resNode: ListNode? = head
    var prev: ListNode? = null

    while(node != null) {
        if(node.`val` == `val`) {
            if(prev == null){
                resNode = node?.next
            } else {
                prev?.next = node?.next
            }
        } else {
            prev = node
        }
        node = node?.next
    }

    return resNode   
}