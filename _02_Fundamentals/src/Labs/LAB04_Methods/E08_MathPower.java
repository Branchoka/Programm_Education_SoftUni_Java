package LAB04_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E08_MathPower {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double firstNumInp=Double.parseDouble(scanner.nextLine());
        double secondNumInp=Double.parseDouble(scanner.nextLine());

        double result=mathPower(firstNumInp,secondNumInp);
        DecimalFormat df=new DecimalFormat("0.####");
        System.out.println(df.format(result));
    }
    public static double mathPower(double num,double power){
        double result=1;

        for (int i = 1; i <= power; i++) {
            result=result*num;
        }
        return result;

    }
}
