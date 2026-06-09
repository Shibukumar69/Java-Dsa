public class multofarray {
  
    public static void main(String[] args) {
        int arr[] = { 12, 23, 34, 45, 56 };
        int mul = 1;
        // for(int i=0; i<arr.length; i++){
        //     mul = mul * arr[i];
        // }
        for (int i : arr) {
            mul = mul * i;
        }
        System.out.println("The product of the array is: " + mul);
    }

}
