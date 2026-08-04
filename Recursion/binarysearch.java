public class binarysearch {
     public static void main(String[] args) {
      int [] arr={2,4,6,8,10,12,14,16};
      int target=10;
      int ans=binarysearch(arr,target,0,arr.length-1);
        System.out.println(ans);
}  
 
     public static int binarysearch(int[] arr, int target, int start, int end){
        while(start<=end){
             int mid=start+(end-start)/2;
              if(arr[mid]==target){
                  return mid;
              } 
               if (arr[mid]<target){
                   start=mid+1;
                    return binarysearch(arr,target,start,end);
               } else {
                   end=mid-1;
                   return binarysearch(arr,target,start,end);
               }
        }  
        return -1;   
        
        
    }
}

