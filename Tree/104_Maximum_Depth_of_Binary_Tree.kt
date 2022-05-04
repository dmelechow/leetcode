// https://leetcode.com/problems/maximum-depth-of-binary-tree/

fun maxDepth(root: TreeNode?): Int {
    if(root == null) return 0

    return count(root!!, 0)
}

fun count(root: TreeNode?, height: Int): Int {
    if(root == null) return height

    return Math.max(count(root.left, height + 1), count(root.right, height + 1))
}


fun maxDepthBFS(root: TreeNode?): Int {
   if(root == null) return 0
    
    val queue: Queue<TreeNode?> = LinkedList<TreeNode?>()
    queue.add(root)
    var count = 0

    while(!queue.isEmpty()) {
        var size = queue.size

        while(size > 0) {
            val node = queue.poll()

            if(node?.left != null) {
                queue.add(node?.left)
            }   

            if(node?.right != null) {
                queue.add(node?.right)
            }
            size --
        }

        count ++
    }

    return count
}

fun maxDepthDFS(root: TreeNode?): Int {
    if(root == null) return 0
    
    val stack = Stack<TreeNode>()
    val count = Stack<Int>()

    stack.add(root)
    count.add(1)

    var max = 0

    while(!stack.isEmpty()) {
        val node: TreeNode = stack.pop()
        val countTemp = count.pop()

        max = Math.max(max, countTemp)

        if(node.left != null) {
            stack.push(node.left)
            count.push(countTemp+1)
        }

        if(node.right != null) {
            stack.push(node.right)
            count.push(countTemp+1)
        }
    }

    return max
}