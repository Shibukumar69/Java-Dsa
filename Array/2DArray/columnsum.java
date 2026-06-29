import java.util.ArrayList;
public class columnsum {

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> result=new ArrayList<>();
        int n=arr[0].length;
       for(int j=0;j<n;j++){
           int sum=0;
           for(int i=0;i<arr.length;i++){
               sum+=arr[i][j];
           }
            result.add(sum);
           
        }
        System.out.println(result);
    }
}