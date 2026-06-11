public class App {
    public static void main(String[] args) throws Exception {
        //default constructor
        // student A = new student();
        // A.id = 1;
        // A.name = "Alice";
        // A.age = 20;
        // A.nos = 5;
        // System.out.println("Student name: " + A.name);
        // System.out.println("Student age: " + A.age);
        // System.out.println("Student ID: " + A.id);
        // System.out.println("Number of subjects: " + A.nos);
        // A.sleep();
        // A.eat();
        // A.study();
        // A.bunk();

        //parameterized constructor
        student B = new student(2, "Bob", 22, 6);
        System.out.println("Student name: " + B.name);
        System.out.println("Student age: " + B.age);
        System.out.println("Student ID: " + B.id);
        System.out.println("Number of subjects: " + B.nos);
        B.sleep();
        B.eat();    
        B.study();
        

        //copy constructor
        student C = new student(B);
        System.out.println("Copy constructor called");
        System.out.println("Student name: " + C.name);
        System.out.println("Student age: " + C.age);
        System.out.println("Student ID: " + C.id);
        System.out.println("Number of subjects: " + C.nos);
        C.sleep();
        C.eat();
        C.study();

    }
}
