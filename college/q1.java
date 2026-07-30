// jumping Numbers 0<=x<=5000
import java.util.*;
class q1{
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      int x= sc.nextInt();
      for(int i=0;i<=x;i++){
          if(i<11){
              System.out.print(i+" ");
          }
          else{
           int n=i;
           int flag=0;
           while(n>10){
               int lastdigit=n%10;
               int secondlastdigit= n/10%10;
               n=n/10;
               if(Math.abs(lastdigit-secondlastdigit)==1){
                   flag=1;
               }
               else{
                   flag=0;
                   break;
               }
           }
            if(flag==1){
                System.out.print(i+" ");
            }
           
           
           

      }


    }
}
}