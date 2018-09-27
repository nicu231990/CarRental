package ro.jademy.carrental;

import ro.jademy.carrental.cars.Car;
import ro.jademy.carrental.cars.dacia.Logan;
import ro.jademy.carrental.cars.ford.Focus;
import ro.jademy.carrental.cars.renault.Clio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private List<Salesman> shopEmployees = new ArrayList<>();
    private List<Car> cars = new ArrayList();
    private Scanner scanner = new Scanner(System.in);
    // Q: what fields and methods should this class contain?

    private boolean login() {
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
        initCars();
        if(login()){
            showMenu();
        }else{
            System.out.println("Invalid Credentials");
        }
        showHeader();
        listAllCars();
        showFooter();
    }


    private void showMenu() {

        System.out.println("------------------------------------------------------------------");
        System.out.println("|              Welcome to the Jademy Car Rental Service          |");
        System.out.println("------------------------------------------------------------------");
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

    private void initEmployees() {
        Salesman salesman1 = new Salesman("Seder", "Nicu", "nicu123","password1");
        Salesman salesman2 = new Salesman("Popescu", "Victor","victor123", "password2");
        Salesman salesman3 = new Salesman("Ionescu", "Radu","radu123", "password3");
        Collections.addAll(shopEmployees, salesman1, salesman2, salesman3);
    }

    private void initCars(){
        cars.add(new Logan(new Engine(12.4f,"diesel"),new BigDecimal(7),67,"blue"));
        cars.add(new Focus(new Engine(5.7f,"gas"),new BigDecimal(75),9,"red"));
        cars.add(new Clio(new Engine(123.8f,"electric"),new BigDecimal(127),137,"green"));
    }

    private boolean checkCredentials(String username, String password, Salesman salesman) {
        if(salesman.getUsername().equals(username) && salesman.getPassword().equals(password)){
            return true;
        }
        return false;
    }
    private void loginPage(){
        System.out.println("------------------------------------------------------------------");
        System.out.println("|                      Jademy Car Rental Service                 |");
        System.out.println("------------------------------------------------------------------");
        System.out.println("|                      Please Log In                             |");
        System.out.println("------------------------------------------------------------------");
    }
    private String askUserName(){
        System.out.println("USER NAME:");
        String username = scanner.next();
        return username;
    }
    private String askPassword(){
        System.out.println("PASSWORD:");
        String password = scanner.next();
        return password;
    }
    private void successfulLogInMessage(){
        System.out.println("------------------------------------------------------------------");
        System.out.println("                      Log in successful!                          ");
        System.out.println("------------------------------------------------------------------");
    }
    private void listAllCars(){
        for(Car car:cars){
            car.showCarDetails();
        }
    }
    private void showHeader(){
        String header = String.format("%-15s%-15s%-15s%-15s%-15s","MAKE","MODEL","PRICE","DOOR NUMB","COLOR");
        System.out.println("------------------------------------------------------------------");
        System.out.println(header);
        System.out.println("------------------------------------------------------------------");
    }
    private void showFooter(){
        System.out.println("------------------------------------------------------------------");
    }
}
