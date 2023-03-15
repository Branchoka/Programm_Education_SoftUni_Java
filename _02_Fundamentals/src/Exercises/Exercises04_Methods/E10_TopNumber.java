package Exercises04_Methods;

import java.util.Scanner;

public class E10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int numberInp=Integer.parseInt(scanner.nextLine());


        for (int number = 1; number <=numberInp ; number++) {
            if (isSumOfDigitsBy8(number) && isContainsOfDigits(number)){
                System.out.println(number);
            }
        }

    }
    public static boolean isSumOfDigitsBy8(int number) {

        int sumDigits=0;

        while (number>0){

            int lastDigit= number % 10;
            sumDigits += lastDigit;
            number=number/10;


        }
      return sumDigits % 8 == 0;

    }
    public static boolean isContainsOfDigits(int number){

        while (number>0){
            int lastDigit=number % 10;
            if (lastDigit % 2 != 0){
                return true;

            }else {
                number = number / 10;
            }


        }
        return false;


    }
}
