package LAB07_Associative_Arrays;
import java.util.*;

public class E03_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] words= scanner.nextLine().split(" ");


        LinkedHashMap<String,Integer> wordMap=new LinkedHashMap<>();

        for (String input:words){
            input=input.toLowerCase();

            wordMap.putIfAbsent(input,0);
            wordMap.put(input,wordMap.get(input) + 1);
        }

        List<String> resultList=new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if (entry.getValue() % 2 != 0){
            resultList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ",resultList));

    }
}
