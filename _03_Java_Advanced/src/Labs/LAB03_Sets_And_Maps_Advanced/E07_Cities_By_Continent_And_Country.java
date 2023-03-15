package LAB03_Sets_And_Maps_Advanced;

import java.util.*;

public class E07_Cities_By_Continent_And_Country {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, LinkedHashMap<String, List<String>>> continentMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String continent = input[0];
            String country = input[1];
            String city = input[2];

            continentMap.putIfAbsent(continent,new LinkedHashMap<>());
            continentMap.get(continent).putIfAbsent(country,new ArrayList<>());
            continentMap.get(continent).get(country).add(city);

        }
        continentMap.forEach((continent, value) -> {
            System.out.println(continent + ":");
            value.forEach((country,city) -> System.out.println(" " + country + " -> " + String.join(", ",city)));
        });
    }
}
