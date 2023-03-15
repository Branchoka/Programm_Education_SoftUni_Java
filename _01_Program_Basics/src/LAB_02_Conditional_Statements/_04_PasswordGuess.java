package LAB02_Conditional_Statements;

import java.util.Scanner;

public class PasswordGuess04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String pass= scanner.nextLine();
        if (pass.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        }else {
            System.out.println("Wrong password!");
        }

    }
}
