public class PQMain {
    
    public static void main(String[] args) {
        PQ pq=new PQ();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(-10);
        pq.add(138380);
        pq.add(100);
        pq.add(4);
        pq.add(5);
        System.out.println(pq.getMin());
        System.out.println(pq.removeMin());
        System.out.println(pq.getMin());
    }
}
