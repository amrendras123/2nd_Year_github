import java.util.*;
class QueueInbuilt{
    public static void main(String[] args) {
        
        Queue<Integer> q=new LinkedList<>();
        //crud
        q.add(50);
        System.out.println(q.poll());
        q.offer(20);
        q.add(30);
        q.add(50);
        q.add(60);
        q.add(70);
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
    }
}