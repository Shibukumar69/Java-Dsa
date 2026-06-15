import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class sorting {
    public static void main(String[] args){
      List<Integer> list1= new ArrayList<>();
      list1.add(23);
      list1.add(13);
      list1.add(55);
      list1.add(93);
      list1.add(1);
      list1.add(3);
      System.out.println("printing the list element " +list1);
      list1.sort(null);
      System.out.println("After sorting " +list1);

    }
}
