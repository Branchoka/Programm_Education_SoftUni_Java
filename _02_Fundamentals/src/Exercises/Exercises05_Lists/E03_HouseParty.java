package Exercises05_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E03_HouseParty {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //входни данни :
        //1.колко команди ще имаме
        //2.в следващите редове ще получим следните команди
        // {name} is going! /ако името е в списъка трябва да отпечатаме {name} is already in the list!
        // {name} is not going! /ако името го няма в списъка трябва да отпечатаме {name} is not in the list!

        int commands=Integer.parseInt(scanner.nextLine());
        List<String> guestNames=new ArrayList<>();

        for (int count = 1; count <= commands; count++) {
            String command=scanner.nextLine();
            List<String> commandParts= Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String name= commandParts.get(0);
            if (commandParts.size() == 3){ // проверка за going
                if (guestNames.contains(name)){
                    System.out.printf("%s is already in the list!",name);
                    System.out.println();
                }else {
                    guestNames.add(name);
                }

            }else if (commandParts.size() == 4) { // проверка за not going
                if (guestNames.contains(name)) {
                    guestNames.remove(name);

                } else {
                    System.out.printf("%s is not in the list!", name);
                    System.out.println();
                }
            }
        }
        for (String guests:guestNames){
            System.out.println(guests + " ");
        }
    }
}
