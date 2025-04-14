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
    private Map<Integer, Integer> inorderMap = new HashMap<>();
    private int preorderIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0; i<inorder.length; i++){
            inorderMap.put(inorder[i], i);
        }
        return build(preorder, 0, inorder.length-1);
    }
    private TreeNode build(int[] preorder, int inStart, int inEnd){
        if(inStart>inEnd){
            return null;
        }
        int rootVal = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootVal);

        int inorderIndex = inorderMap.get(rootVal);

        root.left = build(preorder, inStart, inorderIndex-1);
        root.right = build(preorder, inorderIndex+1, inEnd);

        return root;
    }
}