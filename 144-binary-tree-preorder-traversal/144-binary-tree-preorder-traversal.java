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
        if (root == null) {
            return new ArrayList<>();
        }
        
        ArrayList<Integer> arr_list = new ArrayList<>();
        return helper(root, arr_list);
        
    }
    
    public List<Integer> helper(TreeNode node, ArrayList<Integer> arr) {
        if (node == null) {
            return arr;
        }
        arr.add(node.val);
        helper(node.left, arr);
        helper(node.right, arr);
        return arr;
    }
    
}