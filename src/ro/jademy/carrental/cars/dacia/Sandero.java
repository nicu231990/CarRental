package ro.jademy.carrental.cars.dacia;

import ro.jademy.carrental.cars.CarType;
import ro.jademy.carrental.cars.Engine;
import ro.jademy.carrental.cars.Transmision;

import java.math.BigDecimal;
import java.util.Calendar;

public class Sandero extends Dacia {
    public Sandero(Engine engine, BigDecimal basePrice, String color,Calendar year, boolean available) {
        super("Sandero", engine, basePrice, 2, color, CarType.COUPE,Transmision.MANUAL,year,available);
    }
}
