public class LinkedListMain {
    
    public static void main(String[] args)throws Exception {
        
        LinkedList ll=new LinkedList();
        ll.addFirst(10);
        ll.addFirst(30);
        ll.addLast(20);
        ll.addFirst(50);
        ll.addFirst(60);
        ll.print();
        System.out.println(ll.size());
        // ll.removeFirst();
        ll.removeLast();
        ll.print();
        System.out.println(ll.size());
        ll.addAtAnyIdx(3, 80);
        ll.print();
    



    }
}
