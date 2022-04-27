// https://leetcode.com/problems/delete-node-in-a-linked-list/

fun deleteNode(node: ListNode?) {
    node?.`val` = node?.next?.`val`
    node?.next = node?.next?.next
}