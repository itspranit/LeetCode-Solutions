
class Solution {
    List<Integer> ans;
    public List<Integer> postorderTraversal(TreeNode root) {
        ans=new ArrayList<>();
        dfs(root,ans);
        return ans;
    }
    void dfs(TreeNode node,List<Integer> ans){
        if(node==null){
            return;
        }
        dfs(node.left,ans);
        dfs(node.right,ans);
        ans.add(node.val);
    }
}
