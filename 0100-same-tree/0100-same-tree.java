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
    private void preOrder(TreeNode tn, List<Integer> list){
        if(tn == null){
            list.add(null);
            return;
        }

        list.add(tn.val);
        preOrder(tn.left, list);
        preOrder(tn.right, list);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> pList = new ArrayList<>();
        List<Integer> qList = new ArrayList<>();

        preOrder(p, pList);
        preOrder(q, qList);

        return pList.equals(qList);
    }
}