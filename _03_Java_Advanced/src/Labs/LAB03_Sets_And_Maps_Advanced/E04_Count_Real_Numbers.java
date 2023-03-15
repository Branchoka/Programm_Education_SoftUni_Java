package LAB03_Sets_And_Maps_Advanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E04_Count_Real_Numbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Map<Double,Integer> occurrence = new LinkedHashMap<>();

        String[] numbers = scanner.nextLine().split(" ");

        for (String number : numbers){
            double current = Double.parseDouble(number);

            if (occurrence.containsKey(current)) {
                Integer count = occurrence.get(current);
                occurrence.put(current,count + 1);
            }else {
                occurrence.put(current,1);
            }
        }
        for (Double currentNumber : occurrence.keySet()) {
            System.out.printf("%.1f -> %d%n",currentNumber,occurrence.get(currentNumber));
        }
    }
}
