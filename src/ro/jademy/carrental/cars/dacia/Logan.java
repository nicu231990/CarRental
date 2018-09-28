package ro.jademy.carrental.cars.dacia;

import ro.jademy.carrental.cars.Engine;
import ro.jademy.carrental.cars.CarType;
import ro.jademy.carrental.cars.Transmision;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public class Logan extends Dacia {
    public Logan(Engine engine, BigDecimal basePrice, String color, Calendar year,boolean available) {
        super("Logan", engine, basePrice, 4, color, CarType.SEDAN,Transmision.AUTOMATIC,year,available);
    }
}
