public class QueueMain {
   public static void main(String[] args) throws Exception{
    Queue q=new Queue();
    q.enqueue(10);
    q.enqueue(30);
    q.enqueue(50);
    q.enqueue(60);
    q.enqueue(70);
    // q.enqueue(90);
    System.out.println(q.dequeue());
    q.enqueue(100);
    q.display();
   } 
}
