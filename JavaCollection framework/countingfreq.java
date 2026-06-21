import java.util.*;
public class countingfreq {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,2,3,4,3,4};
        HashMap<Integer,Integer> result=new HashMap<>();
       for(int i=0;i<arr.length;i++){
            if(result.containsKey(arr[i])){
                result.put(arr[i],result.get(arr[i])+1);
            }
            else{
                result.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:result.entrySet()){
            System.out.println("Element: "+entry.getKey()+" Frequency: "+entry.getValue());
        }
       
    }
}
