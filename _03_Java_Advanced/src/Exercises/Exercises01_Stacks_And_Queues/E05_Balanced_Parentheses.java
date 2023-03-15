package Exercises01_Stacks_And_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E05_Balanced_Parentheses {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String input=scanner.nextLine();

        ArrayDeque<Character> openedBracket=new ArrayDeque<>();
        boolean areBalanced=false;

        for (char bracket: input.toCharArray()){
            if (bracket == '(' || bracket == '[' || bracket == '{'){
                openedBracket.push(bracket);
            }
           else if (bracket == ')' || bracket == ']' || bracket == '}'){
                if (openedBracket.isEmpty()) {
                    areBalanced=false;
                    break;
                }
                char lastOpenBracket = openedBracket.pop();

               if (lastOpenBracket == '(' && bracket == ')'){
                    areBalanced=true;
               }
               else if (lastOpenBracket == '[' && bracket == ']'){
                   areBalanced=true;
               }
               else if (lastOpenBracket == '{' && bracket == '}'){
                   areBalanced=true;
               }else {
                   areBalanced=false;
                   break;
               }
           }
        }
            if (areBalanced){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
    }
}
