package LAB06_Defining_Classes._01;

public class Car {
    private String brand;

    private String model;
    private int HorsePower;

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

