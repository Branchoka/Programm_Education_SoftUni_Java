package LAB_06_NestedLoop;

import java.util.Scanner;

public class MultiplicationTable_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                int product=x*y;
                System.out.printf("%d * %d = %d%n",x,y,product);

            }
            
        }
    }
}
