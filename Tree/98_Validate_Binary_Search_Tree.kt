// https://leetcode.com/problems/validate-binary-search-tree/

fun isValidBST(root: TreeNode?): Boolean {
    return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE)
}

fun isValidBSTHelper(root: TreeNode?, min: Long, max: Long): Boolean {
    if(root == null) return true

    if(root?.`val` <= min || root?.`val` >= max) return false

    return isValidBSTHelper(root?.left, min, root!!.`val`.toLong()) && isValidBSTHelper(root?.right, root!!.`val`.toLong(), max)
}


// fun isValidBST(root: TreeNode?): Boolean {
//     if(root == null) return true

//     if(root?.left != null && root?.left.`val` > root?.`val`) {
//         return false
//     }

//     if(root?.right != null && root?.right.`val` < root?.`val`) {
//         return false
//     }
    
//     return isValidBST(root?.left) && isValidBST(root?.right)
// }