package LAB03_Sets_And_Maps_Advanced;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E08_Academy_Graduation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int studentCount=Integer.parseInt(scanner.nextLine());

        Map<String,Double[]> gradesPerStudents= new TreeMap<>();
        for (int i = 0; i < studentCount; i++) {
            String name = scanner.nextLine();
            String[] inputGrades = scanner.nextLine().split(" ");
            Double[] grades = new Double[inputGrades.length];

            for (int j = 0; j < inputGrades.length; j++) {
                grades[j] = Double.parseDouble(inputGrades[j]);
            }
            gradesPerStudents.put(name, grades);
        }

        for (String studentName : gradesPerStudents.keySet()) {
            Double[] grades = gradesPerStudents.get(studentName);

            double sum=0;

            for (Double grade : grades) {
                sum+=grade;
            }
            DecimalFormat decimalFormat=new DecimalFormat("0.#######");
            System.out.printf("%s is graduated with %s%n",studentName,decimalFormat.format(sum / grades.length));
        }
    }
}
