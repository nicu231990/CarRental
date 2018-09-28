package ro.jademy.carrental.cars.ford;

import ro.jademy.carrental.cars.CarType;
import ro.jademy.carrental.cars.Engine;
import ro.jademy.carrental.cars.Transmision;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public class Focus extends Ford {
    public Focus(Engine engine, BigDecimal basePrice, String color, Calendar year,boolean available) {
        super("Focus", engine, basePrice, 4, color, CarType.HATCHBACK,Transmision.MANUAL,year,available);
    }
}
