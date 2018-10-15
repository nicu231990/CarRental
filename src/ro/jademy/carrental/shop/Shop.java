package ro.jademy.carrental.shop;

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
import ro.jademy.carrental.persons.Salesman;

import java.math.BigDecimal;
import java.util.*;

public class Shop {
    private BigDecimal income = new BigDecimal(0);
    private List<Salesman> shopEmployees = new ArrayList<>();
    private List<Car> cars = new ArrayList();
    private Scanner scanner = new Scanner(System.in);
    private Comparator<Car> comparator;

    //Init the list of employees (salesmen)
    private void initEmployees() {
        Salesman salesman1 = new Salesman("Seder", "Nicu", "nicu123", "password1");
        Salesman salesman2 = new Salesman("Popescu", "Victor", "victor123", "password2");
        Salesman salesman3 = new Salesman("Ionescu", "Radu", "radu123", "password3");
        Collections.addAll(shopEmployees, salesman1, salesman2, salesman3);
    }

    //Method to initiate the list of cars in the shop
    private void initCars() {
        cars.add(new Logan(new Engine(1.0, FuelType.GASOLINE), new BigDecimal(123), Color.BLACK, new GregorianCalendar(2018, 12, 30), Availability.AVAILABLE));
        cars.add(new Focus(new Engine(2.0, FuelType.ALTERNATIVE), new BigDecimal(178), Color.BLUE, new GregorianCalendar(2000, 9, 18), Availability.RENTED));
        cars.add(new Clio(new Engine(4.0, FuelType.DIESEL), new BigDecimal(113), Color.GRAY, new GregorianCalendar(2016, 6, 5), Availability.AVAILABLE));

        cars.add(new Duster(new Engine(8.0, FuelType.ALTERNATIVE), new BigDecimal(193), Color.GRAY, new GregorianCalendar(2002, 8, 17), Availability.AVAILABLE));
        cars.add(new Mustang(new Engine(9.0, FuelType.GASOLINE), new BigDecimal(1780), Color.GREEN, new GregorianCalendar(2006, 3, 16), Availability.AVAILABLE));
        cars.add(new Megane(new Engine(5.0, FuelType.DIESEL), new BigDecimal(245), Color.GREEN, new GregorianCalendar(2015, 5, 12), Availability.RENTED));

        cars.add(new Sandero(new Engine(11.0, FuelType.DIESEL), new BigDecimal(187), Color.WHITE, new GregorianCalendar(2003, 7, 14), Availability.AVAILABLE));
        cars.add(new Kuga(new Engine(12.0, FuelType.GASOLINE), new BigDecimal(155), Color.WHITE, new GregorianCalendar(2001, 1, 11), Availability.AVAILABLE));
        cars.add(new Captur(new Engine(14.0, FuelType.DIESEL), new BigDecimal(213), Color.RED, new GregorianCalendar(2010, 4, 5), Availability.AVAILABLE));

        cars.add(new Logan(new Engine(19.0, FuelType.GASOLINE), new BigDecimal(111), Color.YELLOW, new GregorianCalendar(2011, 2, 7), Availability.RENTED));
        cars.add(new Mustang(new Engine(22.0, FuelType.GASOLINE), new BigDecimal(1190), Color.RED, new GregorianCalendar(2012, 9, 2), Availability.AVAILABLE));
        cars.add(new Captur(new Engine(2.0, FuelType.ALTERNATIVE), new BigDecimal(259), Color.YELLOW, new GregorianCalendar(2013, 10, 5), Availability.RENTED));
    }

    //constructor where employees and cars are initialized
    public Shop() {
        initEmployees();
        initCars();
        loginMessage();
    }

    //start the application
    public void startApplication() {
        if (login()) {
            showMainMenu();
        } else {
            menuInvalidCredentials();
        }
    }

    //login method
    private boolean login() {
        String username = askUserName();
        String password = askPassword();
        for (Salesman salesman : shopEmployees) {
            if (checkSalesmanCredentials(username, password, salesman)) {
                successfulLogInMessage();
                return true;
            }
        }
        return false;
    }

    //If credentials invalid then show options as try again or exit
    private void menuInvalidCredentials() {
        messageInvalidCredentials();
        checkInvalidCredentialsOption();
    }

    //--------------------------------------------------------------------------------------------------------------------------------------
    //Methods checking options in different menus
    private void checkMainMenuOption() {
        switch (scanner.nextInt()) {
            case 1:
                listAllCars();
                break;
            case 2:
                listAvailableCars();
                break;
            case 3:
                listUnavailableCars();
                break;
            case 4:
                checkIncome();
                break;
            case 5:
                showFilterMenu();
                break;
            case 6:
                rentCar();
                break;
            case 7:
                returnCar();
                break;
            case 8:
                showSortingMenu();
                break;
            case 9:
                showMainMenu();
                break;
            case 0:
                System.exit(0);
            default:
                break;
        }
    }

    private void checkInvalidCredentialsOption() {
        switch (scanner.nextInt()) {
            case 1:
                startApplication();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("Chosse between 1 and 2");
                checkInvalidCredentialsOption();
                break;
        }
    }

    private void checkFilterMenuOption() {
        switch (scanner.nextInt()) {
            case 1:
                filterByMake();
                break;
            case 2:
                filterByModel();
                break;
            case 3:
                filterByBudget();
                break;
            case 4:
                filterByColor();
                break;
            case 5:
                filterByTransmision();
            case 6:
                filterByDoorNumber();
                break;
            case 7:
                filterByCarType();
                break;
            case 8:
                showMainMenu();
                break;
            default:
                System.out.println("Choose betwen 1-8");
                checkFilterMenuOption();
                break;
        }
    }

    private void checkSortingMenuOption() {
        switch (scanner.nextInt()) {
            case 1:
                sortAscending();
                break;
            case 2:
                sortDescending();
                break;
            case 3:
                sortByMake();
                break;
            case 4:
                sortByModel();
                break;
            case 5:
                sortByColor();
                break;
            case 6:
                sortNewestOldest();
                break;
            case 7:
                sortOldestNewest();
                break;
            case 8:
                showMainMenu();
                break;
            case 9:
                System.exit(0);
                break;
            default:
                System.out.println("Choose between 1-9");
                checkSortingMenuOption();
                break;
        }
    }

    private void checkMainMenuGoBackOption() {
        allCarsOptions();
        switch (scanner.nextInt()) {
            case 1:
                showMainMenu();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("Choose betwen 1-2");
                checkMainMenuGoBackOption();
                break;
        }
    }

    private void checkTryAgainFilterByBudget() {
        switch (scanner.nextInt()) {
            case 1:
                filterByBudget();
                break;
            case 2:
                showFilterMenu();
                break;
            default:
                System.out.println("Choose between 1-2");
                checkTryAgainFilterByBudget();
                break;
        }
    }

    private boolean checkSalesmanCredentials(String username, String password, Salesman salesman) {
        if (salesman.getUsername().equals(username) && salesman.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    //--------------------------------------------------------------------------------------------------------------------------------------
    //Different sorting methods
    private void sortAscending() {
        List<Car> sortedCars = new ArrayList<>();
        sortedCars.addAll(cars);

        Collections.sort(sortedCars, (Car car1, Car car2)->{
            BigDecimal price0 = car1.getBasePrice();
            BigDecimal price1 = car2.getBasePrice();
            return price0.compareTo(price1);
        });

        listCar(sortedCars);
        showSortingMenu();
    }

    private void sortDescending() {
        List<Car> sortedCars = new ArrayList<>();
        sortedCars.addAll(cars);
        Collections.sort(sortedCars, (Car car1, Car car2)-> {
                BigDecimal price0 = car1.getBasePrice();
                BigDecimal price1 = car2.getBasePrice();
                return price1.compareTo(price0);

        });
        listCar(sortedCars);
        showSortingMenu();
    }

    private void sortByColor() {
        List<Car> sortedCars = new ArrayList<>();
        sortedCars.addAll(cars);
        Collections.sort(sortedCars, (Car car1, Car car2)-> {
                Color color0 = car1.getColor();
                Color color1 = car2.getColor();
                return color0.compareTo(color1);
        });
        listCar(sortedCars);
        showSortingMenu();
    }

    private void sortByModel() {
        List<Car> sortedCars = new ArrayList<>();
        sortedCars.addAll(cars);
        Collections.sort(sortedCars, (Car car1, Car car2)-> {
                String model0 = car1.getModel();
                String model1 = car2.getModel();
                return model0.compareTo(model1);
        });
        listCar(sortedCars);
        showSortingMenu();
    }

    private void sortByMake() {
        List<Car> sortedCars = new ArrayList<>();
        sortedCars.addAll(cars);
        Collections.sort(sortedCars, (Car car1, Car car2)-> {
                String make0 = car1.getMake();
                String make1 = car2.getMake();
                return make0.compareTo(make1);
        });
        listCar(sortedCars);
        showSortingMenu();
    }

    private void sortNewestOldest() {
        List<Car> sortedCars = new ArrayList<>();
        sortedCars.addAll(cars);
        Collections.sort(sortedCars, (Car car1, Car car2)-> {
                return car2.getYear().compareTo(car1.getYear());
        });
        listCar(sortedCars);
        showSortingMenu();
    }

    private void sortOldestNewest() {
        List<Car> sortedCars = new ArrayList<>();
        sortedCars.addAll(cars);
        Collections.sort(sortedCars, (Car car1, Car car2)-> {
                return car1.getYear().compareTo(car2.getYear());
        });
        listCar(sortedCars);
        showSortingMenu();
    }

    //--------------------------------------------------------------------------------------------------------------------------------------

    //--------------------------------------------------------------------------------------------------------------------------------------
    //Different filtering methods
    private void filterByMake() {
        System.out.println("KEYWORD FOR MAKE:");
        List<Car> filteredByMakeCars = new ArrayList<>();
        String result = scanner.next().toLowerCase().trim();
        for (Car car : cars) {
            if (car.getMake().toLowerCase().trim().contains(result)) {
                filteredByMakeCars.add(car);
            }
        }
        listCar(filteredByMakeCars);
        showFilterMenu();
    }

    private void filterByColor() {
        System.out.println("KEYWORD FOR COLOR:");
        List<Car> filteredByColorCars = new ArrayList<>();
        String result = scanner.next().toLowerCase().trim();
        for (Car car : cars) {
            if (car.getColor().toString().toLowerCase().trim().contains(result)) {
                filteredByColorCars.add(car);
            }
        }
        listCar(filteredByColorCars);
        showFilterMenu();
    }

    private void filterByTransmision() {
        System.out.println("KEYWORD FOR TRANSMISION:");
        List<Car> filteredByTransmisionCars = new ArrayList<>();
        String result = scanner.next().toLowerCase().trim();
        for (Car car : cars) {
            if (car.getTransmissionType().toString().toLowerCase().trim().contains(result)) {
                filteredByTransmisionCars.add(car);
            }
        }
        listCar(filteredByTransmisionCars);
        showFilterMenu();
    }

    private void filterByCarType() {
        System.out.println("KEYWORD FOR CAR TYPE:");
        List<Car> filteredByCarTypeCars = new ArrayList<>();
        String result = scanner.next().toLowerCase().trim();
        for (Car car : cars) {
            if (car.getCarType().toString().toLowerCase().trim().contains(result)) {
                filteredByCarTypeCars.add(car);
            }
        }
        listCar(filteredByCarTypeCars);
        showFilterMenu();
    }

    private void filterByDoorNumber() {
        System.out.println("NUMBER OF DOORS:");
        List<Car> filteredByDoorNumberCars = new ArrayList<>();
        int result = scanner.nextInt();
        for (Car car : cars) {
            if (car.getDoorNumber().equals(result)) {
                filteredByDoorNumberCars.add(car);
            }
        }
        listCar(filteredByDoorNumberCars);
        showFilterMenu();
    }

    private void filterByModel() {
        System.out.println("KEYWORD FOR MODEL:");
        List<Car> filteredByModelCars = new ArrayList<>();
        String result = scanner.next().toLowerCase().trim();
        for (Car car : cars) {
            if (car.getModel().toLowerCase().trim().contains(result)) {
                filteredByModelCars.add(car);
            }
        }
        if (filteredByModelCars.size() != 0) {
            listCar(filteredByModelCars);
        } else {
            System.out.println("Sorry! No cars found with this keyword");
            filterByModel();
        }
        showFilterMenu();
    }

    private void filterByBudget() {
        List<Car> filteredByBudgetCars = new ArrayList<>();
        System.out.println("BOTTOM LIMIT:");
        int bottom = scanner.nextInt();

        System.out.println("TOP LIMIT:");
        int top = scanner.nextInt();
        for (Car car : cars) {
            if (car.getBasePrice().intValue() > bottom && car.getBasePrice().intValue() < top) {
                filteredByBudgetCars.add(car);
            }
        }
        if (filteredByBudgetCars.size() != 0) {
            listCar(filteredByBudgetCars);
        } else {
            System.out.println("There are no cars in this price range");
        }
        tryAgainFilterByBudget();
    }
    //--------------------------------------------------------------------------------------------------------------------------------------

    //Method which shows all the cars from a list  sent as parameter
    private void listCar(List<Car> listOfCars) {
        showHeader();
        for (Car car : listOfCars) {
            car.showCarDetails();
        }
        showFooter();
    }
    //--------------------------------------------------------------------------------------------------------------------------------------


    //--------------------------------------------------------------------------------------------------------------------------------------
    //Different methods applied to cars' price
    public BigDecimal calculatePrice(Car car, int numberOfDays) {
        showDiscountDetails();
        BigDecimal discountedPrice = car.getBasePrice();
        // TODO: apply a discount to the base price of a car based on the number of rental days
        if (numberOfDays >= 1 && numberOfDays <= 3) {
            discountedPrice = car.getBasePrice().multiply(new BigDecimal(0.97));
        } else if (numberOfDays >= 4 && numberOfDays <= 8) {
            discountedPrice = car.getBasePrice().multiply(new BigDecimal(0.93));
        } else if (numberOfDays >= 9 && numberOfDays <= 13) {
            discountedPrice = car.getBasePrice().multiply(new BigDecimal(0.90));
        } else if (numberOfDays > 13) {
            discountedPrice = car.getBasePrice().multiply(new BigDecimal(0.85));
        }
        return discountedPrice;
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }

    private void checkIncome() {
        int amount = 0;
        for (Car car : cars) {
            if (car.isAvailable().equals(Availability.RENTED)) {
                amount += car.getBasePrice().intValue();
            }
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%s%,d\n", "Income of rented cars: $", amount);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        checkMainMenuGoBackOption();
    }
    //--------------------------------------------------------------------------------------------------------------------------------------


    //--------------------------------------------------------------------------------------------------------------------------------------
    //Methods for renting and returning cars
    private void rentCar() {
        showHeader();
        List<Car> availableCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.isAvailable().equals(Availability.AVAILABLE)) {
                availableCars.add(car);
            }
        }
        for (Car car : availableCars) {
            car.showCarDetails();
        }
        showFooter();
        int option;
        System.out.println("CHOOSE A CAR TO RENT");
        do {
            option = scanner.nextInt();
        } while (option < 1 && option > availableCars.size());


        for (Car car : cars) {
            if (car == availableCars.get(option - 1)) {
                car.setAvailable(Availability.RENTED);
                System.out.println("YOU HAVE RENTED:");
                car.showCarDetails();
                break;
            }
        }
        showMainMenu();
    }

    private void returnCar() {
        showHeader();
        List<Car> rentedCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.isAvailable().equals(Availability.RENTED)) {
                rentedCars.add(car);
            }
        }
        for (Car car : rentedCars) {
            car.showCarDetails();
        }
        showFooter();
        int option;
        System.out.println("CHOOSE A CAR TO RETURN");
        do {
            option = scanner.nextInt();
        } while (option < 1 && option > rentedCars.size());


        for (Car car : cars) {
            if (car == rentedCars.get(option - 1)) {
                car.setAvailable(Availability.AVAILABLE);
                System.out.println("YOU HAVE RETURNED:");
                car.showCarDetails();
                break;
            }
        }
        showMainMenu();
    }
    //--------------------------------------------------------------------------------------------------------------------------------------


    //--------------------------------------------------------------------------------------------------------------------------------------
    //Listing all, available and rented cars
    private void listAllCars() {
        listCar(cars);
        checkMainMenuGoBackOption();
    }

    private void listAvailableCars() {
        showHeader();
        for (Car car : cars) {
            if (car.isAvailable().equals(Availability.AVAILABLE)) {
                car.showCarDetails();
            }
        }
        showFooter();
        checkMainMenuGoBackOption();
    }

    private void listUnavailableCars() {
        showHeader();
        for (Car car : cars) {
            if (car.isAvailable().equals(Availability.RENTED)) {
                car.showCarDetails();
            }
        }
        showFooter();
        checkMainMenuGoBackOption();
    }
    //--------------------------------------------------------------------------------------------------------------------------------------

    //Checking income for cars which are marked as rented


    //Menu design
    private void showMainMenu() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|                                            Welcome to the Jademy Car Rental Service                                                                                           |");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("MAIN MENU");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. Check income");
        System.out.println("5. Filter");
        System.out.println("6. Rent a car");
        System.out.println("7. Return a car");
        System.out.println("8. Sort");
        System.out.println("9. Logout");
        System.out.println("0. Exit");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        checkMainMenuOption();
    }

    //Filter options design
    private void showFilterMenu() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Select an action from below:");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        System.out.println("4. Filter by color");
        System.out.println("5. Filter by transmision");
        System.out.println("6. Filter by door number");
        System.out.println("7. Filter by car type");
        System.out.println("8. Back to previous menu");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        checkFilterMenuOption();
    }

    private void showDiscountDetails() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("3% [1 - 3 days] ");
        System.out.println("7% [4 - 8 days] ");
        System.out.println("10% [9 - 13 days] ");
        System.out.println("15% [> 13 days] ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    private void showSortingMenu() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("1. Sort ascending by price");
        System.out.println("2. Sort descending by price ");
        System.out.println("3. Sort by make");
        System.out.println("4. Sort by model");
        System.out.println("5. Sort by color");
        System.out.println("6. Sort by production date - Newest to Oldest ");
        System.out.println("7. Sort by production date - Oldest to Newest ");
        System.out.println("8. Back");
        System.out.println("9. EXIT");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        checkSortingMenuOption();
    }

    //Just for design. Login welcoming message
    private void loginMessage() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|                                                        Jademy Car Rental Service                                                                                              |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                               Please Log In                                                                                                   |");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    private String askUserName() {
        System.out.println("USER NAME:");
        return scanner.next();
    }

    private String askPassword() {
        System.out.println("PASSWORD:");
        return scanner.next();
    }

    private String askMake() {
        System.out.println("MAKE: ");
        return scanner.next();
    }

    private void successfulLogInMessage() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                   Log in successful!                                                                            ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    //Just design for options
    private void allCarsOptions() {
        System.out.println("1. Back");
        System.out.println("2. Exit");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    //HEADER & FOOTER (just for design)
    private void showHeader() {
        String header = String.format("|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|", "MAKE", "MODEL", "CAPACITY", "TYPE", "PRICE", "DOORS", "COLOR", "TYPE", "TRANSMISION", "YEAR", "AVAILABLE");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(header);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    private void tryAgainFilterByBudget() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("1. Try again");
        System.out.println("2. Back");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        checkTryAgainFilterByBudget();
    }

    private void showFooter() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    private void messageInvalidCredentials() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Invalid Credentials");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("1. Try again");
        System.out.println("2. Exit");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }
}
