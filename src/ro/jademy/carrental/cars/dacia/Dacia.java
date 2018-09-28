package ro.jademy.carrental.cars.dacia;

import ro.jademy.carrental.cars.Engine;
import ro.jademy.carrental.cars.Car;
import ro.jademy.carrental.cars.CarType;
import ro.jademy.carrental.cars.Transmision;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public abstract class Dacia extends Car {

    public Dacia(String model, Engine engine, BigDecimal basePrice, Integer doorNumber, String color, CarType carType, Transmision transmisionType, Calendar year,boolean available) {
        super("Dacia", model, engine, basePrice, doorNumber, color,carType,transmisionType,year,available);
    }
}
