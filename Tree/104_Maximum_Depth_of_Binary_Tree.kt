// https://leetcode.com/problems/maximum-depth-of-binary-tree/

fun maxDepth(root: TreeNode?): Int {
    if(root == null) return 0

    return count(root!!, 0)
}

fun count(root: TreeNode?, height: Int): Int {
    if(root == null) return height

    return Math.max(count(root.left, height + 1), count(root.right, height + 1))
}