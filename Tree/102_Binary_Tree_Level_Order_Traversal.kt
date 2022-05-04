// https://leetcode.com/problems/binary-tree-level-order-traversal/

fun levelOrder(root: TreeNode?): List<List<Int>> {
    val res = mutableListOf<List<Int>>()

    if(root == null) return listOf()

    val queue: Queue<TreeNode> = LinkedList<TreeNode>()
    queue.add(root)

    while(!queue.isEmpty()) {
        var size = queue.size
        val bunch = mutableListOf<Int>()

        while(size > 0) {
            val node: TreeNode? = queue.poll()
            
            node?.let {
                bunch.add(it.`val`)
            }

            if(node?.left != null) {
                queue.add(node?.left)
            }

            if(node?.right != null) {
                queue.add(node?.right)
            }

            size--
        }  

        res.add(bunch)      
    }

    return res 
}
