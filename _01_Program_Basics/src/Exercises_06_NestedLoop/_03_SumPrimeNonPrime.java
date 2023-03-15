package Exercises_06_NestedLoop;

import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String command=scanner.nextLine();
        int somePrime=0;
        int someNonPrime=0;

        while (!command.equals("stop")){
            int number=Integer.parseInt(command);

            if (number < 0){
                System.out.println("Number is negative.");
                command=scanner.nextLine();
                continue;
            }
            int counter=0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0){
                    counter++;
                }
            }

            if (counter == 2) {
                somePrime += number;
            }else {
                someNonPrime+=number;
            }




            command=scanner.nextLine();

        }
        System.out.println("Sum of all prime numbers is: " + somePrime);
        System.out.println("Sum of all non prime numbers is: " + someNonPrime);

    }
}
