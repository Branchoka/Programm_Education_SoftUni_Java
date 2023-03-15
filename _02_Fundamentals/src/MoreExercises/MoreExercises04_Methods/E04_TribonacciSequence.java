package MoreExercises04_Methods;

import java.util.Scanner;

public class E04_TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int num=Integer.parseInt(scanner.nextLine());
        printTribunacci(num);

    }
    public static void printTribunacci(int num){

        int[] tribunacciStart=new int[1];
        tribunacciStart[0]=1;

        int[] tribunacciTemp=new int[num];

        for (int i = 0; i < num; i++) {
            if (i>2){
                    tribunacciTemp[i]=tribunacciTemp[i-1] + tribunacciTemp[i-2] + tribunacciTemp[i-3];
            }else if (i == 2) {
                tribunacciTemp[i]=tribunacciTemp[i-1]+ tribunacciTemp[i-2];
            }else if (i== 1){
                tribunacciTemp[i]=tribunacciTemp[i-1];
            }else if (i==0){
                tribunacciTemp[i]=1;
            }
        }
        for (int number:tribunacciTemp){
            System.out.print(number + " ");
        }
    }
}
