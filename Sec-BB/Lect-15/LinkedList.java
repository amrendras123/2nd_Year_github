class LinkedList{
   class Node{
        int data;
        Node next;
    };
   private Node head;//head 
   private Node tail;//tail
    int size=0;//size

    public void addFirst(int val){
        Node nn=new Node();
        nn.data=val;
        if(size==0){
            this.head=nn;
            this.tail=nn;
            size++;
        }else{
        nn.next=head;
        head=nn;
        size++;
        }
    }
    public void addLast(int val){//addLast
        Node nn=new Node();
        nn.data=val;
        if(size==0){
            this.head=nn;
            this.tail=nn;
            size++;
            // addFirst(val);
        }else{
            tail.next=nn;
            tail=nn;
            size++;
        }
    }
    //traversal on LinkedList
    public void print(){
        print(head);
    }
    public void print(Node head){
       Node temp=head;
       while(temp!=null){
        System.out.print(temp.data+"-> ");
        temp=temp.next;
       }
       System.out.println("******************");
    }
}