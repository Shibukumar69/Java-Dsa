public class missingelem {
    public static void main(String[] args) {
        int arr[]={4,1,2,4,6,3,4,2,3,6};
         int n=7;// value of last digit
        for(int i=0;i<arr.length;i++){
            int value=Math.abs(arr[i]);
            int pos=value-1;
            if(arr[pos]>0){
                arr[pos]=-arr[pos];
            } 
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                System.out.println("Missing element is: "+(i+1));
            }
        }

    }
}