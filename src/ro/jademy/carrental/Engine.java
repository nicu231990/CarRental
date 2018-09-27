package ro.jademy.carrental;

public class Engine {
    private double capacity;
    private String type;

    public Engine(float capacity, String type){
        this.capacity = capacity;
        this.type = type;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public String getEngineSpecs(){
        String result = capacity + "   " + type;
        return result;
    }
}
