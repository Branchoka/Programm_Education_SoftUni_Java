package P01MoreExersices;

import java.util.Scanner;

public class CelsiusToFahrenheit_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double celsius=Double.parseDouble(scanner.nextLine());

        double temperature=(celsius*1.8)+32;
        System.out.printf("%.2f",temperature);




    }
}
