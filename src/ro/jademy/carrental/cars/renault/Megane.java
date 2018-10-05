package ro.jademy.carrental.cars.renault;

import ro.jademy.carrental.cars.*;

import java.math.BigDecimal;
import java.util.Calendar;

public class Megane extends Renault {
    public Megane(Engine engine, BigDecimal basePrice, Color color, Calendar year, Availability available) {
        super("Megane", engine, basePrice, 4, color, CarType.WAGON, Transmision.AUTOMATIC, year, available);
    }
}
