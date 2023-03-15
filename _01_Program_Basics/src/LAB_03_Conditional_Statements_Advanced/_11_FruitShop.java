package LAB03;

import java.util.Scanner;

public class FruitShop11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String WeekDay = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        boolean isWorkingDay = WeekDay.equals("Monday") ||
                WeekDay.equals("Tuesday") ||
                WeekDay.equals("Wednesday") ||
                WeekDay.equals("Thursday") ||
                WeekDay.equals("Friday");

        boolean isWeekend = WeekDay.equals("Saturday") ||
                WeekDay.equals("Sunday");
        boolean inValid = false;
        double price = 0;

        if (isWorkingDay) {
            if (fruit.equals("banana")) {
                price = 2.50;
            } else if (fruit.equals("apple")) {
                price = 1.20;

            } else if (fruit.equals("orange")) {
                price = 0.85;

            } else if (fruit.equals("grapefruit")) {
                price = 1.45;

            } else if (fruit.equals("kiwi")) {
                price = 2.70;

            } else if (fruit.equals("pineapple")) {
                price = 5.50;

            } else if (fruit.equals("grapes")) {
                price = 3.85;
            } else {
                inValid = true;
            }
        } else if (isWeekend) {
            if (fruit.equals("banana")) {
                price = 2.70;
            } else if (fruit.equals("apple")) {
                price = 1.25;

            } else if (fruit.equals("orange")) {
                price = 0.90;

            } else if (fruit.equals("grapefruit")) {
                price = 1.60;

            } else if (fruit.equals("kiwi")) {
                price = 3.00;

            } else if (fruit.equals("pineapple")) {
                price = 5.60;

            } else if (fruit.equals("grapes")) {
                price = 4.20;

            } else {
                inValid = true;
            }
        }else {
            inValid=true;
        }if (!inValid) {
            double result = price * quantity;
            System.out.printf("%.2f",result);
        }else {
            System.out.println("error");
        }
    }
}
