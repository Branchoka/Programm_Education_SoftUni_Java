package Exercises06_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class E04_Students {
    public static class Students{
        private String firstName;
        private String secondName;
        private double grade;

        public Students(String firstName, String secondName, double grade) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.grade = grade;
        }

        public double getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f",this.firstName,this.secondName,this.grade);
        }
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        List<Students> studentsList=new ArrayList<>();

        int countStudents=Integer.parseInt(scanner.nextLine());

        for (int rows = 1; rows <= countStudents; rows++) {
            String dataStudent=scanner.nextLine();
            String[] studentArr=dataStudent.split(" ");
            String firstName=studentArr[0];
            String secondName=studentArr[1];
            double grade=Double.parseDouble(studentArr[2]);

            Students students=new Students(firstName,secondName,grade);
            studentsList.add(students);



        }
        studentsList.sort(Comparator.comparing(Students::getGrade).reversed());

        for (Students students:studentsList){
            System.out.println(students.toString());
        }

    }
}
