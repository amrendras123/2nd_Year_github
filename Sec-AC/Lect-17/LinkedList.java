public class LinkedList{
    
    class ListNode{
        int data;
        ListNode next;
    };

   private ListNode head;
   private ListNode tail;
   private int size=0;

   public  void addFirst(int val){
    ListNode nn=new ListNode();
    nn.data=val;
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
   public int size(){
    return this.size;
   }
   public void addLast(int val){
     ListNode nn=new ListNode();
      nn.data=val;
      if(size==0){
        addFirst(val);
      }else{
        this.tail.next=nn;
        this.tail=nn;
        size++;
      }
   }
   public void print(){
    print(head);
   }
   private void print(ListNode head){
    ListNode temp=head;

    while(temp!=null){
        System.out.print(temp.data+"-> ");
        temp=temp.next;
    }
    System.out.println("**********************");
   }
    
}