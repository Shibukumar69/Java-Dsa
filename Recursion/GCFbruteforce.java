import java.util.*;
public class GCFbruteforce {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         int a= sc.nextInt();
            int b= sc.nextInt();
            int ans= GCF(a,b);
            System.out.println(ans);

    }
    // brute force approach

    // public static int GCF(int a,int b){
    
    //     int hcf=1;
    //     for(int i=2;i<=a && i<=b;i++){
    //         if(a%i==0 && b%i==0){
    //             hcf=i;
    //         }
    //     }
    //     return hcf;

    // }
    public static int GCF(int a,int b){
        if(a==0) return b;
        return GCF(b%a,a);
    }
}