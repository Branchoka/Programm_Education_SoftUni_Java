package Exercises03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E09_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //1.повтарящо действие-въвеждане на команди
        //2.swap-> разменяне на елементите
        //3.multiply-> взема се елемента от 1ви индекс и се умножава с 2рия.Трябва да се запази целият елемент на 1вия
        //4.decrease-> намалява всички елементи с 1

        int[] input= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command=scanner.nextLine();


        while (!command.equals("end")){
            //SWAP команда на масиви
            if (command.contains("swap")){
                int index1=Integer.parseInt(command.split(" ")[1]);
                int index2=Integer.parseInt(command.split(" ")[2]);
                int element1=input[index1];
                int element2=input[index2];
                input[index1]=element2;
                input[index2]=element1;

                //MULTIPLY команда на масиви
            }else if (command.contains("multiply")){
                int index1=Integer.parseInt(command.split(" ")[1]);
                int index2=Integer.parseInt(command.split(" ")[2]);
                int element1=input[index1];
                int element2=input[index2];
                int product=element1*element2;
                input[index1]=product;


            }else if (command.equals("decrease")){
                //обхождане на всички елементи и се намалява с едно всеки път
                //позиции/индекси->0 до последния (дължината на масива)
                for (int index = 0; index <= input.length-1; index++) {
                    input[index]--;
                }

            }
            command=scanner.nextLine();
        }
        for (int index = 0; index <=input.length-1 ; index++) {
            int currentNum=input[index];
            if (index!=input.length-1) {
                System.out.print(currentNum + ", ");
            }else {//index=number.length - 1
                System.out.print(currentNum);
            }
        }
    }
}
