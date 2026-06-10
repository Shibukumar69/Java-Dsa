import java.util.Scanner;
public class arrbyuser {
    public static void main(String[] args) {
        int arr[];
        arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(int i :arr){
            System.out.print(i + " ");
        }
       

      
    }
}
