package LAB03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E07_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] numbs= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[]condensed=new int[numbs.length-1];

        for (int i = 0; i < numbs.length; i++) {
            if (numbs.length == 1){
                break;
            }
            if (i == numbs.length-1){
                int[]condensedNew=new int[condensed.length-1];
                i= -1;
                numbs=condensed;
                condensed=condensedNew;
            }else {
                condensed[i]=numbs[i]+ numbs[i+1];
            }
        }
        System.out.println(numbs[0]);
    }
}
