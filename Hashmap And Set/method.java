import java.util.*;
class method {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<Integer> map = new HashSet<>();

        // Add elements to the HashSet
        map.add(1);
        map.add(2);
        map.add(3);
        map.add(4);
        map.add(3);
        map.add(3);

        // Display the HashSet
        System.out.println("HashSet: " + map);

        // Check if an element exists
        Integer elementToCheck = 3;
        if (map.contains(elementToCheck)) {
            System.out.println(elementToCheck + " exists in the HashSet.");
        } else {
            System.out.println(elementToCheck + " does not exist in the HashSet.");
        }

        // Remove an element
        map.remove(3);
        System.out.println("HashSet after removing 3: " + map);

        // Note: HashSet does not support get() method as it is not a key-value structure   
    }
}