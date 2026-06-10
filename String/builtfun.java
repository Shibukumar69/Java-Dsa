import java.util.Scanner;
public class builtfun {
   public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("The length of the string is: " + str.length()); // to find length of strirng
        System.out.println("The first character of the string is: " + str.charAt(0)); // to find the first character of the string
        String name1=new String("Love");
        String name2=new String("Love");
        System.out.println(name1.equals(name2)); // to compare two strings
        System.out.println(name1.equalsIgnoreCase(name2)); // to compare two strings ignoring case
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a string:");
     String str1=sc.nextLine();
     System.out.println("The string you entered is: " + str1);
     String str2= sc.next();
     System.out.println("The string you entered is: " + str2);
    }
}
