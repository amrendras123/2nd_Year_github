public class LinkedList{
    //Node
    class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;

        }
    };

   private ListNode head;
   private ListNode tail;
   private int size=0;
  //addFirst
   public  void addFirst(int val){
    ListNode nn=new ListNode(val);
    if(size==0){
        this.head=nn;
        this.tail=nn;
        size++;
    }else{
        nn.next=this.head;
        this.head=nn;
        this.size++;
    }
   }
   //size
   public int size(){
    return this.size;
   }
   //addAtAnyidx
   public void addAtAnyIdx(int idx,int val)throws Exception{
    ListNode nn=new ListNode(val);
    if(idx==1){
      addFirst(val);
    }else if(idx==this.size){
        addLast(val); 
    }else{
        ListNode prev=getNode(idx-1);
        ListNode next=prev.next;
        prev.next=nn;
        nn.next=next;
        this.size++;
    }
   }
   //removeAtanyidx
   public void removeAtAnyIdx(int idx)throws Exception{

    if(idx==1){
        removeFirst();
    }else if(idx==this.size){
        removeLast();
    }else{
       ListNode prev=getNode(idx-1);
       ListNode curr=prev.next;
       prev.next=curr.next;
       curr.next=null;
       this.size--;
    }

   }
//addLast
   public void addLast(int val){
     ListNode nn=new ListNode(val);
      if(size==0){
        addFirst(val);
      }else{
        this.tail.next=nn;
        this.tail=nn;
        size++;
      }
   }
   //removeFirst
   public void removeFirst()throws Exception{
    if(this.size==0){
      throw new Exception("LinkedList khali hai");
    }else if(this.size==1){
        this.head=null;
        this.tail=null;
        this.size=0;
    }else{
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        this.size--;
    }
   }
   //removeLast
   public void removeLast()throws Exception{
    if(this.size==0||this.size==1){
        removeFirst();
    }else{
          ListNode temp=getNode(this.size-1);
          temp.next=null;
          size--;
          tail=temp;
    }

   }
   //getNode
   private ListNode getNode(int idx)throws Exception{
    if(idx<0||idx>this.size){
        throw new Exception("invalid index");
    }
    ListNode  temp=head;
    for(int i=1;i<idx;i++){
        temp=temp.next;
    }
    return temp;
   }
   //print
   public void print(){
    print(head);
   }
   //print
   private void print(ListNode head){
    ListNode temp=head;

    while(temp!=null){
        System.out.print(temp.data+"-> ");
        temp=temp.next;
    }
    System.out.println("**********************");
   }
    
}