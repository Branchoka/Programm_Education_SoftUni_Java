package P02MoreExersicesConditional;
import java.util.Scanner;

public class FuelTank_07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String petrol=scanner.nextLine();
        double litersPetrol=Double.parseDouble(scanner.nextLine());

        switch (petrol) {
            case "Diesel":
            case "Gasoline":
            case "Gas":
                if (litersPetrol >= 25) {
                    System.out.printf("You have enough %s.",petrol.toLowerCase());
                } else {
                    System.out.printf("Fill your tank with %s!", petrol.toLowerCase());
                }
                break;
            default:
                System.out.println("Invalid fuel!");
                break;
        }
    }
}
