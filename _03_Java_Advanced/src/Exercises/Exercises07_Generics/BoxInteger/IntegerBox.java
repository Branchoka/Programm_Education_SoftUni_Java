package Exercises07_Generics.BoxInteger;

import java.util.ArrayList;
import java.util.List;

public class IntegerBox<T> {
    private List<T> elements;

    public IntegerBox(){
        this.elements = new ArrayList<>();
    }
    public void add(T element){
        this.elements.add(element);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (T integer : elements) {
            sb.append(String.format("%s: %s",integer.getClass().getName(),integer)).append("\n");
        }
        return sb.toString();
    }
}
