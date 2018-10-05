package ro.jademy.carrental.cars.ford;

import ro.jademy.carrental.cars.Availability;
import ro.jademy.carrental.cars.CarType;
import ro.jademy.carrental.cars.Engine;
import ro.jademy.carrental.cars.Transmision;
import ro.jademy.carrental.cars.Color;

import java.math.BigDecimal;
import java.util.Calendar;

public class Focus extends Ford {
    public Focus(Engine engine, BigDecimal basePrice, Color color, Calendar year, Availability available) {
        super("Focus", engine, basePrice, 4, color, CarType.HATCHBACK, Transmision.MANUAL, year, available);
    }
}
