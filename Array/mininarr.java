public class mininarr {
     public static void main(String[] args) {
        int arr[]={12,23,34,45,56};
        int min=arr[0];
        for(int i:arr){
            if(i<min){
                min=i;
            }
        }
        System.out.println("The minimum element in the array is: " + min);
    }
}
