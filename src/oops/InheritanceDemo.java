package oops;

class Vehicle {
    String name;
    String model;
    int noOfTyres;

    Vehicle() {
        this.name = "";
        this.model = "";
        this.noOfTyres = -1;
    }

    Vehicle(String name, String model, int noOfTyres) {
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    void startEngine() {
        System.out.printf("\nEngine Starting of %s: %s \n", name, model);
    }

    void drive() {
        System.out.println("I am driving " + name + " of model " + model);
    }

    void stopEngine() {
        System.out.printf("Engine Stopping of %s: %s \n", name, model);
    }

}

class Car extends Vehicle {
    int noOfDoors;
    String transmissionType;

    public Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType) {
        super(name, model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }

    public void startAc() {
        System.out.println(name + " car ac turned on!");
    }

}

class Motorcycle extends Vehicle {
    String handelBarType;
    String suspensionType;

    public Motorcycle(String name, String model, int noOfTyres, String handelBarType, String suspensionType) {
        super(name, model, noOfTyres);
        this.handelBarType = handelBarType;
        this.suspensionType = suspensionType;
    }

    public void wheelie() {
        System.out.println(name + " motorcycle is doing wheelie!");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        Vehicle v = new Vehicle("Truck", "Tata", 16);
        v.startEngine();
        v.drive();
        v.stopEngine();

        Car c = new Car("Mercedes", "Super-1000L", 4, 2, "Automatic");
        c.startEngine();
        c.drive();
        c.startAc();
        c.stopEngine();

        Motorcycle m = new Motorcycle("Hayabusa", "Edge-750cc", 2, "U", "Soft");
        m.startEngine();
        c.drive();
        m.wheelie();
        m.stopEngine();
    }
}