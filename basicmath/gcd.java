import java.util.Scanner;
public class gcd {

    static int gcd(int a, int b) {
        while(b != 0) {
            // gcd(a,b)==> gcd(b,a%b);

            // Lcm(a,b)==> lcm(a,b) = (a*b)/gcd(a,b);
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter the second number: ");
    int num2 = sc.nextInt();

    int result = gcd(num1, num2);
    System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);
   }

   }
