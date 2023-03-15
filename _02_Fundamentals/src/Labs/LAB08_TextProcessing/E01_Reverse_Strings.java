package LAB08_TextProcessing;

import java.util.Scanner;

public class E01_Reverse_Strings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String text=scanner.nextLine();

        while (!text.equals("end")){
            String reversed="";
            for (int i = text.length()-1; i >= 0; i--) {
                char currentSymbol=text.charAt(i);
                reversed+=currentSymbol;
            }
            System.out.printf("%s = %s%n",text,reversed);
            text=scanner.nextLine();

        }

    }
}
