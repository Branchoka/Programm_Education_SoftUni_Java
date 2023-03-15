package Exercises07_Generics.SwapBox;

import java.util.ArrayList;
import java.util.List;

public class SwapBox<T> {
    private List<T> elements;

    public SwapBox(){

        this.elements = new ArrayList<>();
    }
    public void add(T element) {
        this.elements.add(element);

    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (T integer : elements) {
            sb.append(String.format("%s: %s",integer.getClass().getName(),integer)).append("\n");
        }
        return sb.toString();
    }
    public void swap(int firstIndex,int secondIndex){
       T firstIndexElement = this.elements.get(firstIndex);
       T secondIndexElement = this.elements.get(secondIndex);

       this.elements.set(firstIndex,secondIndexElement);
       this.elements.set(secondIndex,firstIndexElement);

    }


}
