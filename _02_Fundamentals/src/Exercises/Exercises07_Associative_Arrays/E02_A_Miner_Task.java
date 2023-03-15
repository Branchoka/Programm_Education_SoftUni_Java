package Exercises07_Associative_Arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E02_A_Miner_Task {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Map<String,Integer> resourcesQuantity=new LinkedHashMap<>();

        String resources=scanner.nextLine();

        while (!resources.equals("stop")){
            int quantity=Integer.parseInt(scanner.nextLine());
            if (!resourcesQuantity.containsKey(resources)){
                resourcesQuantity.put(resources,quantity);

            }
            else {
                int currentQuantity=resourcesQuantity.get(resources);
                resourcesQuantity.put(resources,currentQuantity+quantity);
            }
            resources=scanner.nextLine();
        }
        resourcesQuantity.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
