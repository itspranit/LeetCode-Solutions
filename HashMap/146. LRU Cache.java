class LRUCache {

    class Node{
        int key;
        int value;
        Node next;
        Node prev;
        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    Map<Integer,Node> map;
    int capacity;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        this.head=new Node(0,0);
        this.tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node n=map.get(key);
        remove(n);
        insertohead(n);
        return n.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }else if(map.size()==capacity){
            map.remove(tail.prev.key);
            remove(tail.prev);
        }
        Node node=new Node(key,value);
        insertohead(node);
        map.put(key, node);
    }
    void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    void insertohead(Node node){
        node.next = head.next;
         node.next.prev = node; 
         head.next = node;
          node.prev = head;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
