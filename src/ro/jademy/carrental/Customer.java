package ro.jademy.carrental;

import java.math.BigDecimal;

public class Customer extends Person {
    private BigDecimal budget;

    public Customer(String firstName, String lastName){
        super(firstName, lastName);
    }


}
