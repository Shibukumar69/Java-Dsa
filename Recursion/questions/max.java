public class max {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,64,56,33,88,35};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int maxvalue = findmax(arr1, 0, max);
        int minvalue = findmin(arr1, 0, min);
        System.out.println(maxvalue);
        System.out.println(minvalue);
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
    public static int findmin(int arr[], int i, int min) {

        if (i >= arr.length) {
            return min;
        }

        if (arr[i] < min) {
            min = arr[i];
        }

        return findmin(arr, i + 1, min);
    }
}