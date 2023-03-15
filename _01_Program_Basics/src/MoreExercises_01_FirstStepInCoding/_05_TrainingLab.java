package P01MoreExersices;

import java.util.Scanner;

public class TrainingLab_05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double h=Double.parseDouble(scanner.nextLine());
        double w=Double.parseDouble(scanner.nextLine());

        h=h*100;
        w=w*100;
        double h1=Math.floor(h/120);
        double w1=Math.floor((w-100)/70);

        double total=(w1*h1)-3;
        System.out.println(total);
    }
}
