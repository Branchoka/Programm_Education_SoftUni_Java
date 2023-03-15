package Exercises05_Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E07_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input=scanner.nextLine();
        List<String> inputList= Arrays.stream(input.split("\\|")).collect(Collectors.toList());

        Collections.reverse(inputList);

        System.out.println(inputList.toString().replace("[" ,"")
                                               .replace("]","")
                                               .replaceAll(",","").trim()
                                               .replaceAll("\\s+"," "));


    }
}
