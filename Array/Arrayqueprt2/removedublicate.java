public class removedublicate {
    public static void main(String[] args){
        int arr[]={1,2,2,3,4,4,5,6,6,7};
        int i=0;
        int j=1;
        while(j<arr.length){
            if(arr[i]==arr[j]){
                j++;
            }
            else{
                i++;
                arr[i]=arr[j];
                j++;
            }
        }
       for(int k=0;k<=i;k++){
           System.out.print(arr[k]+" ");
       }
        
        
        
       
    }
}
