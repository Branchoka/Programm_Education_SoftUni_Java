package MoreExercises02_DataTypes;

import java.util.Scanner;

public class E04_RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int num=Integer.parseInt(scanner.nextLine());

        for (int number = 2; number <= num; number++) {
            boolean isSimple=true;
            for (int i = 2; i < number; i++) {
                if (number%i == 0){
                    isSimple=false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n",number,isSimple);

        }
    }
}
