package ro.jademy.carrental.cars.ford;

import ro.jademy.carrental.cars.*;
import ro.jademy.carrental.cars.Color;

import java.math.BigDecimal;
import java.util.Calendar;

public abstract class Ford extends Car {
    public Ford(String model, Engine engine, BigDecimal basePrice, Integer doorNumber, Color color, CarType carType, Transmision transmisionType, Calendar year, Availability available) {
        super("Ford", model, engine, basePrice, doorNumber, color, carType, transmisionType, year, available);
    }
}
