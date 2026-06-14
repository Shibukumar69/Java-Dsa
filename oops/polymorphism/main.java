
public class main {
    public static class Dog{
        void speak(){
            System.out.println("Dog barks");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("Cat meows");
        }
    }
    public static class Cow{
        void speak(){
            System.out.println("Cow moos");
        }
    }
    public static class Horse{
        void speak(){
            System.out.println("Horse neighs");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Cow cow = new Cow();
        Horse h = new Horse();

        d.speak();
        c.speak();
        cow.speak();
        h.speak();
    }
}
