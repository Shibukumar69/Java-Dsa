
public class countno {
   public static void main(String[] args) {
        int number = 12345;
        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }

        System.out.println("The number of digits in the number is: " + count);
    } 
}
