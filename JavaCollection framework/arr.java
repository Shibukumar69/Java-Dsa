import java.util.*;
public class arr {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // add method
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println(arr);
        // for (int i = 0; i < arr.size(); i++) {
        //     System.out.print(arr.get(i) + " ");
        // }

        // remove method
        arr.remove(1);
        System.out.println(arr);

        //----->>> addAll()   removeAll();
        ArrayList<Integer> arr2= new ArrayList<>();
        arr2.add(7);
        arr2.add(7);
        arr2.add(7);
        arr2.addAll(arr);
        System.out.println(arr2);
        
        arr2.removeAll(arr);
        System.out.println(arr2);

        //-------------->>>>>>> i want to traverse the elemnt
        Iterator<Integer> iterator=arr2.iterator();
        while(iterator.hasNext()){
            System.out.println("Element :" + iterator.next());
        }

        //--------------->>>>>>>>get and set method
        List<Integer> list1= new ArrayList<>();
        list1.add(11);
        list1.add(12);
        list1.add(13);
        list1.add(14);
        System.out.println(list1.get(1));
        list1.set(0, 100);
        System.out.println(list1);


    }
}
