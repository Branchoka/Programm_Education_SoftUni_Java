package LAB06_Defining_Classes._01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] carParts = scanner.nextLine().split("\\s+");
            Car car = new Car();
            car.setBrand(carParts[0]);
            car.setModel(carParts[1]);
            car.setHorsePower(Integer.parseInt(carParts[2]));

            System.out.println(car.carInfo());
        }

    }
    public static void test(){
        Car firstCar = new Car();
        Car secondCar = new Car();

        firstCar.setBrand("Chevrolet");
        firstCar.setModel("Impala");
        firstCar.setHorsePower(390);


        String firstFormat = String.format("The car is: %s %s - %d HP.", firstCar.getBrand(), firstCar.getModel(), firstCar.getHorsePower());

        System.out.println(firstCar.carInfo());
        //    System.out.println(firstCar);
        //    System.out.println(firstFormat);
    }
}

