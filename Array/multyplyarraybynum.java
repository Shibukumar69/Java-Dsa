public class multyplyarraybynum {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int num=10;
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*num;
        }
        System.out.println("The array after multiplying by "+num+" is: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
