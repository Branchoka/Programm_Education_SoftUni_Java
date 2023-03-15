package Exam2;

import java.util.Scanner;

public class Spaceship_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double width=Double.parseDouble(scanner.nextLine());
        double length=Double.parseDouble(scanner.nextLine());
        double height=Double.parseDouble(scanner.nextLine());
        double average=Double.parseDouble(scanner.nextLine());

        double spaceRacket=width*length*height;

        double roomSpace=(average+0.40) *2*2;
        int people=(int) (Math.floor(spaceRacket/roomSpace));
        if (people>=3 && people<=10){
            System.out.printf("The spacecraft holds %d astronauts.",people);
        }else if (people<3){
            System.out.println("The spacecraft is too small.");
        }else  if (people>10){
            System.out.println("The spacecraft is too big.");
        }

    }
}
