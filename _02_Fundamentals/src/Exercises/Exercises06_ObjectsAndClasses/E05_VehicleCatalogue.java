package Exercises06_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E05_VehicleCatalogue {

    public static class  Vehicle{
        private String type;
        private String model;
        private String color;
        private  int hp;

        public Vehicle(String type, String model, String color, int hp) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.hp = hp;
        }

        public String getModel() {
            return this.model;
    }

        public void setModel(String model) {
            this.model = model;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getHp() {
            return this.hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String toString(){

            String typeVeh = type.equals("car") ? "Car" : "Truck";
            return "Type: " + typeVeh + "\n" +
                "Model: " +  model + "\n" +
                "Color: " + color + "\n" +
                "Horsepower: " + hp;

        }
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        List<Vehicle> dataVehicle=new ArrayList<>();
        String input=scanner.nextLine();

        while (!input.equals("End")){
            String[] inputData=input.split("\\s+");

            String type= inputData[0];
            String model=inputData[1];
            String color=inputData[2];
            int hp=Integer.parseInt(inputData[3]);

            Vehicle vehicle=new Vehicle(type,model,color, hp);
            dataVehicle.add(vehicle);
            input=scanner.nextLine();
        }


        String enteredModel=scanner.nextLine();
        double sumCar=0;
        double sumTruck=0;
        int countCar=0;
        int countTruck=0;

        while (!enteredModel.equals("Close the Catalogue")){

            for (Vehicle vehicle:dataVehicle){
                if (enteredModel.equals(vehicle.getModel())){
                    System.out.println(vehicle);

                }
            }



            enteredModel=scanner.nextLine();
        }
        for (Vehicle vehicle : dataVehicle) {
            if (vehicle.getType().equals("car")){
                sumCar+=vehicle.getHp();
                countCar++;
            }else if (vehicle.getType().equals("truck")){
                sumTruck+=vehicle.getHp();
                countTruck++;
            }
        }
        double averageCar=sumCar/countCar;
        if (countCar == 0) {averageCar = 0;}
        System.out.printf("Cars have average horsepower of: %.2f.%n",averageCar);
        double averageTruck=sumTruck/countTruck;
        if (countTruck == 0) {averageTruck = 0;}
        System.out.printf("Trucks have average horsepower of: %.2f.",averageTruck);

    }
}
