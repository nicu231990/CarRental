package ro.jademy.carrental.cars.dacia;

import ro.jademy.carrental.cars.CarType;
import ro.jademy.carrental.cars.Engine;
import ro.jademy.carrental.cars.Transmision;

import java.math.BigDecimal;
import java.util.Calendar;

public class Duster extends Dacia {
    public Duster(Engine engine, BigDecimal basePrice, String color,Calendar year, boolean available) {
        super("Duster", engine, basePrice, 5, color, CarType.SUV,Transmision.MANUAL,year,available);
    }
}
