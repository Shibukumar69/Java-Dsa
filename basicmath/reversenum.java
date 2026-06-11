
public class reversenum {
    public static void main(String[] args) {
        int number = 12345;
        int reverse = 0;

      while(number!=0){
        int digit = number %10;
        reverse =reverse *10 + digit;
        number = number /10;
    }

        System.out.println("The reverse of the number is: " + reverse);
    }
}
