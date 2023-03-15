package LAB_05__WhileLoop;

import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String inputLine=scanner.nextLine();
        int minNum=Integer.MAX_VALUE;
        while (!inputLine.equals("Stop")){
            int currentNum=Integer.parseInt(inputLine);
            if (currentNum<minNum){
                minNum=currentNum;
            }
            inputLine=scanner.nextLine();
        }
        System.out.println(minNum);
    }
}
