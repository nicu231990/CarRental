package ro.jademy.carrental.cars.renault;

import ro.jademy.carrental.cars.*;

import java.math.BigDecimal;
import java.util.Calendar;

public class Clio extends Renault {
    public Clio(Engine engine, BigDecimal basePrice, Color color, Calendar year, Availability available) {
        super("Clio", engine, basePrice, 2, color, CarType.COUPE, Transmision.MANUAL, year, available);
    }
}
