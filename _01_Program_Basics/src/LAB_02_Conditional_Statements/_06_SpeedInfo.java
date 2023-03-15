package LAB02_Conditional_Statements;

import java.util.Scanner;

public class SpeedInfo06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double speed=Double.parseDouble(scanner.nextLine());

        String textPrint= "";

        if (speed<=10){
            textPrint="slow";
        }else if (speed<=50){
            textPrint="average";
        }else if (speed<=150){
            textPrint="fast";
        }else if (speed<=1000){
            textPrint="ultra fast";
        }else {
            textPrint="extremely fast";
        }

        System.out.println(textPrint);

    }
}
