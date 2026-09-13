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
    List<Integer> result = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return result;
        Deque<TreeNode> que = new ArrayDeque<>();
        que.push(root);
        result.add(root.val);
        while(!que.isEmpty()) {
            int len = que.size();
            for(int i=0;i<len;i++) {
                TreeNode node = que.removeLast();
                if(node.left != null) {
                    que.push(node.left);
                }
                if(node.right != null) {
                    que.push(node.right);
                }
            }
            if(!que.isEmpty()) {
                TreeNode node1 = que.peek();
                result.add(node1.val);
            }
        }
        return result;
    }
}
