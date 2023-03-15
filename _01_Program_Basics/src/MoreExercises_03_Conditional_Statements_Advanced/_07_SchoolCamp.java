package P03MoreExercises_ConditionAdvanced;

import java.util.Scanner;

public class E07_SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String season=scanner.nextLine();
        String typeGroup=scanner.nextLine();
        int numChildren=Integer.parseInt(scanner.nextLine());
        int numNights=Integer.parseInt(scanner.nextLine());

        double price=0;
        String sports="";


        if (season.equals("Winter")){
            switch (typeGroup){
                case "girls":
                price=numNights*numChildren*9.60;
                sports="Gymnastics";
                break;
                case "boys":
                price=numChildren*numNights*9.60;
                sports="Judo";
                break;
                case "mixed":
                price=numChildren*numNights*10;
                sports="Ski";
                break;
            }
        }else if (season.equals("Spring")){
            switch (typeGroup){
                case "girls":
                price=numChildren*numNights*7.20;
                sports="Athletics";
                break;
                case "boys":
                price=numChildren*numNights*7.20;
                sports="Tennis";
                break;
                case "mixed":
                price=numChildren*numNights*9.50;
                sports="Cycling";
                break;
            }
        }else if (season.equals("Summer")){
            switch (typeGroup){
                case "girls":
                price=numChildren*numNights*15;
                sports="Volleyball";
                break;
                case "boys":
                price=numChildren*numNights*15;
                sports="Football";
                break;
                case "mixed":
                price=numChildren*numNights*20;
                sports="Swimming";
                break;
            }
        }
        if (numChildren>=10 && numChildren<20){
            price=price-(price*0.05);
        }else if (numChildren>=20 && numChildren<50){
            price=price-(price*0.15);
        }else if (numChildren>=50){
            price=price-(price*0.50);
        }
        System.out.printf("%s %.2f lv.",sports,price);
    }
}
