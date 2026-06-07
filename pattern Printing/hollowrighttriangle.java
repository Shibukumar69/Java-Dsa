import java.util.Scanner;
public class hollowrighttriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            // star
            for(int j=1;j<=i;j++){
                if(i==1 ||i==2 || i==r || j==1 || j==i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
             System.out.println();
            //space

        }
      
    }
}
