public class noofzerandones {
    public static void main(String[] args){
        int arr[]={0,1,0,1,1,0,1};
        int count0=0;
        int count1=0;
        for(int i:arr){
            if(i==0){
                count0++;
            }
            else if(i==1){
                count1++;
            }
        }
        System.out.println("The number of 0's in the array is: " + count0);
        System.out.println("The number of 1's in the array is: " + count1);
    }
}
