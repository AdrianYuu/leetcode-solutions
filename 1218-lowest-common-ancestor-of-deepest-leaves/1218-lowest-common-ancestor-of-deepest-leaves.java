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
    private int getHeight(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if(root == null) return root;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if(leftHeight == rightHeight) return root;
        else if(rightHeight > leftHeight){
            return lcaDeepestLeaves(root.right);
        }

        return lcaDeepestLeaves(root.left);
    }
}