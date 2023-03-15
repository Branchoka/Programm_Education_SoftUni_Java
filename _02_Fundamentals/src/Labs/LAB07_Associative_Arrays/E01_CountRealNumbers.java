package LAB07_Associative_Arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E01_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double[] numbersArr= Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        TreeMap<Double,Integer> countMap=new TreeMap<>();

        for (double numbers: numbersArr){
            if (!countMap.containsKey(numbers)){
                countMap.put(numbers,1);
            }else {
                countMap.put(numbers,countMap.get(numbers) + 1);
            }
        }
        for (Map.Entry<Double,Integer> entry : countMap.entrySet()){
            System.out.printf("%.0f -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
