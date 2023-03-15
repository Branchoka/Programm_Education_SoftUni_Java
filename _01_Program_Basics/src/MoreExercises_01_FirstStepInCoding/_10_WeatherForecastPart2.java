package P01MoreExersices;

import java.util.Scanner;

public class WeatherForecastPart2_10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double degree=Double.parseDouble(scanner.nextLine());

        if (degree>=5.00 && degree<=11.9){
            System.out.printf("Cold");
        }else if (degree>=12 && degree<=14.9){
            System.out.printf("Cool");
        }else if (degree>=15 && degree<=20.00){
            System.out.printf("Mild");
        }else if (degree>=20.1 && degree<=25.9){
            System.out.printf("Warm");
        }else if (degree>=26.00 && degree<=35.00){
            System.out.printf("Hot");
        }else {
            System.out.printf("unknown");
        }


    }
}
