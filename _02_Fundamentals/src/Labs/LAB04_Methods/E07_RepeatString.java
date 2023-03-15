package LAB04_Methods;

import java.util.Scanner;

public class E07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String inputText=scanner.nextLine();
        int num=Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(num,inputText));

    }
    public static String repeatString(int count,String text){
        String result="";

        for (int i = 0; i < count; i++) {
            result+=text;
        }
        return result;

    }
}
