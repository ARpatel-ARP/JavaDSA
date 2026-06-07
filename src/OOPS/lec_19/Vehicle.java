package OOPS.lec_19;

public class Vehicle {
    private String name;
    public String model;
    public int noOfTyres;

    // def - ctor
   public Vehicle(){
        this.name = "";
        this.model = "";
        this.noOfTyres = -1;
    }
    // param ctor
    Vehicle(String name, String model, int noOfTyres){
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    void starEng(){
        System.out.println("Engine is Staring of : " + name + " : " + model);
    }
    void stopEng(){
        System.out.println("Engine is Stopping of : " + name + " : " + model);
    }
}
