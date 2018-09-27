package ro.jademy.carrental.cars.dacia;

import ro.jademy.carrental.Engine;
import ro.jademy.carrental.cars.Car;

import java.math.BigDecimal;

public abstract class Dacia extends Car {

    public Dacia(String model, Engine engine, BigDecimal basePrice, Integer doorNumber, String color) {
        super("Dacia", model, engine, basePrice, doorNumber, color);
    }
}
