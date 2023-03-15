package Exercises_05_WhileLoop;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String wantedBooks=scanner.nextLine();
        String command=scanner.nextLine();
        int countBooks=0;
        boolean isFound=false;
        while (!command.equals("No More Books")){

            if (command.equals(wantedBooks)) {
                isFound = true;
                break;
            }
            countBooks++;

            command=scanner.nextLine();

        }
        if (isFound){
            System.out.printf("You checked %d books and found it.",countBooks);
        }else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",countBooks);
        }
    }
}
