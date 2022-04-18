// https://leetcode.com/problems/min-stack/

class MinStack() {
    var head: Node? = null

    fun push(`val`: Int) {
        if(head == null) {
            head = Node(`val`, head, `val`)
        } else {
            head = Node(Math.min(`val`, head!!.min), head, `val`)
        }
    }

    fun pop() {
        head = head?.prev
    }

    fun top(): Int {
        return head?.`val` ?: -1
    }

    fun getMin(): Int {
        return head?.`min` ?: -1
    }

    data class Node(
        var min : Int,
        var prev: Node? = null,
        val `val`: Int
    )
}