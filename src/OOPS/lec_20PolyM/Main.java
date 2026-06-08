package OOPS.lec_20PolyM;

public class Main {
    static void main(String[] args) {
//        Calculator c = new Calculator();
//        System.out.println(c.add(2,3));
//        System.out.println(c.add(2,3, 5));

        Circle c = new Circle();
        doDrawingStuff(c);

        Rect r = new Rect();
        doDrawingStuff(r);

    }
    //Dynamic Method Dispatch (Runtime Polymorphism)
    public static void doDrawingStuff(Shape s) {
        s.draw();
    }
}
