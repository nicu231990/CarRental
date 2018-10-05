package ro.jademy.carrental.cars.dacia;

import ro.jademy.carrental.cars.*;
import ro.jademy.carrental.cars.Color;

import java.math.BigDecimal;
import java.util.Calendar;

public abstract class Dacia extends Car {

    public Dacia(String model, Engine engine, BigDecimal basePrice, Integer doorNumber, Color color, CarType carType, Transmision transmisionType, Calendar year, Availability available) {
        super("Dacia", model, engine, basePrice, doorNumber, color, carType, transmisionType, year, available);
    }
}
