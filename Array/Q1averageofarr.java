 import java.util.Scanner;
 class Q1averageofarr{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      System.out.println("Enter the element at index "+i);
      arr[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<n;i++){
      sum=sum+arr[i];
    }
    System.out.println("The average of the array is: "+(sum/n));
  }
}