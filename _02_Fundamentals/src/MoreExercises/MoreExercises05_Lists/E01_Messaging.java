package MoreExercises05_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E01_Messaging {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);



        List<Integer> numbersList= Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String text=scanner.nextLine();
        int sum=0;

        String contact="";
        StringBuilder build=new StringBuilder(text);

        for (int i = 0; i < numbersList.size(); i++) {
            int currentNum=numbersList.get(i);
            int number=currentNum;

            while (number>0){
                int lastDigit=number%10;
                sum+=lastDigit;
                number=number /10;
            }
            if (sum>text.length()-1){
                sum=sum-text.length();
            }
            contact=contact+text.charAt(sum);
            String ch=String.valueOf(text.charAt(sum));
            build.deleteCharAt(sum);
            text=build.substring(0);
            sum=0;
        }
        System.out.println(contact);
    }
}
