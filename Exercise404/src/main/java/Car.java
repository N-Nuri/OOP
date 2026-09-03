// A general Car, further refined into body-style subclasses such as Sedan.
public abstract class Car {
    protected String make;
    protected String model;

    protected Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
}
