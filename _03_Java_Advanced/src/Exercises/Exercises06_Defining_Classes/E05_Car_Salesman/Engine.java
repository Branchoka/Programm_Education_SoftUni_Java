package Exercises06_Defining_Classes.E05_Car_Salesman;

public class Engine {

    private String model;

    private int power;

    private int displacement;

    private String efficiency;

    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public int getDisplacement() {
        return displacement;
    }

    public int getPower() {
        return power;
    }

    public String getModel() {
        return model;
    }
}
