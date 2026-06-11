public class student {
    //attributes
    public int id;
    public String name;
    public int age;
   public  int nos;
   // default constructor
    // public student() {
    //     System.out.println("Default constructor called");
    // }
    //parameterized constructor
    public student(int id, String name, int age, int nos) {
       System.out.println("Parameterized constructor called");
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
       
    }
    //copy constructor
    public student(student s) {
        System.out.println("Copy constructor called");
        this.id = s.id;
        this.name = s.name;
        this.age = s.age;
        this.nos = s.nos;
    }
    // method
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
    public void eat() {
        System.out.println(name + " is eating.");
    }
    public void study() {
        System.out.println(name + " is studying.");
    }
    public void bunk() {
        System.out.println(name + " is bunking.");
    }
    
}