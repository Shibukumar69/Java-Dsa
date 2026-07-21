import java.util.Scanner;
public class onetoN {

    static int n; // global declearation of variable n
   public static void main(String[] args){
    
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      run(1);
       
   }  
//       public static void print(int x, int n){
//        if(x>n) return;
//        System.out.println(x);
//          print(x+1,n);
// }
      public static void run(int x){
       if(x>n) return;
       System.out.println(x);
         run(x+1);
}
}