package FirststepsinJava;

import java.util.Scanner;

public class P02RadianstoDegrees {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        double radians =Double.parseDouble(scanner.nextLine());
        double deg= radians *180/ Math.PI;
        System.out.println (deg);

    }
}
