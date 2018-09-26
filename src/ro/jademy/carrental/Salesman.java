package ro.jademy.carrental;

public class Salesman extends Person{
    private String password;

    // Q: how can we avoid duplicate code in the salesman and the customer classes?
    public Salesman(String firstName, String lastName, String password){
        super(firstName, lastName);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
