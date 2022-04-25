// https://leetcode.com/problems/symmetric-tree/

fun isSymmetric(root: TreeNode?): Boolean {
    return root == null || isSymmetricHelper(root?.left, root?.right)
}

fun isSymmetricHelper(left: TreeNode?, right: TreeNode?): Boolean {
    if(left == null || right == null) return left == right
    if(left?.`val` != right?.`val`) return false
    return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(right.left, left.right)
}