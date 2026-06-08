import java.util.*;
public class table {
    //method
    static void printTable(){
       for(int i=1;i<=10;i++){
        int ans=2*i;
        System.out.println("-->" +ans);
       }
    }
    public static void main(String[] args) {
    System.out.println("Printing table:");
     printTable();
     System.out.println("Completed");

    }
}
