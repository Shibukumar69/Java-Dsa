import java.util.*;
class leetcode58 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      int i=s.length()-1;
      int count=0;
      while(i>=0 && s.charAt(i)==' '){
        i--;
      }
       while(i>=0 && s.charAt(i)!=' '){
           i--;
           count++;
        }
         System.out.println(count);

    }
}