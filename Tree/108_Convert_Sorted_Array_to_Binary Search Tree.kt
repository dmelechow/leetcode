// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/


fun sortedArrayToBST(nums: IntArray): TreeNode? {
        if(nums.isEmpty()) return null

    return helper(nums, 0, nums.size - 1)
}

fun helper(nums: IntArray, l: Int, r: Int): TreeNode? {
    if(l > r) return null

    val mid = (l + r) / 2

    val root = TreeNode(nums[mid])

    root.left = helper(nums, l, mid - 1)
    root.right = helper(nums, mid + 1, r)
    return root
}