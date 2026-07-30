public class nthfibonnaci {
    public static void main(String[] args) {
        int n=6;
        System.out.println(fib(n));
    }
     public static int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        return fib(n-1)+fib(n-2)+fib(n-3); // time complexity is O(3^n)
}
}
