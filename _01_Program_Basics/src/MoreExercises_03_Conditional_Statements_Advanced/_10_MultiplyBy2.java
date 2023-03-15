package P03MoreExercises_ConditionAdvanced;

import java.util.Scanner;

public class E10_MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number=0;

        for (int i = 1; i > 0; i++) {
            number=Double.parseDouble(scanner.nextLine());

            if (number<0){
                System.out.println("Negative number!");
                break;
            }else {
                System.out.printf("Result: %.2f\n",number*2);
            }
        }

    }
}
