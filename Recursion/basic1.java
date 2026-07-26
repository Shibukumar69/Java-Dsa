public class basic1 {
    public static void main(String[] args) {
        int n=5;
        ajay(n);
    }
     public static void ajay(int n){
        if(n==0) return;
        System.out.print(n+" ");
        ajay(n-1);
}
}
