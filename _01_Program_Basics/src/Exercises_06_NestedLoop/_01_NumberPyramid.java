package Exercises_06_NestedLoop;

import java.util.Scanner;

public class NumberPyramid_01 {
    public static void main (String [] args){
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int num=1;
        boolean isBigger=false;

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                if (num>n){
                    isBigger=true;
                    break;
                }
                System.out.print(num + " ");
                num++;
            }
                if (isBigger){
                    break;
                }
            System.out.println();
        }
    }
}
