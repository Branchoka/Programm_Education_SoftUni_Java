package LAB04_Methods;

import java.util.Scanner;

public class E04_Calculations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String commandInput=scanner.nextLine();
        int firstNumInp=Integer.parseInt(scanner.nextLine());
        int secondNumInp=Integer.parseInt(scanner.nextLine());



        switch (commandInput){
            case "add":
                addNumbers(firstNumInp,secondNumInp);

                break;
            case "multiply":
                multiplyNumbers(firstNumInp,secondNumInp);


                break;
            case "subtract":
                subtractNumbers(firstNumInp,secondNumInp);

                break;
            case "divide":
                divideNumbers(firstNumInp,secondNumInp);

                break;
        }
    }
    public static void addNumbers(int firstNum,int secondNum){
        int result=firstNum+secondNum;
        System.out.println(result);
    }
    public static void multiplyNumbers(int firstNum,int secondNum){
        int result=firstNum*secondNum;
        System.out.println(result);

    }
    public static void subtractNumbers(int firstNum,int secondNum){
        int result=firstNum-secondNum;
        System.out.println(result);
    }
    public static void divideNumbers(int firstNum,int secondNum){
        int result=firstNum/secondNum;
        System.out.println(result);
    }

}
