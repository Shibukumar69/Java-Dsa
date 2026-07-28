import java.util.*;
public class power {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a= sc.nextInt();  
       int b= sc.nextInt();
       System.out.println(pow(a,b));
    }
//      public static int pow(int n,int p){
//         if(p==0) return 1;
//         return n * pow(n,p-1);  time complexity jada hai 
// }

        public static int pow(int n,int p){
            if(p==0) return 1;
            int call= pow(n,p/2);
            if(p%2==0) return call*call;
            else return n*call*call;
            // time complexity kam hai
}
}
