abstract class Bird{
    abstract void fly();
    abstract void eat();
    
}
class Sparrow extends Bird{

    @Override
    void fly() {
        System.out.println("Sparrow can fly");
    }

    @Override
    void eat() {
        System.out.println("Sparrow eats seeds");
    }
    
}
class crow extends Bird{

    @Override
    void fly() {
        System.out.println("crow can fly");
    }

    @Override
    void eat() {
        System.out.println("crow eats seeds");
    }
    
}

public class main {
    public static void main(String[] args) {
        Bird b=new Sparrow();
        b.fly();
        b.eat();
        //
        Bird c=new crow();
        c.fly();
        c.eat();
    }
    
}
