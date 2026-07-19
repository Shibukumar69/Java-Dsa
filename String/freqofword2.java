import java.util.*;

public class freqofword2 {
    public static void main(String args[]) {

        String str = "Shibuluckyssssaaa";
        str = str.toLowerCase();

        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        //after sorting arr will be like this: [a, a, a, b, c, h, i, k, l, s, s, s, s, u, y]

        int i = 0;
        int maxCount = 0;
        char maxChar = ' ';

        while (i < arr.length) {

            int j = i;

            while (j < arr.length && arr[i] == arr[j]) {
                j++;
            }

            int freq = j - i;

            if (freq > maxCount) {
                maxCount = freq;
                maxChar = arr[i];
            }

            i = j;
        }

        System.out.println("Maximum frequency character: " + maxChar);
        System.out.println("Frequency: " + maxCount);
    }
}