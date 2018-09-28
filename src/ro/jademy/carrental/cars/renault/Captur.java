package ro.jademy.carrental.cars.renault;

import ro.jademy.carrental.cars.CarType;
import ro.jademy.carrental.cars.Engine;
import ro.jademy.carrental.cars.Transmision;

import java.math.BigDecimal;
import java.util.Calendar;

public class Captur extends Renault {
    public Captur(Engine engine, BigDecimal basePrice,  String color, Calendar year, boolean available) {
        super("Captur", engine, basePrice, 5, color, CarType.SUV,Transmision.AUTOMATIC,year,available);
    }
}
