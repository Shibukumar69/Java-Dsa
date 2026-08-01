import java.util.*;
public class ntoone {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printkaro(n);
    }
    public static void printkaro(int n){
        if(n==0) return;
        System.out.println(n);
        printkaro(n-1);
    }
}
