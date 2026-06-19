import java.util.HashSet;
import java.util.Set;
public class set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("India");
        set.add("USA");
        set.add("UK");
        System.out.println("The set is: " + set);
        Set<String> set2 = new HashSet<>();
        set2.add("Russia");
        set2.add("China");
        set2.add("Japan");
        System.out.println("The second set is: " + set2);
        set.addAll(set2);
        System.out.println("The set after adding the second set is: " + set);
        set.remove("USA");
        System.out.println("The set after removing USA is: " + set);
    }
}