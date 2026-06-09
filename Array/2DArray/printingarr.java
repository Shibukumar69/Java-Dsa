public class printingarr {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int l1=arr.length;
        int l2=arr[0].length;
        for(int i=0; i<l1; i++){
            for(int j=0; j<l2; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
