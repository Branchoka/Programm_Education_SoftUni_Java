package Exercises05_Lists;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E10_SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<String> coursesList= Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command=scanner.nextLine();

        while (!command.equals("course start")) {
            String[] tokens = command.split(":");
            String input = tokens[0];
            String lessonTitle = tokens[1];
            switch (input) {
                case "Add":
                    if (!coursesList.contains(lessonTitle)) {
                        coursesList.add(lessonTitle);
                    }

                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[2]);
                    if (!coursesList.contains(lessonTitle)) {
                        coursesList.add(index, lessonTitle);
                    }
                    break;
                case "Remove":
                    if (coursesList.contains(lessonTitle)) {
                        coursesList.remove(lessonTitle);
                    }
                    int indexLesson = coursesList.indexOf(lessonTitle);
                    if (coursesList.get(indexLesson + 1).equals(lessonTitle + "-Exercise")) {
                        coursesList.remove(indexLesson + 1);
                    }
                    break;
                case "Swap":
                    String lessonTitle2 = command.split(":")[2];
                    String exercise1 = lessonTitle + "-Exercise";
                    String exercise2 = lessonTitle2 + "-Exercise";

                    if (coursesList.contains(lessonTitle) && coursesList.contains(lessonTitle2)) {
                        int indexFirstTitle = coursesList.indexOf(lessonTitle);
                        int indexSecondTitle = coursesList.indexOf(lessonTitle2);
                        coursesList.set(indexFirstTitle, lessonTitle2);
                        coursesList.set(indexSecondTitle, lessonTitle);

                        if (coursesList.contains(exercise1)) {
                            coursesList.remove(coursesList.indexOf(exercise1));
                            coursesList.add(coursesList.indexOf(lessonTitle + 1), exercise1);
                        }
                        if (coursesList.contains(exercise2)) {
                            coursesList.remove(coursesList.indexOf(exercise2));
                            coursesList.add(coursesList.indexOf(lessonTitle2) + 1, exercise2);
                        }
                    }

                    break;
                case "Exercise":
                    String exercise = lessonTitle + "-Exercise";
                    int indexLessonTitle = coursesList.indexOf(lessonTitle);
                    if (coursesList.contains(lessonTitle)) {
                        if (indexLessonTitle == coursesList.size() - 1) {

                            coursesList.add(indexLessonTitle + 1, exercise);

                        } else if (!coursesList.get(indexLessonTitle + 1).equals(exercise)) {
                            coursesList.add(indexLessonTitle + 1, exercise);
                        }
                    } else {
                        coursesList.add(lessonTitle);
                        coursesList.add(exercise);
                    }

                    break;
            }

            command=scanner.nextLine();
        }

        printCourses(coursesList);

    }

    private static void printCourses(List<String> coursesList) {

        int counts=1;
        for (String courses: coursesList){
            System.out.println(counts + "." + courses);
            counts++;
        }
    }
}
