package ro.jademy.carrental.cars.ford;

import ro.jademy.carrental.cars.CarType;
import ro.jademy.carrental.cars.Engine;
import ro.jademy.carrental.cars.Transmision;

import java.math.BigDecimal;
import java.util.Calendar;

public class Mustang extends Ford {
    public Mustang(Engine engine, BigDecimal basePrice, String color, Calendar year, boolean available) {
        super("Mustang", engine, basePrice, 2, color, CarType.CONVERTIBLE,Transmision.AUTOMATIC,year,available);
    }
}
