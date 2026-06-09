public class sumofarr {
    public static void main(String[] args) {
        int arr[] = { 12, 23, 34, 45, 56 };
        int sum = 0;
        // for(int i=0; i<arr.length; i++){
        //     sum = sum + arr[i];
        // }
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println("The sum of the array is: " + sum);
    }
}
