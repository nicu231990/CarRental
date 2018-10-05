package ro.jademy.carrental.cars.dacia;

import ro.jademy.carrental.cars.Availability;
import ro.jademy.carrental.cars.CarType;
import ro.jademy.carrental.cars.Engine;
import ro.jademy.carrental.cars.Transmision;
import ro.jademy.carrental.cars.Color;

import java.math.BigDecimal;
import java.util.Calendar;

public class Logan extends Dacia {
    public Logan(Engine engine, BigDecimal basePrice, Color color, Calendar year, Availability available) {
        super("Logan", engine, basePrice, 4, color, CarType.SEDAN, Transmision.AUTOMATIC, year, available);
    }
}
