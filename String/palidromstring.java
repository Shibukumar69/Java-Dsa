public class palidromstring {
    public static void main(String args[]){
        String str="madam";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + rev);
        if(str.equals(rev)){
            System.out.println("The string is a palindrome.");
        }
        else{
            System.out.println("The string is not a palindrome.");
        }
    }
}
