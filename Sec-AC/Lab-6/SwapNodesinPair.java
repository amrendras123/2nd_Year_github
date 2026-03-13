public class SwapNodesinPair {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
     public ListNode swapPairs(ListNode head) {
        
        if(head==null||head.next==null){
            return head;
        }
        ListNode th=new ListNode(-1);
        ListNode t=th;
        t.next=head;
        while(t!=null&&t.next!=null&&t.next.next!=null){
            ListNode f=t.next;
            ListNode s=f.next;
            ListNode a=s.next;
            //swap
            f.next=a;
            s.next=f;
            t.next=s;
            t=f;
        }
        return th.next;

    }
}
