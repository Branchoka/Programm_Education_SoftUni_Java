package Exercises_06_NestedLoop;

import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        String command=scanner.nextLine();

        double allGradesSum=0;
        int countAllGrades=0;


        while (!command.equals("Finish")){
            String presentation= command;
            double sumCurrentGrades= 0;
            for (int i = 1; i <= n; i++) {
                double currentGrade=Double.parseDouble(scanner.nextLine());
                countAllGrades++;
                sumCurrentGrades+= currentGrade;
            }
            allGradesSum=allGradesSum + sumCurrentGrades;

            double averageCurrentGrade=sumCurrentGrades/n;

            System.out.printf("%s - %.2f.%n",presentation,averageCurrentGrade);


            command=scanner.nextLine();


        }
        double finalGrades=allGradesSum / countAllGrades;
        System.out.printf("Student's final assessment is %.2f.",finalGrades);
    }
}