public class maxsubarray{
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,3,5,-1,2,1,-5,4};
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            // sum
            sum+=arr[i];
            // maximum
            max=Math.max(max,sum);
            // if sum<0 then reset sum to 0
            if(sum<0){
                sum=0;
            }
          
        }
        System.out.println("Maximum subarray sum is: "+max);
        
    }
}