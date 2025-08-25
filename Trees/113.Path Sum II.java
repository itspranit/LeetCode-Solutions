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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
         dfs(root,targetSum,list,ans);
         return ans;
    }
    public void dfs(TreeNode node,int target,List<Integer> list,List<List<Integer>> ans){
        if(node==null){
            return ;
        }
        list.add(node.val);
         if(node.left==null && node.right==null){
            if(target==node.val){
                ans.add(new ArrayList<>(list));
            }
            
        }
        dfs(node.left,target-node.val,list,ans);
        dfs(node.right,target-node.val,list,ans);
        
        list.remove(list.size()-1);
    }
}
