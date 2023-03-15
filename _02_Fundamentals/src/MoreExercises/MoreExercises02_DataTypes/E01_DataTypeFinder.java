package MoreExercises02_DataTypes;

import java.util.Scanner;

public class E01_DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //•	Integer
        //•	Floating point ->съдържа символа.
        //•	Characters -> трябва да има дължина от 1 код <48 || код>57
        //•	Boolean ->true or false;
        //•	Strings -> ако имаме последователност само от символи (код <45 || код >57)

        String input=scanner.nextLine();

        while (!input.equals("END")){
            String type="";
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")){
                type="boolean";
            }
            else if (input.length() ==1){
                char symbol=input.charAt(0);
                if (symbol<47 || symbol>58){
                    type="character";
                }else{
                    type="integer";
                }
            }
            else {
                boolean isString=false;
                boolean isFloat=false;
                for (int i = 0; i < input.length() ; i++) {
                    char currentSymbol=input.charAt(i);
                    if (currentSymbol<45 || currentSymbol >57){
                        isString=true;
                    }
                    if (currentSymbol == 46){
                        isFloat=true;
                    }

                }
                if (isString){
                    type= "string";

                }else {
                    if (isFloat){
                        type="floating point";
                    }else {
                        type="integer";
                    }
                }
            }

            System.out.printf("%s is %s type",input,type);
            System.out.println();
            input=scanner.nextLine();
        }

    }
}
