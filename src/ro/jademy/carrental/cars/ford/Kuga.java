package ro.jademy.carrental.cars.ford;

import ro.jademy.carrental.cars.CarType;
import ro.jademy.carrental.cars.Engine;
import ro.jademy.carrental.cars.Transmision;

import java.math.BigDecimal;
import java.util.Calendar;

public class Kuga extends Ford {
    public Kuga(Engine engine, BigDecimal basePrice, String color, Calendar year, boolean available) {
        super("Kuga", engine, basePrice, 5, color, CarType.SUV,Transmision.AUTOMATIC,year,available);
    }
}
