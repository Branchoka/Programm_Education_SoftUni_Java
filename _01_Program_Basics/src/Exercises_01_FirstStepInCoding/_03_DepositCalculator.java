package FirststepsinJava;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int mounts = Integer.parseInt(scanner.nextLine());
        double persent = Double.parseDouble(scanner.nextLine());

        double sum= deposit + mounts * ((deposit * persent/100)/12);

        System.out.println(sum);



    }
}
