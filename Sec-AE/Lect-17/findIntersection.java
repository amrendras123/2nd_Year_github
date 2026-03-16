public class findIntersection {
    
 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
      public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode tA=headA;
        ListNode tB=headB;
        while(tA!=tB){

            if(tA==null){
                tA=headB;
            }else{
                tA=tA.next;
            }
            if(tB==null){
                tB=headA;
            }else{
                tB=tB.next;
            }
        }
        return tB;
    }
}
