package LAB06_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E06_Students_Part2 {

    static class Students {
        String firstName;
        String secondName;
        int age;
        String town;

        Students(){
            this.firstName=null;
            this.secondName=null;
            this.age=0;
            this.town=null;
        }

        public Students(String firstName, String secondName, int age, String town) {
            this.firstName=firstName;
            this.secondName=secondName;
            this.age=age;
            this.town=town;

        }

        public  String getTown () {
            return this.town;
        }
        public void setTown(String town){
            this.town=town;
        }
            public String getFirstName () {
                return this.firstName;
            }
            public void setFirstName(String firstName){
            this.firstName=firstName;
        }

            public String getSecondName () {
                return this.secondName;
            }
        public void setSecondName(String secondName){
            this.secondName=secondName;
        }

            public int getAge () {
                return this.age;
            }
        public void setAge(int age){
            this.age=age;
        }


        public  String toString(){
            return String.format("%s %s is %d years old%n",
                    this.getFirstName(),
                    this.getSecondName(),
                    this.getAge());
        }

    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        List<Students> studentsList= new ArrayList<>();

        String input=scanner.nextLine();

        while (!input.equals("end")){
            String[] studentsData=input.split(" ");

            String firstName=studentsData[0];
            String secondName=studentsData[1];
            int age=Integer.parseInt(studentsData[2]);
            String town=studentsData[3];

            Students currentStudents=new Students(firstName,secondName,age,town);

            int existingIndex=findStudentsIndex(studentsList,currentStudents.getFirstName(),
                    currentStudents.getSecondName());

            if (existingIndex != -1){
                studentsList.get(existingIndex).setAge(currentStudents.getAge());

                studentsList.get(existingIndex).setTown(currentStudents.getTown());
            }else {
                studentsList.add(currentStudents);
            }

            input=scanner.nextLine();
        }
        String hometown=scanner.nextLine();

        for (Students s:studentsList){
            if (s.getTown().equals(hometown)) {
                System.out.print(s);
            }
        }
    }
    static public int findStudentsIndex(List<Students> studentsList,String firstName,String secondName){

        for (int i = 0; i < studentsList.size(); i++) {
            String firstNameList=studentsList.get(i).getFirstName();
            String secondNameList=studentsList.get(i).getSecondName();

            if (firstNameList.equals(firstName) && secondNameList.equals(secondName)){
                return i;
            }
        }
        return -1;

    }
}
