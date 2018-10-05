package ro.jademy.carrental.persons;

public class Salesman extends Person {
    private String password;
    private String username;

    // Q: how can we avoid duplicate code in the salesman and the customer classes?
    public Salesman(String firstName, String lastName, String username, String password) {
        super(firstName, lastName);
        this.password = password;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
