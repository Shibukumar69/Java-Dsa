import java.util.ArrayDeque;
import java.util.Deque;
public class stackbasic {
    public static void main(String[] args){
        Deque<Integer> s = new ArrayDeque<>();
        s.push(23);
        s.push(13);
        s.push(55);
        s.push(93);
        s.push(1);
        s.push(3);
        System.out.println("printing the stack element " +s);
        System.out.println("removing the element " +s.pop());
        System.out.println("printing the stack element " +s);
    }
}
