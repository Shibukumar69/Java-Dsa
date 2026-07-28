public class reverseanumber {
    // public static void main(String[] args) {
    //     int n=1234;
    //     int rev=0;
    //     while(n!=0){
    //         int lastdigit=n%10;
    //         rev=rev*10+lastdigit;
    //         n=n/10;
    //     }
    //     System.out.println(rev);
    // }
    

    public static void main(String[] args) {
        int n=1234;
        reverse(n,0);
        
    }
    public static void reverse(int n, int rev){
         if(n==0){
            System.out.println(rev);
            return;
         }
          reverse(n/10, rev*10+n%10);
      
    }
    
}
