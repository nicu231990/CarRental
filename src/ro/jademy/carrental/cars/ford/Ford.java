package ro.jademy.carrental.cars.ford;

import ro.jademy.carrental.Engine;
import ro.jademy.carrental.cars.Car;

import java.math.BigDecimal;

public abstract class Ford extends Car {
    public Ford(String model, Engine engine, BigDecimal basePrice, Integer doorNumber, String color) {
        super("Ford", model, engine, basePrice, doorNumber, color);
    }
}
