package LAB06_Defining_Classes._02_Constructors;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String brand;

    private String model;
    private int HorsePower;

    private List<String> parts;

    public Car(){
        this.parts = new ArrayList<>();
    }
    public Car(String brand){
        this(brand, "unknown", -1);
    }
    public Car(String brand,String model, int horsePower){
        this();

        this.brand = brand;
        this.model = model;
        this.HorsePower = horsePower;
    }
    public void addParts(String part){
        this.parts.add(part);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return HorsePower;
    }

    public void setHorsePower(int horsePower) {
        HorsePower = horsePower;
    }
    public String carInfo(){
        return this.toString();
    }

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.",
                this.brand, this.model, this.HorsePower);
    }

}
