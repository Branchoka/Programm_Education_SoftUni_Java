package Exercises07_Associative_Arrays;


import java.util.*;

public class E06_Student_Academy {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        Map<String, List<Double>> studentGrade=new LinkedHashMap<>();

        int countStudent=Integer.parseInt(scanner.nextLine());
        for (int student = 1; student <= countStudent; student++) {
            String name=scanner.nextLine();
            double grade=Double.parseDouble(scanner.nextLine());

            if (!studentGrade.containsKey(name)){
                studentGrade.put(name,new ArrayList<>());
            }
            studentGrade.get(name).add(grade);
        }

        Map<String,Double> averageGradStudents=new LinkedHashMap<>();

        for (Map.Entry<String,List<Double>> entry: studentGrade.entrySet()){

            String studentName=entry.getKey();
            List<Double> listGrades=entry.getValue();
            double averageGrade=getAverageGrade(listGrades);

            if (averageGrade >= 4.50){
                averageGradStudents.put(studentName,averageGrade);
            }
        }
        averageGradStudents.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue()));
    }
    private static double getAverageGrade(List<Double> listGrades){
        double sumGrades=0;

       for (double grade : listGrades){
           sumGrades+= grade;
       }

       return sumGrades/listGrades.size();
    }
}
