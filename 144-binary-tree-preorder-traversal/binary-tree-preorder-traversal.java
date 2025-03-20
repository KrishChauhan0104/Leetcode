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
    public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer> result = new ArrayList<>();
      helperFunc(root, result);
      return result;
    }
    public void helperFunc(TreeNode root, List<Integer> result){
        if(root==null){
            return;
        }
        result.add(root.val);
        helperFunc(root.left, result);
        helperFunc(root.right, result);
    }
}