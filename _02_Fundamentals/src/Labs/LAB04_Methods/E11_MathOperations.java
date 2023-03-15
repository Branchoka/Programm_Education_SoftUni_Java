package LAB04_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int number1=Integer.parseInt(scanner.nextLine());
        String operator=scanner.nextLine();
        int number2=Integer.parseInt(scanner.nextLine());

        DecimalFormat df=new DecimalFormat("##.##");
        System.out.println(df.format(calculate(number1,operator,number2)));

    }
    public static double calculate(int number1,String operator,int number2){
            double price=0;
        switch (operator){
            case "/":
                price=number1*1.0/number2;
                break;
            case "*":
                price=number1*number2;
                break;
            case "+":
                price=number1+number2;
                break;
            case "-":
                price=number1-number2;
                break;
        }
        return price;
    }
}
