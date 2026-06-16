import java.util.ArrayDeque;

public class arraydequebasic {
    public static void main(String[] args){
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(23);
        adq.offer(24);
        adq.offerFirst(25);
        adq.offerLast(26);
        
        System.out.println("printing the arraydeque element " +adq);
        System.out.println("removing the element " +adq.poll());
        System.out.println("first element " +adq.peekFirst());
        System.out.println("last element " +adq.peekLast());
        System.out.println("printing the arraydeque element " +adq);
    }
}
