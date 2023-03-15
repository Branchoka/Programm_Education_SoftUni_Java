package Exercises02_DataTypesAndVariables;

import java.util.Scanner;

public class E03_Elevator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int peoples=Integer.parseInt(scanner.nextLine());
        int capacityElev=Integer.parseInt(scanner.nextLine());

        int courses=(int) Math.ceil((double) peoples/capacityElev);

        System.out.println(courses);

    }
}
