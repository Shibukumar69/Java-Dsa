public class max {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,64,56,33,88,35};

        int max = Integer.MIN_VALUE;

        int maxvalue = findmax(arr1, 0, max);
        System.out.println(maxvalue);
    }

    public static int findmax(int arr[], int i, int max) {

        if (i >= arr.length) {
            return max;
        }

        if (arr[i] > max) {
            max = arr[i];
        }

        return findmax(arr, i + 1, max);
    }
}