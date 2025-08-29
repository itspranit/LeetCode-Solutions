class Solution {
    public Node connect(Node root) {
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        bfs(queue);
        return root;
    }
    public void bfs(Queue<Node> queue){
        Queue<Node> temp=new LinkedList<>();
        while(!queue.isEmpty()){
            Node curr=queue.poll();
            if(curr==null){
                continue;
            }
            if(curr.left!=null){
                temp.add(curr.left);
            }
            if(curr.right!=null){
                temp.add(curr.right);
            }
            curr.next=queue.peek();
        }
        if(!temp.isEmpty()){
            bfs(temp);
        }
    }
}
