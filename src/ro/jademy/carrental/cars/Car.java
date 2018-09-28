package ro.jademy.carrental.cars;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Car {

    private Engine engine;
    private BigDecimal basePrice;
    private CarType carType; // coupe, sedan, hatchback, convertible, wagon, SUV
    private Transmision transmissionType; // automatic, manual
    private Integer doorNumber;
    private String color;
    private String make;
    private String model;
    private Calendar year;
    private boolean available;

    // Q: do we need a constructor other than the default one?
    public Car(String make, String model, Engine engine, BigDecimal basePrice, Integer doorNumber, String color,CarType carType, Transmision transmissionType, Calendar year, boolean available){
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.basePrice = basePrice;
        this.color = color;
        this.doorNumber = doorNumber;
        this.carType = carType;
        this.transmissionType = transmissionType;
        this.year = year;
        this.available = available;
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

    public CarType getCarType() {
        return carType;
    }

    public Transmision getTransmissionType() {
        return transmissionType;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year.get(Calendar.YEAR);
    }

    public boolean isAvailable() {
        return available;
    }

    public void showCarDetails(){
        String output = String.format("%-15s%-15s%-19s%-15s%-15s%-15s%-15s%-15s%-15d%-15s",make,model,engine.getEngineSpecs(),basePrice.toString(),doorNumber.toString(),color,carType,transmissionType,getYear(),available);
        System.out.println(output);
    }

}
