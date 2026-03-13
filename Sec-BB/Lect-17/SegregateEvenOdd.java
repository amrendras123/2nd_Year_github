public class SegregateEvenOdd {
     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

     public ListNode oddEvenList(ListNode head) {
        
        ListNode oh=new ListNode(-1);//dummy node for odd
        ListNode eh=new ListNode(-1);//dummy node for even
        ListNode et=eh;
        ListNode ot=oh;
        int cnt=1;
        while(head!=null){
            if(cnt%2==0){
                et.next=head;
                et=et.next;
            }else{
                ot.next=head;
                ot=ot.next;
            }
            cnt++;
            head=head.next;
        }
        et.next=null;
        ot.next=eh.next;

        return oh.next;
    }
}