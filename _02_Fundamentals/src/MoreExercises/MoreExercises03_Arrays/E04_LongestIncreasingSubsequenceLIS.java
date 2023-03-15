package MoreExercises03_Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E04_LongestIncreasingSubsequenceLIS {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();


        int[] lis;
        int[] len=new int[numbersList.length];
        int[] perv=new int[numbersList.length];
        int maxLength=0;
        int lastIndex=-1;

        for (int i = 0; i < numbersList.length; i++) {
            len[i] = 1;
            perv[i] = -1;

            for (int j = 0; j < i; j++) {
                if (numbersList[j] < numbersList[i] && len[j] >= len[i]) {
                    len[i] = 1 + len[j];
                    perv[i] = j;

                }
            }
            if (len[i] > maxLength) {
                maxLength = len[i];
                lastIndex = i;
            }
        }
        lis=new int[maxLength];
                for (int i = 0; i < maxLength; i++) {

                    lis[i]=numbersList[lastIndex];
                    lastIndex=perv[lastIndex];


        }
        for (int i = lis.length-1; i >= 0; i--) {
            System.out.print(lis[i] + " ");
        }



    }
}
