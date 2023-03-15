package P02MoreExersicesConditional;

import java.util.Scanner;

public class FlowerShop_06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int magnolias=Integer.parseInt(scanner.nextLine());
        int hyacinths=Integer.parseInt(scanner.nextLine());
        int roses=Integer.parseInt(scanner.nextLine());
        int cactus=Integer.parseInt(scanner.nextLine());
        double priceForPresent=Double.parseDouble(scanner.nextLine());

        double priceForMagnolias=magnolias * 3.25;
        double priceForHyacinths=hyacinths * 4;
        double priceForRoses=roses * 3.5;
        double priceForCactus=cactus * 8;

        double sum=priceForMagnolias+priceForHyacinths+priceForRoses+priceForCactus;

        double taxes= sum * 0.05;
        double total=sum-taxes;

        double diff=total-priceForPresent;
        double diff2=priceForPresent-total;

        if (total<priceForPresent){
            System.out.printf("She will have to borrow %.0f leva.",Math.ceil(diff2));
        }else {
            System.out.printf("She is left with %.0f leva.",Math.floor(diff));
        }
    }
}
