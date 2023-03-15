package Exercises09_Regular_Expressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E04_Star_Enigma {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int countMessages=Integer.parseInt(scanner.nextLine());
        String regex= "@(?<planetName>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attackType>[AD])[^@!:>-]*!->(?<soldiersCount>[0-9]+)";

        Pattern pattern=Pattern.compile(regex);

        List<String> attackerPlanets=new ArrayList<>();
        List<String> destroyedPlanets=new ArrayList<>();

        
        for (int messageCount = 1; messageCount <= countMessages; messageCount++) {
            String encryptMessage=scanner.nextLine();
            String decryptedMessage=getDecryptedMessage(encryptMessage);

            Matcher matcher=pattern.matcher(decryptedMessage);
            if (matcher.find()){
            String planetName=matcher.group("planetName");
            // int population=Integer.parseInt(matcher.group("population"));
            String attackType=matcher.group("attackType");
            //  int soldierCount=Integer.parseInt(matcher.group("soldierCount"));

            if (attackType.equals("A")){
                attackerPlanets.add(planetName);
            }else if (attackType.equals("D")){
                destroyedPlanets.add(planetName);
                }
            }
        }
        System.out.println("Attacked planets: " + attackerPlanets.size());
        Collections.sort(attackerPlanets);
        attackerPlanets.forEach(planet -> System.out.println("-> " + planet));

        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        Collections.sort(destroyedPlanets);
        destroyedPlanets.forEach(planet -> System.out.println("-> " + planet));
    }
    public static String getDecryptedMessage(String encryptMessage){
        int countLetters=getSpecialLetterCount(encryptMessage);
        StringBuilder decryptedMessage=new StringBuilder();
        for(char symbol:encryptMessage.toCharArray()){
            char newSymbol = (char) (symbol - countLetters);
            decryptedMessage.append(newSymbol);
        }
        return decryptedMessage.toString();

    }

    private static int getSpecialLetterCount(String encryptMessage) {
        int count=0;

        for (char symbol:encryptMessage.toCharArray()){
            switch (symbol){
                case 's':
                case 't':
                case 'a':
                case 'r':
                case 'S':
                case 'T':
                case 'A':
                case 'R':
                    count++;
                    break;
            }
        }
        return count;
    }
}
