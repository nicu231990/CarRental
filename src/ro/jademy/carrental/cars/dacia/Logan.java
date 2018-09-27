package ro.jademy.carrental.cars.dacia;

import ro.jademy.carrental.Engine;

import java.math.BigDecimal;

public class Logan extends Dacia {
    public Logan(Engine engine, BigDecimal basePrice, Integer doorNumber, String color) {
        super("Logan", engine, basePrice, doorNumber, color);
    }
}
