public class zagged {
      public static void main(String[] args) {
        int arr[][]={{1,2,8,3},{4,5,3,78,5,6},{7,9}};
        int l1=arr.length;
        for(int i=0; i<l1; i++){
            int l2=arr[i].length;
            for(int j=0; j<l2; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
