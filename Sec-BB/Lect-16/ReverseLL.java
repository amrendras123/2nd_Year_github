class ReverseLL{
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
  public ListNode reverseList(ListNode head) {
        //reverse by pointer , iterative
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){    //tc=O(n),n->size of the linkedlist
            ListNode ahead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahead;
        }
        return prev;
    }
}