class freqofword{
    public static void main(String args[]){
        String str="Shibuluckyssssaaaaa";
        str=str.toLowerCase();
        int maxfreq=-1;
        char result=' ';
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
                if(count>maxfreq){
                    maxfreq=count;
                    result=str.charAt(i);
                } 
                 if(count==maxfreq && str.charAt(i)<result){
                    result=str.charAt(i);
            }
        }
        }
        System.out.println("The maximum frequency of the character in the string is: " + result + " with frequency: " + maxfreq);
    }
    
}