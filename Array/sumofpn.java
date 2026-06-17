public class sumofpn {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,-3,-6,-2,3,-1};
        int pSum=0;
        int nSum=0;
        for(int i:arr){
            if(i>0){
                pSum+=i;
            } else {
                nSum+=i;
            }
        }
        System.out.println("The sum of positive numbers in the array is: " + pSum);
        System.out.println("The sum of negative numbers in the array is: " + nSum);
        
    }
}
