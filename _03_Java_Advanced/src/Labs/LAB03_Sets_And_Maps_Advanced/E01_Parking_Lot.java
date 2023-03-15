package LAB03_Sets_And_Maps_Advanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class E01_Parking_Lot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input=scanner.nextLine();

        Set<String> cars=new LinkedHashSet<>();

        while (!input.equals("END")){
            String[] parts = input.split(", ");
            String direction = parts[0];
            String carNumbers = parts[1];

            if (direction.equals("IN")){
                cars.add(carNumbers);

            }else if (direction.equals("OUT")){
                cars.remove(carNumbers);

            }else {

            }


            input=scanner.nextLine();
        }
        if (cars.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for (String car : cars){
                System.out.println(car);
            }
        }
    }
}
