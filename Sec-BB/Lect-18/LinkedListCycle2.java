class LinkedListCycle2{
     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
   public ListNode detectCycle(ListNode head) {
         ListNode slow=head;
        ListNode f=head;
        while(f!=null&&f.next!=null){
            slow=slow.next;
            f=f.next.next;
            if(slow==f){
                f=head;
                while(f!=slow){
                    f=f.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}