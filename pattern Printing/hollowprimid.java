import java.util.Scanner;
public class hollowprimid {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            //space
            for(int j=1;j<=r-i;j++){
               System.out.print("  ");  
            }
            // star
            if(i==1  || i==r){
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("* ");
                  }
                }
                else {
                    //middle part
                    for(int j=1;j<=2*i-1;j++){
                        if(j==1 || j==2*i-1){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                }
            
             
          
                System.out.println();
    } 
}}
