
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;    
    }

    private void helper(Node node, List<Integer> ans) {
        if (node == null) return;
        for (Node child : node.children) {
            helper(child, ans);
        }
        ans.add(node.val);
    }
}