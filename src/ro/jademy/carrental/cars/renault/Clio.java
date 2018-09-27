package ro.jademy.carrental.cars.renault;

import ro.jademy.carrental.Engine;

import java.math.BigDecimal;

public class Clio extends Renault {
    public Clio(Engine engine, BigDecimal basePrice, Integer doorNumber, String color) {
        super("Clio",engine,basePrice,doorNumber,color);
    }
}
