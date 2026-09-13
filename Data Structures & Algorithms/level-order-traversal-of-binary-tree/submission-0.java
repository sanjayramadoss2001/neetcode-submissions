/**TreeNode
 * Definition for a binary tree node.
 * public class  {
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
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> que = new ArrayDeque<TreeNode>();
        if (root != null) que.add(root);
        int level = 0;
        while(!que.isEmpty()) {
            int lvlIndx = que.size();
            List<Integer> list = new ArrayList<>();;
            for (int i=0; i<lvlIndx; i++) {
                TreeNode curr = que.removeFirst();
                list.add(curr.val);
                if (curr.left != null) que.add(curr.left);
                if (curr.right != null) que.add(curr.right);
            }
            res.add(list);
        }
        
        return res;
    }
}
