package OOPS.lec_17;

public class Student {
    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;
    private  String gf;

    //Constructors (default)
    public Student(){
        System.out.println("Student default ctor called");
    }
    // Parameterized ctor
    public Student(int id, int age, String name, int nos, String gf){
        System.out.println("Student param ctor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }
    // Copy ctor
    public Student(Student srcObj){
        System.out.println("Student copy ctor called");
        this.id = srcObj.id;
        this.age = srcObj.age;
        this.name = srcObj.name;
        this.nos = srcObj.nos;
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
    private void gfChat(){
        System.out.println(name + "Chatting");
    }
}
