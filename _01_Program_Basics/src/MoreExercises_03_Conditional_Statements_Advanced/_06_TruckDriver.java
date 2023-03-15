package P03MoreExercises_ConditionAdvanced;

import java.util.Scanner;

public class E06_TruckDriver {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String season=scanner.nextLine();
        double kmForMount=Double.parseDouble(scanner.nextLine());

        double salary=0;
        double totalSalary=0;

            if (kmForMount>10000 && kmForMount <=20000){
                salary=kmForMount*1.45*4;
                totalSalary=salary- (salary*0.10);
                switch (season){
                    case "Spring":
                    case "Summer":
                    case "Autumn":
                    case "Winter":
                        System.out.printf("%.2f",totalSalary);
                        break;
                }
            }else if (kmForMount>5000 && kmForMount<=10000){
                switch (season){
                    case "Spring":
                    case "Autumn":
                        salary=kmForMount*0.95*4;
                        totalSalary=salary-(salary*0.10);
                        System.out.printf("%.2f",totalSalary);
                        break;
                    case "Summer":
                        salary=kmForMount* 1.10*4;
                        totalSalary=salary-(salary*0.10);
                        System.out.printf("%.2f",totalSalary);
                        break;
                    case "Winter":
                        salary=kmForMount *1.25*4;
                        totalSalary=salary-(salary*0.10);
                        System.out.printf("%.2f",totalSalary);
                        break;
                }
            }else if (kmForMount <=5000){
                switch (season){
                    case "Spring":
                    case "Autumn":
                        salary=kmForMount*0.75*4;
                        totalSalary=salary-(salary*0.10);
                        System.out.printf("%.2f",totalSalary);
                        break;
                    case "Summer":
                        salary=kmForMount*0.90*4;
                        totalSalary=salary-(salary*0.10);
                        System.out.printf("%.2f",totalSalary);
                        break;
                    case "Winter":
                        salary=kmForMount*1.05*4;
                        totalSalary=salary-(salary*0.10);
                        System.out.printf("%.2f",totalSalary);
                        break;

                }
            }
    }
}
