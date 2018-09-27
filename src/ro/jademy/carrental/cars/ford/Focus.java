package ro.jademy.carrental.cars.ford;

import ro.jademy.carrental.Engine;

import java.math.BigDecimal;

public class Focus extends Ford {
    public Focus(Engine engine, BigDecimal basePrice, Integer doorNumber, String color) {
        super("Focus", engine, basePrice, doorNumber, color);
    }
}
