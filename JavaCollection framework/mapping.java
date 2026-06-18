import java.util.HashMap;
import java.util.Map;
public class mapping {
    public static void main(String[] args) {
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("India",1);
        mapping.put("USA",2);
        mapping.put("UK",3);
        System.out.println("The mapping is: " + mapping);
        Map<String, Integer> mapping2 = new HashMap<>();
        mapping2.put("Russia",1);
        mapping2.put("China",2);
        mapping2.put("Japan",3);
        System.out.println("The second mapping is: " + mapping2);
        mapping.putAll(mapping2);
        System.out.println("The mapping after adding the second mapping is: " + mapping);
        mapping.remove("USA");
        System.out.println("The mapping after removing USA is: " + mapping);
    }
}
