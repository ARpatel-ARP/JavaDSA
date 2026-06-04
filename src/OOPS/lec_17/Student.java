package OOPS.lec_17;

public class Student {
    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    //Constructors (default)
    public Student(){
        System.out.println("Student default ctor called");
    }
    // Parameterized ctor
    public Student(int id, int age, String name, int nos){
        System.out.println("Student default ctor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }


    // METHODS
    public void study() {
        System.out.println(name + "Studying");
    }
    public void sleep() {
        System.out.println(name + "Sleeping");
    }

    public void bunk() {
        System.out.println(name + "Bunking");
    }
}
