import java.util.*;
public class hashmapbasic {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",1);
        map.put("USA",2);
        map.put("UK",3);
        System.out.println("The mapping is: " + map);
        System.out.println("The value for key 'USA' is: " + map.get("USA"));
        System.out.println("The size of the mapping is: " + map.size());
        System.out.println("The mapping contains key 'UK': " + map.containsKey("UK"));
        System.out.println("The mapping contains value 2: " + map.containsValue(2));
        map.remove("India");
        System.out.println("The mapping after removing key 'India' is: " + map);
        for(String key: map.keySet()){
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}