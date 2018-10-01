package ro.jademy.carrental;

import ro.jademy.carrental.cars.*;
import ro.jademy.carrental.cars.dacia.Duster;
import ro.jademy.carrental.cars.dacia.Logan;
import ro.jademy.carrental.cars.dacia.Sandero;
import ro.jademy.carrental.cars.ford.Focus;
import ro.jademy.carrental.cars.ford.Kuga;
import ro.jademy.carrental.cars.ford.Mustang;
import ro.jademy.carrental.cars.renault.Captur;
import ro.jademy.carrental.cars.renault.Clio;
import ro.jademy.carrental.cars.renault.Megane;

import java.math.BigDecimal;
import java.util.*;

public class Shop {
    private BigDecimal income;
    private List<Salesman> shopEmployees = new ArrayList<>();
    private List<Car> cars = new ArrayList();
    private Scanner scanner = new Scanner(System.in);
    private BigDecimal getIncome = new BigDecimal(0);

    //constructor where employees and cars are initialized
    public Shop(){
        initEmployees();
        initCars();
        loginPage();
    }

    //login method
    private boolean login() {
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

    //start the app
    public void start(){
        if(login()){
            showMenu();
        }else{
            menuInvalidCredentials();
        }

    }
    //If credentials invalid then show options as try again or exit
    private void menuInvalidCredentials(){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Invalid Credentials");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("1. Try again");
        System.out.println("2. Exit");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        int option = scanner.nextInt();
        if(option == 1){
            start();
        }else{
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Closing Application...");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
            System.exit(0);
        }


    }

    //Menu design
    private void showMenu() {

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|                                            Welcome to the Jademy Car Rental Service                                                               |");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("MAIN MENU");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. Check income");
        System.out.println("5. Filter");
        System.out.println("6. Logout");
        System.out.println("7. Exit");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        checkChosenMenuOption();
    }


    private void checkChosenMenuOption(){
        switch (scanner.nextInt()){
            case 1:listAllCars();break;
            case 2:listAvailableCars();break;
            case 3:listUnavailableCars();break;
            case 4:checkIncome();break;
            case 5:showListMenuOptions();
            case 6:start();break;
            case 7:System.exit(0);
            default:break;
        }
    }

    private void checkFilterOption(){
        switch (scanner.nextInt()){
            case 1:filterByMake();break;
            case 2:filterByModel();break;
            case 3:filterByBudget();break;
            case 4:checkIncome();break;
            case 5:showListMenuOptions();
            default:break;
        }
    }

    //Filter options design
    private void showListMenuOptions() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Select an action from below:");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");

        // TODO: add additional filter methods based on car specs

        System.out.println("4. Back to previous menu");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        checkFilterOption();
    }

    public void calculatePrice(int numberOfDays) {
        // TODO: apply a discount to the base price of a car based on the number of rental days
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }

    //Init the list of employees (salesmen)
    private void initEmployees() {
        Salesman salesman1 = new Salesman("Seder", "Nicu", "nicu123","password1");
        Salesman salesman2 = new Salesman("Popescu", "Victor","victor123", "password2");
        Salesman salesman3 = new Salesman("Ionescu", "Radu","radu123", "password3");
        Collections.addAll(shopEmployees, salesman1, salesman2, salesman3);
    }

    //Method to initiate the list of cars in the shop
    private void initCars(){
        cars.add(new Logan(new Engine(1.0f,FuelType.GASOLINE),new BigDecimal(123),"Blue", new GregorianCalendar(2018,12,30),true));
        cars.add(new Focus(new Engine(2.0f,FuelType.ALTERNATIVE),new BigDecimal(178),"Red",new GregorianCalendar(2000,9,18),false));
        cars.add(new Clio(new Engine(4.0f,FuelType.DIESEL),new BigDecimal(113),"Green", new GregorianCalendar(2016,6,5),true));

        cars.add(new Duster(new Engine(8.0f,FuelType.ALTERNATIVE),new BigDecimal(193),"Yellow", new GregorianCalendar(2002,8,17),true));
        cars.add(new Mustang(new Engine(9.0f,FuelType.GASOLINE),new BigDecimal(1780),"Magenta", new GregorianCalendar(2006,3,16),true));
        cars.add(new Megane(new Engine(5.0f,FuelType.DIESEL),new BigDecimal(245),"Black", new GregorianCalendar(2015,5,12),false));

        cars.add(new Sandero(new Engine(11.0f,FuelType.DIESEL),new BigDecimal(187),"White", new GregorianCalendar(2003,7,14),true));
        cars.add(new Kuga(new Engine(12.0f,FuelType.GASOLINE),new BigDecimal(155),"Pink", new GregorianCalendar(2001,1,11),true));
        cars.add(new Captur(new Engine(14.0f,FuelType.DIESEL),new BigDecimal(213),"Orange", new GregorianCalendar(2010,4,5),true));

        cars.add(new Logan(new Engine(19.0f,FuelType.GASOLINE),new BigDecimal(111),"Silver", new GregorianCalendar(2011,2,7),false));
        cars.add(new Mustang(new Engine(22.0f,FuelType.GASOLINE),new BigDecimal(1190),"Grey", new GregorianCalendar(2012,9,2),true));
        cars.add(new Captur(new Engine(2.0f,FuelType.ALTERNATIVE),new BigDecimal(259),"Gold", new GregorianCalendar(2013,10,5),false));
    }

    //Check salesman credentials
    private boolean checkCredentials(String username, String password, Salesman salesman) {
        if(salesman.getUsername().equals(username) && salesman.getPassword().equals(password)){
            return true;
        }
        return false;
    }

    //Just for design. Login welcoming message
    private void loginPage(){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|                                                        Jademy Car Rental Service                                                                  |");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|                                                               Please Log In                                                                       |");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    private String askUserName(){
        System.out.println("USER NAME:");
        return scanner.next();
    }
    private String askPassword(){
        System.out.println("PASSWORD:");
        return scanner.next();
    }
    private String askMake(){
        System.out.println("MAKE: ");
        return scanner.next();
    }
    private void successfulLogInMessage(){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                           Log in successful!                                                                        ");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    //Just design for options
    private void allCarsOptions(){
        System.out.println("1. Actions                                                           2. Back                                                                  3. Exit");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    //Everytime we select an option an get a result we want to have options to go back, exit or do something else
    private void carsOptionChecking(){
        allCarsOptions();
        switch (scanner.nextInt()){
            case 1:listAllCars();break;
            case 2:showMenu();break;
            case 3:System.exit(0);
            default:break;
        }
    }

    //Listing al, available and rented cars
    private void listAllCars(){
        showHeader();
        for(Car car:cars){
            car.showCarDetails();
        }
        showFooter();
        carsOptionChecking();
    }
    private void listAvailableCars(){
        showHeader();
        for(Car car:cars){
            if(car.isAvailable()){
                car.showCarDetails();
            }
        }
        showFooter();
        carsOptionChecking();
    }
    private void listUnavailableCars(){
        showHeader();
        for(Car car:cars){
            if(!car.isAvailable()){
                car.showCarDetails();
            }
        }
        showFooter();
        carsOptionChecking();
    }

    //Checking income for cars which are marked as rented
    private void checkIncome(){
        int amount = 0;
        for (Car car:cars){
            if(!car.isAvailable()) {
                amount += car.getBasePrice().intValue();
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Income of rented cars: $" + amount);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        carsOptionChecking();
    }

    //FILTERRING METHODS
    private void filterByMake(){
        System.out.println("KEYWORD FOR MAKE:");
        List<Car> filteredByMakeCars = new ArrayList<>();
        String result = scanner.next().toLowerCase().trim();
        for(Car car:cars){
            if(car.getMake().toLowerCase().trim().contains(result)){
                filteredByMakeCars.add(car);
            }
        }
        showHeader();
        for(Car car:filteredByMakeCars){
                car.showCarDetails();
        }
        showFooter();
        carsOptionChecking();
    }

    private void filterByModel(){
        System.out.println("KEYWORD FOR MODEL:");
        List<Car> filteredByModelCars = new ArrayList<>();
        String result = scanner.next().toLowerCase().trim();
        for(Car car:cars){
            if(car.getModel().toLowerCase().trim().contains(result)){
                filteredByModelCars.add(car);
            }
        }
        showHeader();
        if(filteredByModelCars.size() != 0) {
            for (Car car : filteredByModelCars) {
                car.showCarDetails();
            }
        }else{
            System.out.println("Sorry! No cars found with this keyword");
            filterByModel();
        }
        showFooter();
        carsOptionChecking();
    }

    private void filterByBudget(){
        List<Car> filteredByBudgetCars = new ArrayList<>();
        System.out.println("BOTTOM LIMIT:");
        int bottom = scanner.nextInt();

        System.out.println("TOP LIMIT:");
        int top = scanner.nextInt();
        for(Car car:cars){
            if(car.getBasePrice().intValue() > bottom && car.getBasePrice().intValue() < top){
                filteredByBudgetCars.add(car);
            }
        }
        showHeader();
        if(filteredByBudgetCars.size() != 0) {
            for (Car car : filteredByBudgetCars) {
                car.showCarDetails();
            }
        }else{
            System.out.println("There are no cars in this price range");
            filterByBudget();
        }
        showFooter();
        System.out.println(top + bottom);
        carsOptionChecking();
    }

    //HEADER & FOOTER (just for design)
    private void showHeader(){
        String header = String.format("%-15s%-15s%-19s%-15s%-15s%-15s%-15s%-15s%-15s%-15s","MAKE","MODEL","ENGINE","PRICE","DOORS","COLOR","TYPE","TRANSMISION","YEAR","AVAILABLE");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(header);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");    }
    private void showFooter(){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
