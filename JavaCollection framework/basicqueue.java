import java.util.*;
class basicqueue{
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(23);
        q.add(13);
        q.add(55);
        q.add(93);
        q.add(1);
        q.add(3);
        System.out.println("printing the queue element " +q);
        System.out.println("removing the element " +q.remove());
        System.out.println("printing the queue element " +q);
    }
}