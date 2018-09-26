package ro.jademy.carrental;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private List<Salesman> shopEmployees = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    // Q: what fields and methods should this class contain?

    public boolean login() {
        loginPage();
        // TODO: implement a basic user login
        String username = askUserName();
        String password = askPassword();
        for(Salesman salesman:shopEmployees){
            if(checkCredentials(username,password,salesman)){
                successfulLogInMessage();
                return true;
            }
        }
        return false;
    }

    public void start(){
        initEmployees();
        if(login()){
            showMenu();
        }else{
            System.out.println("Invalid Credentials");
        }
    }


    public void showMenu() {

        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the Jademy Car Rental Service   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. Check income");
        System.out.println("5. Logout");
        System.out.println("6. Exit");
    }

    public void showListMenuOptions() {

        System.out.println("Select an action from below:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        // TODO: add additional filter methods based on car specs

        System.out.println("4. Back to previous menu");

    }

    public void calculatePrice(int numberOfDays) {
        // TODO: apply a discount to the base price of a car based on the number of rental days
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }

    public void initEmployees() {
        Salesman salesman1 = new Salesman("Seder", "Nicu", "password1");
        Salesman salesman2 = new Salesman("Popescu", "Victor", "password2");
        Salesman salesman3 = new Salesman("Ionescu", "Radu", "password3");
        Collections.addAll(shopEmployees, salesman1, salesman2, salesman3);
    }

    public boolean checkCredentials(String username, String password, Salesman salesman) {
        if(salesman.getFirstName().equals(username) && salesman.getPassword().equals(password)){
            return true;
        }
        return false;
    }
    public void loginPage(){
        System.out.println(" -----------------------------------------------");
        System.out.println("|          Jademy Car Rental Service            |");
        System.out.println(" -----------------------------------------------");
        System.out.println("|                 Please Log In                 |");
        System.out.println(" -----------------------------------------------");
    }
    public String askUserName(){
        System.out.println("Introduce FIRST NAME");
        String username = scanner.next();
        return username;
    }
    public String askPassword(){
        System.out.println("Introduce PASSWORD");
        String password = scanner.next();
        return password;
    }
    public void successfulLogInMessage(){
        System.out.println("--------------------------");
        System.out.println("Log in successful!");
        System.out.println("--------------------------");
    }
}
