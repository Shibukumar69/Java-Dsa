import java.util.Scanner;
public class eachcharofstr {
    public static void main(String[] args) {
        String str = "Love";
        System.out.println("The characters of the string are:");
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
