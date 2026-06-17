import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        int arr[]={12,23,34,45,56};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to search: ");
        int key=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
               
                System.out.println("Element found at index: "+i);
                break;
            } else if(i==arr.length-1){
                System.out.println("Element not found in the array");
            }
        } 
      
    }
}
