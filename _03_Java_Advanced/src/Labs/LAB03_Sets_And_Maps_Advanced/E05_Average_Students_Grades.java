package LAB03_Sets_And_Maps_Advanced;

import java.util.*;

public class E05_Average_Students_Grades {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int studentNumber=Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> gradesOfStudents = new TreeMap<>();

        for (int i = 0; i < studentNumber; i++) {
            String[] studentsWithGrade = scanner.nextLine().split("\\s+");
            String name = studentsWithGrade[0];
            double grade = Double.parseDouble(studentsWithGrade[1]);

            gradesOfStudents.putIfAbsent(name,new ArrayList<>());
            gradesOfStudents.get(name).add(grade);
        }
        gradesOfStudents.entrySet().forEach(entry -> {
            double sum = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                sum += entry.getValue().get(i);
            }
            double averageGrade = sum / entry.getValue().size();
            System.out.print(entry.getKey() + " -> ");
            entry.getValue().forEach(e -> System.out.printf("%.2f ",e));
            System.out.printf("(avg: %.2f)%n",averageGrade);
        });

    }
}
