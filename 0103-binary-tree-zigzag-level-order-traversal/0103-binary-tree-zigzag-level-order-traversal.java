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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<List<Integer>> list=new ArrayList<>();
        Queue <TreeNode> q=new LinkedList<>();
        if(root==null)
        return list;
        boolean islevel=true;
        q.offer(root);

        while(!q.isEmpty()){
            int len=q.size();
            ArrayList<Integer> l=new ArrayList<>();
            while(len-->0){
                TreeNode curr=q.poll();
                l.add(curr.val);
                if(curr.left!=null)
                  q.offer(curr.left);
                  if(curr.right!=null)
                  q.offer(curr.right);
            }
            if(!islevel){
          Collections.reverse(l);
            }
            list.add(l);
            islevel=!islevel;

        }
        return list;
    }
}