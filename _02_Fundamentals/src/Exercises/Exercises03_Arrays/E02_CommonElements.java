package Exercises03_Arrays;

import java.util.Scanner;

public class E02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String text1=scanner.nextLine();
        String text2=scanner.nextLine();

        String[] fArray=text1.split(" ");
        String[] sArray=text2.split(" ");

        for (int i = 0; i <sArray.length ; i++) {

            for (int j = 0; j <fArray.length ; j++) {

                if (fArray[j].equals(sArray[i])){
                System.out.printf("%s ",sArray[i]);
              }

            }

        }
    }
}
