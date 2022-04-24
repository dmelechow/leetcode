// https://leetcode.com/problems/path-sum/

 fun hasPathSumIterative(root: TreeNode?, targetSum: Int): Boolean {
    if(root == null) return false

    val path = Stack<TreeNode>()
    val sum = Stack<Int>()
    path.push(root)
    sum.push(root?.`val`)

    while(!path.isEmpty()) {
        val node: TreeNode = path.pop()
        val tempSum: Int = sum.pop()

        if(node.left == null && node.right == null && tempSum == targetSum) return true 

        if(node.left != null) {
            path.push(node.left)
            sum.push(tempSum + node.left.`val`) 
        }

        if(node.right != null) {
            path.push(node.right)
            sum.push(tempSum + node.right.`val`)
        }
    }

    return false
}


fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean { 
    if(root?.left != null) {
        return hasPathSum(root?.left, targetSum - root!!.`val)
    }

     if(root?.right != null) {
        return hasPathSum(root?.right, targetSum - root!!.`val)
    }

    return root?.left == null && root?.right == null && targetSum == 0
}