package LAB05_Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E01_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //входни данни N числа на 1 ред
        //трябва да се сумира лявата и дясната страна на числата от реда които са еднакви до крайно опростение
        //1.Ако сборът на 2 числа съвпадне с някое от останалите числа, сборът се се събира също с числото
        //2.Винаги се сумира 2те най-леви числа,които са еднакви.


        List<Double> numbersLists= Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numbersLists.size()-1; i++) {
            double currentNum=numbersLists.get(i);
            double nextNum=numbersLists.get(i+1);
            if (currentNum==nextNum){
                numbersLists.set(i, currentNum+nextNum);
                numbersLists.remove(i+1);
                i = -1;
            }
        }

        System.out.println(joinItemByDelimiter(numbersLists," "));

        System.out.println(String.join(", "));
    }
    public static String joinItemByDelimiter(List<Double> list,String delimiter){
        DecimalFormat df=new DecimalFormat("0.#");
        String result="";

        for (double item : list) {
            String numDf = df.format(item) + delimiter;
            result+=numDf;
        }
        return result;
    }
}
