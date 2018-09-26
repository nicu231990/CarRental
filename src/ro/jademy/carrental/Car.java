package ro.jademy.carrental;

public abstract class Car {

    // Q: how can we better represent the car make?
    public String make;
    public String model;
    public Integer year;

    // Q: how can we better represent the car type?
    public String carType; // coupe, sedan, hatchback, convertible, wagon, SUV

    // Q: how can we better represent the motor type?
    public String fuelType; // diesel, gasoline, alternative

    public Integer doorNumber;

    public String color;

    // Q: how can we better represent the transmission type?
    public String transmissionType; // automatic, manual

    // Q: how can we better represent the engine?
    public String engine;

    // Q: how can we better represent money value?
    public String basePrice;

    // Q: do we need a constructor other than the default one?
    // Q: how can we better protect the car data?
}
