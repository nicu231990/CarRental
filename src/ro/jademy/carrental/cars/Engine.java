package ro.jademy.carrental.cars;

public class Engine {
    private double capacity;
    private FuelType fuelType;

    public Engine(float capacity, FuelType fuelType){
        this.capacity = capacity;
        this.fuelType = fuelType;
    }

    public double getCapacity() {
        return capacity;
    }

    public FuelType getType() {
        return fuelType;
    }

    public String getEngineSpecs(){
        String output = String.format("%-5s%-5s",capacity,fuelType);
        return output;
    }
}
