package ro.jademy.carrental.cars.ford;

import ro.jademy.carrental.cars.CarType;
import ro.jademy.carrental.cars.Engine;
import ro.jademy.carrental.cars.Car;
import ro.jademy.carrental.cars.Transmision;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public abstract class Ford extends Car {
    public Ford(String model, Engine engine, BigDecimal basePrice, Integer doorNumber, String color, CarType carType, Transmision transmisionType, Calendar year, boolean available) {
        super("Ford", model, engine, basePrice, doorNumber, color,carType,transmisionType,year,available);
    }
}
