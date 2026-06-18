 import java.util.Scanner;
public class kthshift {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The original array is: ");
        for(int i:arr){
            System.out.print(i + " ");
        }
        System.out.println("Enter the value of k: ");
        int k=sc.nextInt();
        k=k%n; // To handle cases where k is greater than n
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            temp[(i+k)%n]=arr[i];
        }
        System.out.println("The array after shifting by " + k + " is: ");
        for(int i:temp){
            System.out.print(i + " ");
        }
    }
}
