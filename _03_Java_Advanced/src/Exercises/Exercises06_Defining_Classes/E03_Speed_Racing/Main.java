package Exercises06_Defining_Classes.E03_Speed_Racing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int countCars = Integer.parseInt(scanner.nextLine());
        Map<String,Speed_Racing> cars = new LinkedHashMap<>();

        for (int i = 1; i <= countCars; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String model = data[0];
            double fuelAmount = Double.parseDouble(data[1]);
            double priceFuelPerKm = Double.parseDouble(data[2]);

            Speed_Racing car = new Speed_Racing(model,fuelAmount,priceFuelPerKm);
            cars.put(model,car);
        }
        String command = scanner.nextLine();
        while (!command.equals("End")){
            String carModelToDrive = command.split("\\s+")[1];
            int kmToDrive = Integer.parseInt(command.split("\\s+")[2]);

            Speed_Racing carToDrive = cars.get(carModelToDrive);

            if (!carToDrive.drive(kmToDrive)){
                System.out.println("Insufficient fuel for the drive");
            }
            command = scanner.nextLine();
        }
        for (Speed_Racing car : cars.values()) {
            System.out.println(car.toString());
        }
    }
}
