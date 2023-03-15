package Exercises04_Methods;

import java.util.Scanner;

public class E04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String password=scanner.nextLine();
        boolean isPasswordLengthValid=isValidLength(password);

        if (!isPasswordLengthValid){
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isPasswordContestValid=isValidContent(password);
        if (!isPasswordContestValid){
            System.out.println("Password must consist only of letters and digits");
        }
        boolean isPasswordCountOfDigitValid=isValidCountOfDigits(password);
        if (!isPasswordCountOfDigitValid){
            System.out.println("Password must have at least 2 digits");
        }
        if (isPasswordLengthValid && isPasswordContestValid && isPasswordCountOfDigitValid){
            System.out.println("Password is valid");
        }




    }
    private static boolean isValidLength(String password){
        if (password.length()>=6 && password.length()<=10){
            return true;
        }
        else {
            return false;
        }
    }
    private static boolean isValidContent(String password){
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)){
                return false;
                }
            }
        return true;
    }
    private static boolean isValidCountOfDigits(String password){
        int countDigits=0;

        for (char symbol : password.toCharArray()){
            if (Character.isDigit(symbol)){
                countDigits++;
            }
        }
            if (countDigits>=2){
                return true;
            }else {
                return false;
            }
    }
}
