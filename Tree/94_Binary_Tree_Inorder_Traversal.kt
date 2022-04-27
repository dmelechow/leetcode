// https://leetcode.com/problems/binary-tree-inorder-traversal/

fun main(){  
    
}

fun inorderTraversal(root: TreeNode?): List<Int> {
    if(root == null) return emptyList()
    val array: MutableList<Int> = ArrayList()
    helper(root, array)
    return array
}
    
fun helper(root: TreeNode?, array: MutableList<Int>){
    if(root != null){
        helper(root.left, array)
        array.add(root.`val`)
        helper(root.right, array)
    }
}

class TreeNode(val count: Int) {
      var left: TreeNode? = null
      var right: TreeNode? = null
}
    