package Exercises06_Defining_Classes.E05_Car_Salesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int enginesCount = Integer.parseInt(scanner.nextLine());
        List<Engine> engines = new ArrayList<>();
        for (int i = 1; i <= enginesCount; i++) {
            String[] parts = scanner.nextLine().split("\\s+");
            String model = parts[0];
            int power = Integer.parseInt(parts[1]);
            int displacement = 0;
            String efficiency = null;

            if (parts.length == 4){
                displacement = Integer.parseInt(parts[2]);
                efficiency = parts[3];
            }else if (parts.length == 3){
                if (Character.isDigit(parts[2].charAt(0))){
                    displacement = Integer.parseInt(parts[2]);
                }else {
                    efficiency = parts[2];
                }
            }
            Engine engine = new Engine(model,power,displacement,efficiency);
            engines.add(engine);

        }
        int carsCount = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= carsCount; i++) {
            String[] carData = scanner.nextLine().split("\\s+");
            String carModel = carData[0];
            String engineModel = carData[1];
            int weight = 0;
            String color = null;

            if (carData.length == 4){
                weight = Integer.parseInt(carData[2]);
                color = carData[3];
            }else if (carData.length == 3){
                if (Character.isDigit(carData[2].charAt(0))){
                    weight = Integer.parseInt(carData[2]);
                }else {
                    color = carData[2];
                }
            }
            Engine carEngine = null;
            for (Engine engine : engines) {
                if (engineModel.equals(engine.getModel())){
                    carEngine = engine;
                    break;
                }
            }
            Car car = new Car(carModel,carEngine,weight,color);
            System.out.print(car.toString());
        }
    }
}
