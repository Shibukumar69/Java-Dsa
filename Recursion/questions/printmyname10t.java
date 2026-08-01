import java.util.Scanner;
public class printmyname10t{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         printmyname(sc.nextInt());

    }
    public static int printmyname(int n){
        if(n==0){
            return 0;
        }
         System.out.println("My name is XYZ");
        return printmyname(n-1);
    }
}