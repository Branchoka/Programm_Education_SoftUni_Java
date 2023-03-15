package Exercises09_Regular_Expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E01_Furniture {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> furnitureNames=new ArrayList<>();
        double totalSum=0;
        String regex= ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        String command=scanner.nextLine();

        Pattern pattern=Pattern.compile(regex);
        while (!command.equals("Purchase")){
            Matcher matcher=pattern.matcher(command);
            if (matcher.find()){
                String furniture=matcher.group("furniture");
                double price=Double.parseDouble(matcher.group("price"));
                int quantity=Integer.parseInt(matcher.group("quantity"));

                furnitureNames.add(furniture);
                double currentFurniturePrice=price*quantity;
                totalSum+=currentFurniturePrice;
            }
            command=scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitureNames.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f",totalSum);
    }
}
