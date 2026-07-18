public class countingnoofchar {
    
}public static void main(String args[]){
        String str="gopi is the best";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("The number of characters in the string is: " + count);
    }



