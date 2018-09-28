package ro.jademy.carrental.cars.renault;

import ro.jademy.carrental.cars.CarType;
import ro.jademy.carrental.cars.Engine;
import ro.jademy.carrental.cars.Car;
import ro.jademy.carrental.cars.Transmision;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public abstract class Renault extends Car {
    public Renault(String model, Engine engine, BigDecimal basePrice, Integer doorNumber, String color, CarType carType, Transmision transmisionType, Calendar year,boolean available) {
        super("Renault", model, engine, basePrice, doorNumber, color,carType,transmisionType,year,available);
    }
}
