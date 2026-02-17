public class LinkedList{

    class Node{
        int data;
        Node next;
        Node(int val){
            this.data=val;
            this.next=null;
        }
    };
    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int val){//O(1)
        Node nn=new Node(val);
        if(this.size==0){
            this.head=nn;
            this.tail=nn;
            this.size++;
        }else{
            nn.next=head;
            this.head=nn;
            this.size++;
        }
    }
    public void addLast(int val){//O(1)
      Node nn = new Node(val);
      if(size==0){
       addFirst(val);
      }else{
        this.tail.next = nn;
        this.tail = nn;
        this.size++;
      }
    }
    public void removeFirst()throws Exception{
        if(size==0){
           throw new Exception("Linked List khali hai");
        }else if(size==1){
            this.head=null;
            this.tail=null;
            size=0;
        }else{
            Node temp=head.next;
            head.next=null;
            head=temp;
            size--;
        }
    }
    public void print(){
        print(head);
    }
    public void print(Node head){//O(n)

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println("***********************");
    }
}