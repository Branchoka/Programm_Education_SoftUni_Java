package LAB_05__WhileLoop;

import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

       String inputLine=scanner.nextLine();
        int maxNum=Integer.MIN_VALUE;
       while (!inputLine.equals("Stop")){
           int currentNum=Integer.parseInt(inputLine);
           if (currentNum>maxNum){
               maxNum=currentNum;
           }
           inputLine=scanner.nextLine();

       }
        System.out.println(maxNum);
    }
}
