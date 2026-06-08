package OOPS.lec_21Abst;

abstract  class Bird { // uppr uppr se Concept bna diya
    abstract void fly();
    abstract void eat();
}

class sparrow extends Bird {

    @Override
    void fly() {
        System.out.println("Sparrow Flying");
    }

    @Override
    void eat() {
        System.out.println("Sparrow eating");
    }
}

public class Main {
    static void main(String[] args) {
        Bird b = new sparrow();
        b.eat();
        b.fly();
        }
    }

