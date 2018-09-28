package ro.jademy.carrental.cars.renault;

import ro.jademy.carrental.cars.CarType;
import ro.jademy.carrental.cars.Engine;
import ro.jademy.carrental.cars.Transmision;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public class Clio extends Renault {
    public Clio(Engine engine, BigDecimal basePrice, String color, Calendar year,boolean available) {
        super("Clio", engine, basePrice, 2, color, CarType.COUPE,Transmision.MANUAL,year,available);
    }
}
