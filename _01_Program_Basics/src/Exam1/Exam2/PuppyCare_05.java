package Exam2;

import java.util.Scanner;

public class PuppyCare_05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int kilos=Integer.parseInt(scanner.nextLine());
        int ate=0;
        String command=scanner.nextLine();
        while (!command.equals("Adopted")){
            int gr=Integer.parseInt(command);
            ate+=gr;

            command=scanner.nextLine();
        }
        if (ate<=kilos*1000){
            int diff=kilos * 1000 - ate;
            System.out.printf("Food is enough! Leftovers: %d grams.",diff);
        }else {
            int diff=ate - (kilos * 1000);
            System.out.printf("Food is not enough. You need %d grams more.",diff);

        }
    }
}
