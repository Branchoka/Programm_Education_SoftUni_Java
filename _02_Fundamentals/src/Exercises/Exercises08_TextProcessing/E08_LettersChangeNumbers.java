package Exercises08_TextProcessing;

import java.util.Scanner;

public class E08_LettersChangeNumbers {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String input=scanner.nextLine();
        
        String[] codes=input.split("\\s+");

        double totalSum=0;

        for (String code:codes){
            double modifiedNumber=getModifiedNumber(code);
            totalSum+=modifiedNumber;
        }
        System.out.printf("%.2f",totalSum);
    }
    public static double getModifiedNumber(String code){
        char firstLetter=code.charAt(0);
        char secondLetter=code.charAt(code.length()-1);
        double number=Double.parseDouble (code.replace(firstLetter,' ')
                .replace(secondLetter,' ').trim());

        if (Character.isUpperCase(firstLetter)){
           int positionUpperLetter= (int) firstLetter - 64;
            number /= positionUpperLetter;
        }else {
            int positionLowerLetter= (int) firstLetter - 96;
            number *= positionLowerLetter;
        }

        if (Character.isUpperCase(secondLetter)){
            int positionUpperCase=(int) secondLetter - 64;
            number -= positionUpperCase;
        }else {
            int positionLowerCase=(int) secondLetter - 96;
            number += positionLowerCase;
        }
        return number;
    }

}
