package Exercises07_Associative_Arrays;

import java.util.*;

public class E05_Courses {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        Map<String, List<String>> courses=new LinkedHashMap<>();

        while (!input.equals("end")){
            String coursesName=input.split(" : ")[0];
            String personName=input.split(" : ")[1];

            if (!courses.containsKey(coursesName)){
                courses.put(coursesName,new ArrayList<>());
            }
            courses.get(coursesName).add(personName);
            input=scanner.nextLine();
        }
        courses.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
        });

    }
}
