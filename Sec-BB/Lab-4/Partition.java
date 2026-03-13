public class Partition {
     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
      public ListNode partition(ListNode head, int x) {
        
        ListNode sh=new ListNode(-1);//sh=smaller head
        ListNode gh=new ListNode(-1);//gh=greater head
        ListNode st=sh;//st=smaller traversal 
        ListNode gt=gh;//gt=greater traversal
        ListNode curr=head;
        while(curr!=null){
            if(curr.val<x){
                st.next=curr;
                st=st.next;
            }else{
                gt.next=curr;
                gt=gt.next;
            }
            curr=curr.next;
        }
        gt.next=null;
        st.next=gh.next;
        return sh.next;
    }
}

