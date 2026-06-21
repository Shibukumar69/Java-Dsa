import java.util.HashMap;

public class uniqueele {
    public static void main(String[] args){
        HashMap<Integer,Integer> uni=new HashMap<>();
        int arr[]={1,2,3,4,1,2,6,3,4,3,4};
        for(int i=0;i<arr.length;i++){
            if(uni.containsKey(arr[i])){
                uni.put(arr[i],uni.get(arr[i])+1);
            }
            else{
                uni.put(arr[i],1);
            }
        }
        System.out.println(uni);
        if(uni.containsValue(1)){
            System.out.println("The unique elements in the array are: ");
            for(int i=0;i<arr.length;i++){
                if(uni.get(arr[i])==1){
                    System.out.print(arr[i]+" ");
                }
            }
        }
        else{
            System.out.println("There are no unique elements in the array");
        }

    }
}
