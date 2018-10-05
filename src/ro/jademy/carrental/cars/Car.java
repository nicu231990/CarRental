package ro.jademy.carrental.cars;

import java.math.BigDecimal;
import java.util.Calendar;

public abstract class Car {

    private Engine engine;
    private BigDecimal basePrice;
    private CarType carType;
    private Transmision transmissionType;
    private Integer doorNumber;
    private Color color;
    private String make;
    private String model;
    private Calendar year;
    private Availability available;

    public Car(String make, String model, Engine engine, BigDecimal basePrice, Integer doorNumber, Color color, CarType carType, Transmision transmissionType, Calendar year, Availability available) {
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

    public Color getColor() {
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

    public Integer getYear() {
        return year.get(Calendar.YEAR);
    }

    public Availability isAvailable() {
        return available;
    }

    public void setAvailable(Availability available) {
        this.available = available;
    }

    public void showCarDetails() {
        String output = String.format("|%-15s|%-15s|%-15f|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|", make, model, engine.getCapacity(), engine.getType().toString(), basePrice.toString(), doorNumber.toString(), color.toString(), carType.toString(), transmissionType.toString(), getYear().toString(), available);
        System.out.println(output);
    }

    public String getCarDetails() {
        String output = String.format("|%-15s|%-15s|%-15f|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|", make, model, engine.getCapacity(), engine.getType().toString(), basePrice.toString(), doorNumber.toString(), color.toString(), carType.toString(), transmissionType.toString(), getYear().toString(), available);
        return output;
    }

}
