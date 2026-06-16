import java.util.*;
class basicqueue{
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        // q.add(23);
        // q.add(13);
        // q.add(55);
        // q.add(93);
        // q.add(1);
        // q.add(3);
        // istead of add we can also use offer method to add the element in the queue
        //instead of element we can also use peek method to get the head of the queue
        // instead of remove we can also use poll method to remove the head of the queue
        // add-->>offer, element-->>peek, remove-->>poll
        q.offer(23);
        q.offer(24);
        q.offer(25);
        q.offer(26);
        q.offer(27);
        q.offer(28);
        
        System.out.println("printing the queue element " +q);
        // System.out.println("removing the element " +q.remove());
        System.out.println("removing the element " +q.poll());
        System.out.println("printing the queue element " +q);
    }
}