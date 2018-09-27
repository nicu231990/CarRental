package ro.jademy.carrental.cars.renault;

import ro.jademy.carrental.Engine;
import ro.jademy.carrental.cars.Car;

import java.math.BigDecimal;

public abstract class Renault extends Car {
    public Renault(String model, Engine engine, BigDecimal basePrice, Integer doorNumber, String color) {
        super("Renault", model, engine, basePrice, doorNumber, color);
    }
}
