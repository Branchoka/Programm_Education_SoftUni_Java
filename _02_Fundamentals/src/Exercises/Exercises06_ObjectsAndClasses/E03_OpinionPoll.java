package Exercises06_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E03_OpinionPoll {
    public static class Person{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Person> personList=new ArrayList<>();

        int numberInput=Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberInput; i++) {
            String input = scanner.nextLine();
            String[] personData = input.split(" ");

            String name = personData[0];
            int age = Integer.parseInt(personData[1]);

            if (age> 30){
                Person person=new Person(name,age);
                personList.add(person);
            }
        }
        for (Person people:personList){
            System.out.println(people.getName() + " - " + people.getAge());
        }
    }
}
