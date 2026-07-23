import java.util.*;
public class onetonno {
    static int n; // global declearation of variable n
    public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
      noprint(n);
    }
     
    public static void noprint(int n){
    if(n==0) return;
    noprint(n-1);
    System.out.println(n);
    }
}
