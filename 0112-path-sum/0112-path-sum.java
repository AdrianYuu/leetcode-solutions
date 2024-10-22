/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private boolean traverse(TreeNode tn, int targetSum, int currentSum){
        if(tn == null){
            return false;
        }

        currentSum += tn.val;

        if(tn.left == null && tn.right == null){
            return targetSum == currentSum;
        }

        return traverse(tn.left, targetSum, currentSum) || traverse(tn.right, targetSum, currentSum);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return traverse(root, targetSum, 0);
    }
}

