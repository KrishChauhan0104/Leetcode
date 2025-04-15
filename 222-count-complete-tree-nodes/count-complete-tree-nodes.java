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
    public int countNodes(TreeNode root) {
        if(root == null){   
        return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(leftHeight == rightHeight){
            return (1<<leftHeight) + countNodes(root.right);
        } else{
            return (1<<rightHeight) + countNodes(root.left);
        }
    }
    private int height(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.left; 
        }
        return height;
    }
    
}