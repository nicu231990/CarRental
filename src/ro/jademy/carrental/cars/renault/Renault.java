package ro.jademy.carrental.cars.renault;

import ro.jademy.carrental.cars.*;

import java.math.BigDecimal;
import java.util.Calendar;

public abstract class Renault extends Car {
    public Renault(String model, Engine engine, BigDecimal basePrice, Integer doorNumber, Color color, CarType carType, Transmision transmisionType, Calendar year, Availability available) {
        super("Renault", model, engine, basePrice, doorNumber, color, carType, transmisionType, year, available);
    }
}
