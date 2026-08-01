public class arrayprint {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        printarray(arr,0);
    }
    public static void printarray(int arr[],int i){
        if(i==arr.length) return; //base base
        System.out.println(arr[i]);  //1st case
        printarray(arr,i+1);   //recurssion case
    }
}
