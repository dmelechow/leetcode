// https://leetcode.com/problems/add-two-numbers/

fun main() {  
    
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        if(l1 == null || l2 == null) return null

        var resultList: ListNode? = null
        var currentNode: ListNode? = null
        var head: ListNode? = null

        var remainder = 0

        var list1 = l1
        var list2 = l2

        while(list1 != null || list2 != null || remainder > 0){
            val sum = (list1?.`val` ?: 0) + (list2?.`val` ?: 0) + remainder
            remainder = sum / 10
            val newNodeValue = sum % 10
            
            currentNode = ListNode(newNodeValue)
            
            if(head == null) {
                head = currentNode
                resultList = head
            } else {
                resultList!!.next = currentNode!!
                resultList = resultList.next
            }
            

            list1 = list1?.next
            list2 = list2?.next
        }

        return head
}