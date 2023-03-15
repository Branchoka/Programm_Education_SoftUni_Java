package FirststepsinJava;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //1.	Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
        //2.	Необходимо количество боя (в литри) - цяло число в интервала [1…100]
        //3.	Количество разредител (в литри) - цяло число в интервала [1…30]
        //4.	Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]
        int nylon=Integer.parseInt(scanner.nextLine());
        int paint=Integer.parseInt(scanner.nextLine());
        int thinner=Integer.parseInt(scanner.nextLine());
        int hours=Integer.parseInt(scanner.nextLine());

        double priceForNylon= (nylon+2)*1.50;
        double priceForPaint=(paint+paint* 10 * 0.01)*14.50;
        double priceForThinner= thinner*5.00;
        double allMaterialsPrice=priceForNylon+ priceForPaint+ priceForThinner+0.40;
        double workersPrice=(allMaterialsPrice*30*0.01)*1;
        double finalPrice=workersPrice+allMaterialsPrice;
        System.out.println(finalPrice);


    }
}
