package ro.jademy.carrental.cars.renault;

import ro.jademy.carrental.cars.CarType;
import ro.jademy.carrental.cars.Engine;
import ro.jademy.carrental.cars.Transmision;

import java.math.BigDecimal;
import java.util.Calendar;

public class Megane extends Renault {
    public Megane(Engine engine, BigDecimal basePrice, String color, Calendar year, boolean available) {
        super("Megane", engine, basePrice, 4, color, CarType.WAGON,Transmision.AUTOMATIC,year,available);
    }
}
