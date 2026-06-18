class findingunsortednumber {

     public static int findUnsortedNumber(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return arr[i+1]; // Return the unsorted number
            }
        }
        return -1; // Return -1 if the array is already sorted
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 4, 5, 7};
        int unsortedNumber = findUnsortedNumber(arr);
        System.out.println("The unsorted number is: " + unsortedNumber);
    }

   
}