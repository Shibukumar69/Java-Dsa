public class printdigit {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println("The digits in the number are:");
        while(number!=0){
            int digit = number %10;
            number = number /10;
            System.out.println(digit);
        }

        
    }
}
