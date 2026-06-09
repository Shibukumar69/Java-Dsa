public class maxinarr {
    public static void main(String[] args) {
        int arr[]={12,23,34,45,56};
        int max=arr[0];
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        System.out.println("The maximum element in the array is: " + max);
    }
}
