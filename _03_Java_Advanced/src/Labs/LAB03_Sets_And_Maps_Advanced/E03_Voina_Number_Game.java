package LAB03_Sets_And_Maps_Advanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class E03_Voina_Number_Game {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Set<Integer> deckOne = new LinkedHashSet<>();
        Set<Integer> deckTwo = new LinkedHashSet<>();

        String[] inputOne = scanner.nextLine().split(" ");
        for (int i = 0; i < inputOne.length; i++) {
            int current = Integer.parseInt(inputOne[i]);
            deckOne.add(current);
        }
        String[] inputTwo = scanner.nextLine().split(" ");
        for (int i = 0; i < inputTwo.length; i++) {
            int current = Integer.parseInt(inputTwo [i]);
            deckTwo.add(current);
        }
      //  Iterator<Integer> iteratorOne = deckOne.iterator();
      //  Iterator<Integer> iteratorTwo = deckTwo.iterator();

        int step = 1;
        while (deckOne.size() > 0 && deckTwo.size() > 0){
            if (step >= 50){
                break;
            }
            Integer fighterOne = deckOne.iterator().next();
            Integer fighterTwo = deckTwo.iterator().next();

            deckOne.remove(fighterOne);
            deckTwo.remove(fighterTwo);

            if (fighterOne > fighterTwo){
                deckOne.add(fighterOne);
                deckOne.add(fighterTwo);

            }else if (fighterTwo > fighterOne){
                deckTwo.add(fighterOne);
                deckTwo.add(fighterTwo);

            }

            step++;
        }
        if (deckOne.size() < deckTwo.size()){
            System.out.println("Second player win!");
        }else if (deckTwo.size() < deckOne.size()){
            System.out.println("First player win!");
        }else {
            System.out.println("Draw!");
        }
    }
}
