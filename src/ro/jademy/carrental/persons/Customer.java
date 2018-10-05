package ro.jademy.carrental.persons;

import java.math.BigDecimal;

public class Customer extends Person {
    private BigDecimal budget;

    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
    }


}
