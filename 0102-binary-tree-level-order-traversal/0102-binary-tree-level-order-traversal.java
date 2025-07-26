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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) return result;
        q.add(root);

        while (q.size() > 0) {
            List<Integer> ans = new ArrayList<>();
            int levelSize = q.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode top = q.remove();
                ans.add(top.val);
                if (top.left != null) q.add(top.left);
                if (top.right != null) q.add(top.right);
            }
            result.add(ans);

        }
        return result;

    }
}