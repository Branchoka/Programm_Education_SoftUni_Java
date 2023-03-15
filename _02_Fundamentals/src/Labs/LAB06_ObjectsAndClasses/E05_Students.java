package LAB06_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E05_Students {

    static class Student{
        private String firstName;
        private String secondName;
        private int age;
        private String town;

        public Student(String firstName,String secondName,int age,String town){
            this.firstName=firstName;
            this.secondName=secondName;
            this.age=age;
            this.town=town;

        }

        public String getFirstName() {
            return firstName;
        }

        public String getSecondName() {
            return secondName;
        }
        public int getAge() {
            return age;
        }

        public String getTown() {
            return town;
        }
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        List<Student> studentsList=new ArrayList<>();



        while (!input.equals("end")){
            String[] studentData=input.split("\\s+");
            String firstname=studentData[0];
            String secondName=studentData[1];
            int age=Integer.parseInt(studentData[2]);
            String town=studentData[3];

            Student currentStudent=new Student(firstname,secondName,age,town);
            studentsList.add(currentStudent);



            input=scanner.nextLine();
        }
        String homeTown=scanner.nextLine();

        for (Student item:studentsList){
            if (item.getTown().equals(homeTown)) {
                System.out.printf("%s %s is %d years old%n",item.getFirstName(),item.getSecondName(),item.getAge());
            }
        }

    }
}
