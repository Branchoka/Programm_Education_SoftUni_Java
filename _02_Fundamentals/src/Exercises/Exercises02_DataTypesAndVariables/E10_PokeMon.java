package Exercises02_DataTypesAndVariables;

import java.util.Scanner;

public class E10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int pokePower=Integer.parseInt(scanner.nextLine());
        int distance=Integer.parseInt(scanner.nextLine());
        int factor=Integer.parseInt(scanner.nextLine());

        int firstPower=pokePower;
        int pokes=0;

        while (pokePower>=distance){
            pokePower-=distance;
            pokes++;

            if (pokePower == firstPower/2) {
                if (factor !=0) {
                    pokePower = pokePower / factor;
                }
            }
        }
        System.out.println(pokePower);
        System.out.println(pokes);
    }
}
