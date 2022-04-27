// https://leetcode.com/problems/minimum-depth-of-binary-tree/

fun minDepthRecursive(root: TreeNode?): Int {
    if(root == null) return 0
    
    val left = minDepth(root?.left)
    val right = minDepth(root?.right)
    
    if(left == 0 || right == 0) {
        return Math.max(left, right) + 1
    } else {
        return Math.min(left, right) + 1
    }
}