package Exercises05_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E08_AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //MERGE,DIVIDE

        List<String> inputList= Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

         String command=scanner.nextLine();

         while (!command.equals("3:1")){
            if (command.contains("merge")){
                int startIndex=Integer.parseInt(command.split(" ")[1]);
                int endIndex=Integer.parseInt(command.split(" ")[2]);

                if (startIndex<0){
                    startIndex=0;
                }else if (endIndex>inputList.size()-1){
                    endIndex=inputList.size()-1;
                }

                boolean isValidIndexes=startIndex <=inputList.size()-1 && endIndex>=0 && startIndex<endIndex;

                if (isValidIndexes){
                    String resultMerge="";
                    for (int index = startIndex; index <= endIndex; index++) {
                            String currentText=inputList.get(index);
                            resultMerge+=currentText;
                    }
                    for (int index = startIndex; index <= endIndex; index++) {
                        inputList.remove(startIndex);
                    }
                    inputList.add(startIndex,resultMerge);
                }
            }else if (command.contains("divide")){
                int index=Integer.parseInt(command.split(" ")[1]);
                int parts=Integer.parseInt(command.split(" ")[2]);

                String elementForDivide=inputList.get(index);
                inputList.remove(index);

                int partSide=elementForDivide.length()/parts;

                int beginIndexOfText=0;

                for (int part = 1; part < parts; part++) {
                    inputList.add(index,elementForDivide.substring(beginIndexOfText,beginIndexOfText+partSide));
                    index++;
                    beginIndexOfText+=partSide;
                }
                inputList.add(index,elementForDivide.substring(beginIndexOfText));
            }
            command=scanner.nextLine();
         }
        for (String text:inputList){
            System.out.print(" " + text);
        }


    }
}
