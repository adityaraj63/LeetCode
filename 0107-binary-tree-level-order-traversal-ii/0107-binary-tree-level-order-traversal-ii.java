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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue <TreeNode> q = new LinkedList<>();
        if (root == null) return ans;
        q.add(root);
        while (q.size() > 0) {
            List <Integer> result = new ArrayList<>();
            int levelSize = q.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode top = q.remove();
                result.add(top.val);
                if (top.left != null) q.add(top.left);
                if (top.right != null) q.add(top.right);
            }
            ans.add(result);
        }
        return ans.reversed();
    }
}