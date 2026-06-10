public class lenofstr {
    public static void main(String[] args) {
        String str = "lover";
        int count = 0;

        for (char ch : str.toCharArray()) {
            count++;
        }

        System.out.println("The length of the string is: " + count);
    }
}