package Exercises06_Defining_Classes.E02_Company_Roster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Department> departments = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            Employee currentEmployee = new Employee();
            if (data.length == 6) {
             currentEmployee = new Employee(
                data[0],
                Double.parseDouble(data[1]),
                data[2],
                data[3],
                data[4],
                Integer.parseInt(data[5]));
            }else if (data.length == 5){
                if (isInteger(data[data.length - 1])){
                    currentEmployee = new Employee(
                            data[0],
                            Double.parseDouble(data[1]),
                            data[2],
                            data[3],
                            Integer.parseInt(data[4]));
                }else {
                    currentEmployee = new Employee(
                            data[0],
                            Double.parseDouble(data[1]),
                            data[2],
                            data[3],
                            data[4]);
                }
            } else if (data.length == 4) {
                currentEmployee = new Employee(
                        data[0],
                        Double.parseDouble(data[1]),
                        data[2],
                        data[3]);
            }
            Department department = new Department(data[3],currentEmployee);
            if (!isDepartmentExist(departments,data[3])){
                departments.add(department);
            }else {
                for (Department dp : departments) {
                    if (dp.getName().equals(data[3])){
                        dp.setEmployeeList(currentEmployee);
                        break;
                    }
                }
            }
        }
        double maxAverageSalary = Double.MIN_VALUE;
        String department = "";

        for (Department dp : departments) {
            double averageSalary = dp.getAverageSalary(dp);

            if (averageSalary> maxAverageSalary){
                maxAverageSalary = averageSalary;
                department = dp.getName();
            }
        }
        System.out.println("Highest Average Salary: " + department);
        for (Department dp : departments) {
            if (dp.getName().equals(department)){
                dp.printSortedDescendingBySalary();
            }
        }
    }
    private static boolean isDepartmentExist(List<Department> departments, String input) {
        for (Department dp : departments) {
            if (dp.getName().equals(input)){
                return true;
            }
        }
        return false;
    }

    private static boolean isInteger(String input) {
        Pattern pattern = Pattern.compile("\\d*");
        return pattern.matcher(input).matches();
    }
}
