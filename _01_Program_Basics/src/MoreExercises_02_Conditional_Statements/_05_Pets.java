package P02MoreExersicesConditional;

import java.util.Scanner;

public class Pets_05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int days=Integer.parseInt(scanner.nextLine());
        int foodKg=Integer.parseInt(scanner.nextLine());
        double foodForDog=Double.parseDouble(scanner.nextLine());
        double foodForCat=Double.parseDouble(scanner.nextLine());
        double foodForTurtle=Double.parseDouble(scanner.nextLine());
        double foodTurtle=foodForTurtle/1000;

        double neededFoodForDog=days*foodForDog;
        double neededFoodForCat=days*foodForCat;
        double neededFoodForTurtle=days*foodTurtle;

        double total=neededFoodForDog+neededFoodForCat+neededFoodForTurtle;


        if (total<foodKg){
            double diff=foodKg-total;
            System.out.printf("%.0f kilos of food left.",Math.floor(diff));
        }else {
            double diff=total-foodKg;
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(diff));
        }
    }
}
