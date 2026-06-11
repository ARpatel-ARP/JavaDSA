package OOPS.lec_21Abst;

//abstract  class Bird { // uppr uppr se Concept bna diya
//    abstract void fly();
//    abstract void eat();
//}
//
//class sparrow extends Bird {
//
//    @Override
//    void fly() {
//        System.out.println("Sparrow Flying faster");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Sparrow eating");
//    }
//}
//class Crow extends Bird {
//
//    @Override
//    void fly() {
//        System.out.println("Crow Flying");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Crow eating slower");
//    }
//}
//
//public class Main {
//    static void doBirdStuff(Bird b) {
//        // does not care about implementation
//        b.eat();
//        b.fly();
//    }
//    static void main(String[] args) {
//        doBirdStuff(new sparrow());
//        doBirdStuff(new Crow());
//        }
//    }
//

       // INTERFACE
 interface Bird { // uppr uppr se Concept bna diya

     void fly();
     void eat();
}

class sparrow implements Bird {

    @Override
   public void fly() {
        System.out.println("Sparrow Flying faster");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eating");
    }
}
class Crow implements Bird {

    @Override
    public void fly() {
        System.out.println("Crow Flying");
    }

    @Override
    public void eat() {
        System.out.println("Crow eating slower");
    }
}

public class Main {
    static void doBirdStuff(Bird b) {
        // does not care about implementation
        b.eat();
        b.fly();
    }
    static void main(String[] args) {
        doBirdStuff(new sparrow());
        doBirdStuff(new Crow());
        }
    }
