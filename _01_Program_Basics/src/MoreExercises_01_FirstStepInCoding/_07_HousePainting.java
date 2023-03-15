package P01MoreExersices;

import java.util.Scanner;

public class HousePainting_07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double x=Double.parseDouble(scanner.nextLine());
        double y=Double.parseDouble(scanner.nextLine());
        double h=Double.parseDouble(scanner.nextLine());

        double wall=x*y;
        double window=1.5*1.5;
        double pages=2*wall - 2*window;
        double backWall=x*x;
        double door=1.2*2;
        double totalWalls=2*backWall - door;
        double total=pages + totalWalls;
        double greenPaint=total /3.4;

        double roof= 2* (x * y);
        double doubleTriangle=2 * (x*h/2);
        double totalRoof=roof+doubleTriangle;
        double redPaint=totalRoof/4.3;

        System.out.printf("%.2f\n",greenPaint);
        System.out.printf("%.2f",redPaint);
        
    }
}
