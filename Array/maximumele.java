import java.util.Scanner;
public class maximumele {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
         System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element at index "+i);
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        System.out.println("The maximum element in the array is: " + max);
    }
}
