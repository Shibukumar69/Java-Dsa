import java.util.*;
public class insertionsort {
public static void main(String[]  args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    // array input
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    // exaple arr = {5,4,3,2,1}
     for(int j=1;j<n;j++){
        int temp=arr[j];
        int i=j-1;
        while( i>=0 && temp<arr[i] ){
            arr[i+1]=arr[i];
            i--;
        }
        arr[i+1]=temp;

     } // printing the array
     for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
     }

}
}