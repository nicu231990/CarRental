package ro.jademy.carrental.cars.renault;

import ro.jademy.carrental.cars.*;

import java.math.BigDecimal;
import java.util.Calendar;

public class Captur extends Renault {
    public Captur(Engine engine, BigDecimal basePrice, Color color, Calendar year, Availability available) {
        super("Captur", engine, basePrice, 5, color, CarType.SUV, Transmision.AUTOMATIC, year, available);
    }
}
