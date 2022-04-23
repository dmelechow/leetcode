// https://leetcode.com/problems/same-tree/submissions/

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    if(p == null && q == null) return true
        if(p == null || q == null) return false

        val queueP: Queue<TreeNode?> = LinkedList<TreeNode?>()
        queueP.add(p)

        val queueQ: Queue<TreeNode?> = LinkedList<TreeNode?>()
        queueQ.add(q)

        while(!queueP.isEmpty() || !queueQ.isEmpty()) {
            val nodeP:TreeNode? = queueP.poll()
            val nodeQ: TreeNode? = queueQ.poll()
            
            if(nodeP?.`val` != nodeQ?.`val`) return false

            if(nodeP?.left != null || nodeQ?.left != null) {
                queueP.add(nodeP?.left)
                queueQ.add(nodeQ?.left)
            }

            if(nodeP?.right != null || nodeQ?.right != null) {
                queueP.add(nodeP?.right)
                queueQ.add(nodeQ?.right)
            }
        }

    return true 
}
