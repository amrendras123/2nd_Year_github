public class LinkedListCycle2 {

     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  public ListNode detectCycle(ListNode head) {
        
        ListNode s=head;
        ListNode f=head;
        while(f!=null&&f.next!=null){
            s=s.next;;
            f=f.next.next;
            if(s==f){
                s=head;
                while(s!=f){
                    s=s.next;
                    f=f.next;
                }
                return s;
            }
        }
        return null;
    }
}