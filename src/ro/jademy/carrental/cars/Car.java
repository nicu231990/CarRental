package ro.jademy.carrental.cars;

import ro.jademy.carrental.Engine;

import java.math.BigDecimal;

public abstract class Car {
    // Q: how can we better represent the engine?
    // A: As a Class
    private Engine engine;

    // Q: how can we better represent money value?
    //A: as big decimal
    private BigDecimal basePrice;

    // Q: how can we better represent the car make?
    // Hint: Trebuie cu enums.Let it for next week
    private String make;
    private String model;
    private Integer year;

    // Q: how can we better represent the car type?
    // Hint: Trebuie cu enums.Let it for next week
    private String carType; // coupe, sedan, hatchback, convertible, wagon, SUV

    // Q: how can we better represent the motor type?
    // Hint: Trebuie cu enums.Let it for next week
    private String fuelType; // diesel, gasoline, alternative

    private Integer doorNumber;

    private String color;

    // Q: how can we better represent the transmission type?
    // Hint: Trebuie cu enums.Let it for next week
    private String transmissionType; // automatic, manual


    // Q: do we need a constructor other than the default one?
    public Car(String make, String model, Engine engine, BigDecimal basePrice, Integer doorNumber, String color){
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.basePrice = basePrice;
        this.color = color;
        this.doorNumber = doorNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public String getModel() {
        return model;
    }

    public Integer getDoorNumber() {
        return doorNumber;
    }

    public String getColor() {
        return color;
    }
    // Q: how can we better protect the car data?
}
