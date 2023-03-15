package LAB08_TextProcessing;

import java.util.Scanner;

public class E05_DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String text=scanner.nextLine();

        StringBuilder digitSb=new StringBuilder();
        StringBuilder letterSb=new StringBuilder();
        StringBuilder symbolSb=new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char symbol=text.charAt(i);

            if (Character.isDigit(symbol)){
                digitSb.append(symbol);
            }else if (Character.isLetter(symbol)){
                letterSb.append(symbol);
            }else {
                symbolSb.append(symbol);
            }
            //начин на решаване и с ASCII таблица
          //  if (symbol >= '0' && symbol <= '9'){
            //    digitSb.append(symbol);
           // }else if (symbol >= 'A' && symbol <= 'Z' || symbol >= 'a' && symbol <= 'z'){
           //     letterSb.append(symbol);
           // }else if (symbol >= )
        }
        System.out.println(digitSb.toString());
        System.out.println(letterSb);
        System.out.println(symbolSb);
    }
}
