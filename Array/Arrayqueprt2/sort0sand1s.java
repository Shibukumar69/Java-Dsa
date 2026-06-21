public class sort0sand1s {
    public static void main(String[] args) {
        int arr[]={0,1,0,1,0,1,0,1};
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
           if(arr[i]==1 && arr[j]==0){
            //swap
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
           }
              else if(arr[i]==0){
                i++;
              }
              else if(arr[j]==1){
                j--;
              }
        }
        System.out.println("The sorted array is: ");
        for(int k=0;k<n;k++){
            System.out.print(arr[k] + " ");
        }
         System.out.println();

    }
}
