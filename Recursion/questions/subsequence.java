public class subsequence{
    public static void main(String[] args){
        String str="abc";
        String ans="";
        printsubsequence(str,ans,0);
    }
    public static void printsubsequence(String str, String ans, int i){
        if(i>=str.length()){
            System.out.println(ans);
            return;
        }
          printsubsequence(str, ans+str.charAt(i), i+1);
          printsubsequence(str, ans, i+1);
    }
}