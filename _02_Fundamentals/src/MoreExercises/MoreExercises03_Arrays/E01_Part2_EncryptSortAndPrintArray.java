package MoreExercises03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E01_Part2_EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int sum=0;

        int[] letterSum=new int[n];
        for (int i = 0; i < n; i++) {
            String str=scanner.nextLine();
            sum=0;
            for (int j = 0; j < str.length(); j++) {
                char chaCurrent=str.charAt(j);
                if (chaCurrent == 'a' || chaCurrent == 'A' || chaCurrent == 'E' || chaCurrent == 'e'
                        || chaCurrent == 'I' || chaCurrent == 'i'
                        || chaCurrent == 'O' || chaCurrent == 'o'
                        || chaCurrent == 'U' || chaCurrent == 'u'){
                    sum+= (str.charAt(j) * str.length());
                }else {
                    sum+= (str.charAt(j) / str.length());
                }
            }
            letterSum[i]=sum;
        }
        Arrays.sort(letterSum);
        for (int let=0; let <=letterSum.length-1;let++){
            System.out.println(letterSum[let]);
        }
    }
}
