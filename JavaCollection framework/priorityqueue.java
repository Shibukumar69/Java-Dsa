import java.util.*;
public class priorityqueue {
    public static void main(String[] args){
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(23);
        pq.offer(13);
        pq.offer(55);
        pq.offer(93);
        pq.offer(1);
        pq.offer(3);
        System.out.println("printing the priorityqueue element " +pq);
        System.out.println("removing the element " +pq.poll());
        System.out.println("printing the priorityqueue element " +pq);
    }
}
