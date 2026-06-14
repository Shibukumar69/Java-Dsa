public class main {
    
    public static class Children{
        String name;
        int age;
       
    }

    public static void main(String[] args) {
        Children c1 = new Children();
        c1.name = "John";
        c1.age = 10;
        System.out.println("Name: " + c1.name);
        System.out.println("Age: " + c1.age);
        Children c2 = new Children();

        c2.name = "Alice";
        c2.age = 12;
        System.out.println("Name: " + c2.name);
        System.out.println("Age: " + c2.age);
    }
}
