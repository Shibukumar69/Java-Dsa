import java.util.*;
public class freqcount{
    public  static void main(String[] args) {
     int arr[]={1,2,3,4,1,2,3,4,3,4};
     HashMap<Integer,Integer> freq=new HashMap<>();
     for(int i=0;i<arr.length;i++){
        freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);

     }
        System.out.println(freq);
    }
}